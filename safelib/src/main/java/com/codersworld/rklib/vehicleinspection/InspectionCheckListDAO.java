package com.codersworld.rklib.vehicleinspection;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.codersworld.rklib.utils.log;
import com.codersworld.rklib.vehicleinspection.dbinspectionchecklistmodel;

import java.util.ArrayList;

public class InspectionCheckListDAO {
    private static final String TABLE_NAME= "CheckListTemplate";

    // Contacts Table Columns names
    private static final String COLUMN_KEY_ID = "_id";
    private static final String COLUMN_CheckListTemplateID="CheckListTemplateID";
    private static final String COLUMN_Description="Description";
    private static final String COLUMN_VehicleType="VehicleType";
    private static final String COLUMN_ExpiryDateApplicable="ExpiryDateApplicable";
    private static final String COLUMN_CameraApplicable="CameraApplicable";
    private static final String COLUMN_CheckListMasterID="CheckListMasterID";
    private static final String COLUMN_AvgDistanceApplicable="AvgDistanceApplicable";
    private static final String COLUMN_Nooffields="Nooffields";
    private static final String COLUMN_InspGroup="InspGroup";
    private static final String COLUMN_Val1="Val1";
    private static final String COLUMN_Val2="Val2";


    private SQLiteDatabase mDatabase;
    private Context mContext;

    public InspectionCheckListDAO(SQLiteDatabase database, Context context) {
        mDatabase = database;
        mContext = context;
    }

    public static String getCreateTableUpload() {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME
                + "("
                + COLUMN_KEY_ID + " INTEGER PRIMARY KEY,"
                + COLUMN_CheckListTemplateID  + " TEXT ,"
                + COLUMN_Description  + " TEXT ,"
                + COLUMN_VehicleType  + " TEXT ,"
                + COLUMN_ExpiryDateApplicable  + " TEXT ,"
                + COLUMN_CameraApplicable  + " TEXT ,"
                + COLUMN_AvgDistanceApplicable + " TEXT ,"
                + COLUMN_CheckListMasterID + " TEXT ,"
                + COLUMN_Nooffields + " TEXT ,"
                + COLUMN_InspGroup + " TEXT ,"
                + COLUMN_Val1 + " TEXT ,"
                +  COLUMN_Val2 + " TEXT )";
        return CREATE_TABLE;
    }

    public static String getDropTableUpload() {
        return "DROP TABLE IF EXISTS " + TABLE_NAME;
    }

    public void deleteAll() {

        String delete_all = " DELETE "
                + " FROM "
                + TABLE_NAME;
        mDatabase.execSQL(delete_all);
    }

    public void insert(ArrayList<dbinspectionchecklistmodel> arrayList) {

        for (dbinspectionchecklistmodel singleInput : arrayList) {
            String[] bindArgs = {
                    String.valueOf(singleInput.getmCheckListTemplateID()),
                    String.valueOf(singleInput.getmDescription()),
                    String.valueOf(singleInput.getmVehicleType()),
                    String.valueOf(singleInput.getmExpiryDateApplicable()),
                    String.valueOf(singleInput.getmCameraApplicable()),
                    String.valueOf(singleInput.getmAvgDistanceApplicable()),
                    String.valueOf(singleInput.getmCheckListMasterID()),
                    String.valueOf(singleInput.getmNooffields()),
                    String.valueOf(singleInput.getmInspGroup()),
                    String.valueOf(singleInput.getmVal1()),
                    String.valueOf(singleInput.getmVal2()),
            };

            String insertUser = " INSERT INTO "
                    + TABLE_NAME
                    + " ( "
                    + COLUMN_CheckListTemplateID + " , "
                    + COLUMN_Description + " , "
                    + COLUMN_VehicleType + " , "
                    + COLUMN_ExpiryDateApplicable + " , "
                    + COLUMN_CameraApplicable + " , "
                    + COLUMN_AvgDistanceApplicable + " , "
                    + COLUMN_CheckListMasterID + " , "
                    + COLUMN_Nooffields + " , "
                    + COLUMN_InspGroup + " , "
                    + COLUMN_Val1 + " , "
                    + COLUMN_Val2
                    + " ) "
                    + " VALUES "
                    + " (?,?,?,?,?,?,?,?,?,?,?)";
            mDatabase.execSQL(insertUser, bindArgs);
        }
    }

    public int getCurrentItemCount(String id) {

        log.e("id in database=="+id);
        String[] bindArgs = {
                id
        };

        String countQuery = " SELECT  * FROM "
                + TABLE_NAME
                + " WHERE "
                + COLUMN_KEY_ID
                + "= ?";

        Cursor cursor = mDatabase.rawQuery(countQuery, bindArgs);

        return cursor.getCount();
    }

