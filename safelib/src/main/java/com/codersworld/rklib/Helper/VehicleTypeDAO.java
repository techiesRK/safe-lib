package com.codersworld.rklib.Helper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.codersworld.rklib.DocumentManagment.Dbvehicletype;
import com.codersworld.rklib.Helper.DbVehicletype;

import java.util.ArrayList;

public class VehicleTypeDAO {

    private static final String TABLE_VEHICLE_TYPE = "Vehicle_Type";

    // Contacts Table Columns names
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_VEHICLE_TYPE = "vehicle_type";

    private SQLiteDatabase mDatabase;
    private Context mContext;

    public VehicleTypeDAO(SQLiteDatabase database, Context context) {
        mDatabase = database;
        mContext = context;
    }


    public static String getCreateTableVehicleType() {
        String CREATE_WORK_DETAILS_TABLE = "CREATE TABLE " + TABLE_VEHICLE_TYPE
                + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY,"
                + COLUMN_VEHICLE_TYPE + " TEXT )";
        return CREATE_WORK_DETAILS_TABLE;
    }

    public static String getDropTableVehicleTYPE() {
        return "DROP TABLE IF EXISTS " + TABLE_VEHICLE_TYPE;
    }


    public void deleteAll() {

        String delete_all_users = " DELETE "
                + " FROM "
                + TABLE_VEHICLE_TYPE;
        mDatabase.execSQL(delete_all_users);
    }


    public void insert(ArrayList<Dbvehicletype> workArrayList) {
        for (Dbvehicletype address : workArrayList) {
            String[] bindArgs = {
                    address.getmvehicletype(),
            };
            String insertUser = " INSERT INTO "
                    + TABLE_VEHICLE_TYPE
                    + " ( "
                    + COLUMN_VEHICLE_TYPE
                    + " ) "
                    + " VALUES "
                    + " (?)";

            mDatabase.execSQL(insertUser, bindArgs);
        }
    }



    public ArrayList<DbVehicletype> selectAll() {

        String getAllWorkDetails = " SELECT "
                + " * "
                + " FROM "
                + TABLE_VEHICLE_TYPE;

        Cursor cursor = mDatabase.rawQuery(getAllWorkDetails, null);
        ArrayList<DbVehicletype> dataList = manageCursor(cursor);
        closeCursor(cursor);
        return dataList;
    }

    @SuppressLint("Range")
    protected DbVehicletype cursorToData(Cursor cursor) {
        DbVehicletype work = new DbVehicletype();
        //work.set(cursor.getInt(cursor.getColumnIndex(COLUMN_ID)));
        work.setmId(cursor.getInt(cursor.getColumnIndex(COLUMN_ID)));
        work.setmvehicletype(cursor.getString(cursor.getColumnIndex(COLUMN_VEHICLE_TYPE)));
        return work;
    }

    protected void closeCursor(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    protected ArrayList<DbVehicletype> manageCursor(Cursor cursor) {
        ArrayList<DbVehicletype> dataList = new ArrayList<DbVehicletype>();

        if (cursor != null) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                DbVehicletype model = cursorToData(cursor);
                if (model != null) {
                    dataList.add(model);
                }
                cursor.moveToNext();
            }
        }
        return dataList;
    }
}
