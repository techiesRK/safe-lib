package com.codersworld.rklib.Helper;

import java.io.Serializable;

public class ItemMasterhelper implements Serializable {
    String companyid, ItemID, ItemName, GroupID, OpeningStock, MOQ, ROQ, PurchaseUOM, PurchaseUOMId, SaleUOM, SaleUOMID, PurchaseRate, SaleRate, ItemSKU, ItemBarcode, StockUOM, ItemImage, HSNCode;
    int mId;
    String FileName;
    String filepath;
    private String quantity = "0";
    String VendorID;
    String ToShow;
    String AvailableQty;
    String StoreSTatus;

    public String getVendorID() {
        return VendorID;
    }

    public void setVendorID(String vendorID) {
        VendorID = vendorID;
    }

    public String getToShow() {
        return ToShow;
    }

    public void setToShow(String toShow) {
        ToShow = toShow;
    }

    public String getAvailableQty() {
        return AvailableQty;
    }

    public void setAvailableQty(String availableQty) {
        AvailableQty = availableQty;
    }

    public String getStoreSTatus() {
        return StoreSTatus;
    }

    public void setStoreSTatus(String storeSTatus) {
        StoreSTatus = storeSTatus;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String itemID) {
        ItemID = itemID;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getGroupID() {
        return GroupID;
    }

    public void setGroupID(String groupID) {
        GroupID = groupID;
    }

    public String getOpeningStock() {
        return OpeningStock;
    }

    public void setOpeningStock(String openingStock) {
        OpeningStock = openingStock;
    }

    public String getMOQ() {
        return MOQ;
    }

    public void setMOQ(String MOQ) {
        this.MOQ = MOQ;
    }

    public String getROQ() {
        return ROQ;
    }

    public void setROQ(String ROQ) {
        this.ROQ = ROQ;
    }

    public String getPurchaseUOM() {
        return PurchaseUOM;
    }

    public void setPurchaseUOM(String purchaseUOM) {
        PurchaseUOM = purchaseUOM;
    }

    public String getPurchaseUOMId() {
        return PurchaseUOMId;
    }

    public void setPurchaseUOMId(String purchaseUOMId) {
        PurchaseUOMId = purchaseUOMId;
    }

    public String getSaleUOM() {
        return SaleUOM;
    }

    public void setSaleUOM(String saleUOM) {
        SaleUOM = saleUOM;
    }

    public String getSaleUOMID() {
        return SaleUOMID;
    }

    public void setSaleUOMID(String saleUOMID) {
        SaleUOMID = saleUOMID;
    }

    public String getPurchaseRate() {
        return PurchaseRate;
    }

    public void setPurchaseRate(String purchaseRate) {
        PurchaseRate = purchaseRate;
    }

    public String getSaleRate() {
        return SaleRate;
    }

    public void setSaleRate(String saleRate) {
        SaleRate = saleRate;
    }

    public String getItemSKU() {
        return ItemSKU;
    }

    public void setItemSKU(String itemSKU) {
        ItemSKU = itemSKU;
    }

    public String getItemBarcode() {
        return ItemBarcode;
    }

    public void setItemBarcode(String itemBarcode) {
        ItemBarcode = itemBarcode;
    }

    public String getStockUOM() {
        return StockUOM;
    }

    public void setStockUOM(String stockUOM) {
        StockUOM = stockUOM;
    }

    public String getItemImage() {
        return ItemImage;
    }

    public void setItemImage(String itemImage) {
        ItemImage = itemImage;
    }

    public String getHSNCode() {
        return HSNCode;
    }

    public void setHSNCode(String HSNCode) {
        this.HSNCode = HSNCode;
    }


    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public int getmId() {
        return mId;
    }
}