    public ArrayList<dbinspectionchecklistmodel> selectAll() {

        String getAllDetails = " SELECT "
                + " * "
                + " FROM "
                + TABLE_NAME;

        Cursor cursor = mDatabase.rawQuery(getAllDetails, null);
        ArrayList<dbinspectionchecklistmodel> dataList = manageCursor(cursor);
        closeCursor(cursor);

        return dataList;
    }


    public ArrayList<dbinspectionchecklistmodel> selectAlllistgreater(String vals,String tempdetailid) {
        String getAllDetails = " SELECT "
                + " * "
                + " FROM "
                + TABLE_NAME
                + " WHERE "
                + COLUMN_CheckListMasterID
                + " = " + vals + " and " + COLUMN_CheckListTemplateID + ">=" + tempdetailid;

        Cursor cursor = mDatabase.rawQuery(getAllDetails, null);
        ArrayList<dbinspectionchecklistmodel> dataList = manageCursor(cursor);
        closeCursor(cursor);

        return dataList;
    }

    public ArrayList<dbinspectionchecklistmodel> selectAlllist(String vals) {
        String getAllDetails = " SELECT "
                + " * "
                + " FROM "
                + TABLE_NAME
                + " WHERE "
                + COLUMN_CheckListMasterID
                + " = " + vals;


        Cursor cursor = mDatabase.rawQuery(getAllDetails, null);
        ArrayList<dbinspectionchecklistmodel> dataList = manageCursor(cursor);
        closeCursor(cursor);

        return dataList;
    }


    public ArrayList<dbinspectionchecklistmodel> selectTop1CheckList() {
        String getAllDetails = " SELECT  *  FROM " + TABLE_NAME + " Order by _ID Asc LIMIT 1";

        Cursor cursor = mDatabase.rawQuery(getAllDetails, null);
        ArrayList<dbinspectionchecklistmodel> dataList = manageCursor(cursor);
        closeCursor(cursor);

        return dataList;
    }

    public ArrayList<dbinspectionchecklistmodel> selectAllLastIdPhotos(String id) {

        String[] bindArgs = {
                id
        };

        String getAllDetails = " SELECT "
                + " * "
                + " FROM "
                + TABLE_NAME
                + " WHERE "
                + COLUMN_KEY_ID
                + " = ?";
        ;

        Cursor cursor = mDatabase.rawQuery(getAllDetails, bindArgs);
        ArrayList<dbinspectionchecklistmodel> dataList = manageCursor(cursor);
        closeCursor(cursor);

        return dataList;
    }

    public ArrayList<dbinspectionchecklistmodel> selectbasedondescription(String vals) {
        String getAllDetails = " SELECT  *  FROM "
                + TABLE_NAME
                + " WHERE "
                + COLUMN_Description
                + " = '" + vals + "'";
        Cursor cursor = mDatabase.rawQuery(getAllDetails, null);
        ArrayList<dbinspectionchecklistmodel> dataList = manageCursor(cursor);
        closeCursor(cursor);
        return dataList;
    }

    protected dbinspectionchecklistmodel cursorToData(Cursor cursor) {
        dbinspectionchecklistmodel model = new dbinspectionchecklistmodel();
        model.setmCheckListTemplateID(cursor.getString(cursor.getColumnIndex(COLUMN_CheckListTemplateID)));
        model.setmDescription(cursor.getString(cursor.getColumnIndex(COLUMN_Description)));
        model.setmVehicleType(cursor.getString(cursor.getColumnIndex(COLUMN_VehicleType)));
        model.setmExpiryDateApplicable(cursor.getString(cursor.getColumnIndex(COLUMN_ExpiryDateApplicable)));
        model.setmCameraApplicable(cursor.getString(cursor.getColumnIndex(COLUMN_CameraApplicable)));
        model.setmAvgDistanceApplicable(cursor.getString(cursor.getColumnIndex(COLUMN_AvgDistanceApplicable)));
        model.setmCheckListMasterID(cursor.getString(cursor.getColumnIndex(COLUMN_CheckListMasterID)));
        model.setmNooffields(cursor.getString(cursor.getColumnIndex(COLUMN_Nooffields)));
        model.setmInspGroup(cursor.getString(cursor.getColumnIndex(COLUMN_InspGroup)));
        model.setmVal1(cursor.getString(cursor.getColumnIndex(COLUMN_Val1)));
        model.setmVal2(cursor.getString(cursor.getColumnIndex(COLUMN_Val2)));
        return model;
    }

    protected void closeCursor(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    protected ArrayList<dbinspectionchecklistmodel> manageCursor(Cursor cursor) {
        ArrayList<dbinspectionchecklistmodel> dataList = new ArrayList<dbinspectionchecklistmodel>();
        if (cursor != null) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                dbinspectionchecklistmodel singleModel = cursorToData(cursor);
                if (singleModel != null) {
                    dataList.add(singleModel);
                }
                cursor.moveToNext();
            }
        }
        return dataList;
    }
}
