package com.amplitude.api;

import org.json.JSONException;
import org.json.JSONObject;

public class Revenue {
    public static final String TAG = "com.amplitude.api.Revenue";
    private static AmplitudeLog logger = AmplitudeLog.getLogger();
    public Double price = null;
    public String productId = null;
    public JSONObject properties = null;
    public int quantity = 1;
    public String receipt = null;
    public String receiptSig = null;
    public String revenueType = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Revenue revenue = (Revenue) obj;
        if (this.quantity != revenue.quantity) {
            return false;
        }
        String str = this.productId;
        if (str == null ? revenue.productId != null : !str.equals(revenue.productId)) {
            return false;
        }
        Double d = this.price;
        if (d == null ? revenue.price != null : !d.equals(revenue.price)) {
            return false;
        }
        String str2 = this.revenueType;
        if (str2 == null ? revenue.revenueType != null : !str2.equals(revenue.revenueType)) {
            return false;
        }
        String str3 = this.receipt;
        if (str3 == null ? revenue.receipt != null : !str3.equals(revenue.receipt)) {
            return false;
        }
        String str4 = this.receiptSig;
        if (str4 == null ? revenue.receiptSig != null : !str4.equals(revenue.receiptSig)) {
            return false;
        }
        JSONObject jSONObject = this.properties;
        JSONObject jSONObject2 = revenue.properties;
        if (jSONObject != null) {
            if (Utils.compareJSONObjects(jSONObject, jSONObject2)) {
                return true;
            }
        } else if (jSONObject2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.productId;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.quantity) * 31;
        Double d = this.price;
        int hashCode2 = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.revenueType;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.receipt;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.receiptSig;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.properties;
        if (jSONObject != null) {
            i2 = jSONObject.hashCode();
        }
        return hashCode5 + i2;
    }

    public boolean isValidRevenue() {
        if (this.price != null) {
            return true;
        }
        logger.w(TAG, "Invalid revenue, need to set price");
        return false;
    }

    public Revenue setEventProperties(JSONObject jSONObject) {
        this.properties = Utils.cloneJSONObject(jSONObject);
        return this;
    }

    public Revenue setPrice(double d) {
        this.price = Double.valueOf(d);
        return this;
    }

    public Revenue setProductId(String str) {
        if (Utils.isEmptyString(str)) {
            logger.w(TAG, "Invalid empty productId");
            return this;
        }
        this.productId = str;
        return this;
    }

    public Revenue setQuantity(int i2) {
        this.quantity = i2;
        return this;
    }

    public Revenue setReceipt(String str, String str2) {
        this.receipt = str;
        this.receiptSig = str2;
        return this;
    }

    public Revenue setRevenueProperties(JSONObject jSONObject) {
        logger.w(TAG, "setRevenueProperties is deprecated, please use setEventProperties instead");
        return setEventProperties(jSONObject);
    }

    public Revenue setRevenueType(String str) {
        this.revenueType = str;
        return this;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = this.properties;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(Constants.AMP_REVENUE_PRODUCT_ID, this.productId);
            jSONObject.put(Constants.AMP_REVENUE_QUANTITY, this.quantity);
            jSONObject.put(Constants.AMP_REVENUE_PRICE, this.price);
            jSONObject.put(Constants.AMP_REVENUE_REVENUE_TYPE, this.revenueType);
            jSONObject.put(Constants.AMP_REVENUE_RECEIPT, this.receipt);
            jSONObject.put(Constants.AMP_REVENUE_RECEIPT_SIG, this.receiptSig);
        } catch (JSONException e2) {
            logger.e(TAG, String.format("Failed to convert revenue object to JSON: %s", new Object[]{e2.toString()}));
        }
        return jSONObject;
    }
}
