package com.segment.analytics;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.segment.analytics.internal.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Properties extends ValueMap {
    private static final String CATEGORY_KEY = "category";
    private static final String COUPON_KEY = "coupon";
    private static final String CURRENCY_KEY = "currency";
    private static final String DISCOUNT_KEY = "discount";
    private static final String ID_KEY = "id";
    private static final String NAME_KEY = "name";
    private static final String ORDER_ID_KEY = "orderId";
    private static final String PATH_KEY = "path";
    private static final String PRICE_KEY = "price";
    private static final String PRODUCTS_KEY = "products";
    private static final String REFERRER_KEY = "referrer";
    private static final String REPEAT_KEY = "repeat";
    private static final String REVENUE_KEY = "revenue";
    private static final String SHIPPING_KEY = "shipping";
    private static final String SKU_KEY = "sku";
    private static final String SUBTOTAL_KEY = "subtotal";
    private static final String TAX_KEY = "tax";
    private static final String TITLE_KEY = "title";
    private static final String TOTAL_KEY = "total";
    private static final String URL_KEY = "url";
    private static final String VALUE_KEY = "value";

    public static class Product extends ValueMap {
        private static final String ID_KEY = "id";
        private static final String NAME_KEY = "name";
        private static final String PRICE_KEY = "price";
        private static final String SKU_KEY = "sku";

        public Product(String str, String str2, double d) {
            put("id", (Object) str);
            put(SKU_KEY, (Object) str2);
            put(PRICE_KEY, (Object) Double.valueOf(d));
        }

        private Product(Map<String, Object> map) {
            super(map);
        }

        public String id() {
            return getString("id");
        }

        public String name() {
            return getString("name");
        }

        public double price() {
            return getDouble(PRICE_KEY, ShadowDrawableWrapper.COS_45);
        }

        public Product putName(String str) {
            return putValue("name", (Object) str);
        }

        public Product putValue(String str, Object obj) {
            super.putValue(str, obj);
            return this;
        }

        public String sku() {
            return getString(SKU_KEY);
        }
    }

    public Properties() {
    }

    public Properties(int i2) {
        super(i2);
    }

    public Properties(Map<String, Object> map) {
        super(map);
    }

    public String category() {
        return getString("category");
    }

    public String coupon() {
        return getString(COUPON_KEY);
    }

    public String currency() {
        return getString(CURRENCY_KEY);
    }

    public double discount() {
        return getDouble(DISCOUNT_KEY, ShadowDrawableWrapper.COS_45);
    }

    public boolean isRepeatCustomer() {
        return getBoolean(REPEAT_KEY, false);
    }

    public String name() {
        return getString("name");
    }

    public String orderId() {
        return getString(ORDER_ID_KEY);
    }

    public String path() {
        return getString(PATH_KEY);
    }

    public double price() {
        return getDouble(PRICE_KEY, ShadowDrawableWrapper.COS_45);
    }

    public String productId() {
        return getString("id");
    }

    public List<Product> products() {
        return getList(PRODUCTS_KEY, Product.class);
    }

    public List<Product> products(Product... productArr) {
        return products();
    }

    public Properties putCategory(String str) {
        return putValue("category", (Object) str);
    }

    public Properties putCoupon(String str) {
        return putValue(COUPON_KEY, (Object) str);
    }

    public Properties putCurrency(String str) {
        return putValue(CURRENCY_KEY, (Object) str);
    }

    public Properties putDiscount(double d) {
        return putValue(DISCOUNT_KEY, (Object) Double.valueOf(d));
    }

    public Properties putName(String str) {
        return putValue("name", (Object) str);
    }

    public Properties putOrderId(String str) {
        return putValue(ORDER_ID_KEY, (Object) str);
    }

    public Properties putPath(String str) {
        return putValue(PATH_KEY, (Object) str);
    }

    public Properties putPrice(double d) {
        return putValue(PRICE_KEY, (Object) Double.valueOf(d));
    }

    public Properties putProductId(String str) {
        return putValue("id", (Object) str);
    }

    public Properties putProducts(Product... productArr) {
        if (!Utils.isNullOrEmpty((T[]) productArr)) {
            ArrayList arrayList = new ArrayList(productArr.length);
            Collections.addAll(arrayList, productArr);
            return putValue(PRODUCTS_KEY, (Object) Collections.unmodifiableList(arrayList));
        }
        throw new IllegalArgumentException("products cannot be null or empty.");
    }

    public Properties putReferrer(String str) {
        return putValue(REFERRER_KEY, (Object) str);
    }

    public Properties putRepeatCustomer(boolean z) {
        return putValue(REPEAT_KEY, (Object) Boolean.valueOf(z));
    }

    public Properties putRevenue(double d) {
        return putValue(REVENUE_KEY, (Object) Double.valueOf(d));
    }

    public Properties putShipping(double d) {
        return putValue(SHIPPING_KEY, (Object) Double.valueOf(d));
    }

    public Properties putSku(String str) {
        return putValue(SKU_KEY, (Object) str);
    }

    @Deprecated
    public double putSubtotal() {
        return subtotal();
    }

    public Properties putSubtotal(double d) {
        return putValue(SUBTOTAL_KEY, (Object) Double.valueOf(d));
    }

    public Properties putTax(double d) {
        return putValue(TAX_KEY, (Object) Double.valueOf(d));
    }

    public Properties putTitle(String str) {
        return putValue(TITLE_KEY, (Object) str);
    }

    public Properties putTotal(double d) {
        return putValue(TOTAL_KEY, (Object) Double.valueOf(d));
    }

    public Properties putUrl(String str) {
        return putValue(URL_KEY, (Object) str);
    }

    public Properties putValue(double d) {
        return putValue(VALUE_KEY, (Object) Double.valueOf(d));
    }

    public Properties putValue(String str, Object obj) {
        super.putValue(str, obj);
        return this;
    }

    public String referrer() {
        return getString(REFERRER_KEY);
    }

    public double revenue() {
        return getDouble(REVENUE_KEY, ShadowDrawableWrapper.COS_45);
    }

    public double shipping() {
        return getDouble(SHIPPING_KEY, ShadowDrawableWrapper.COS_45);
    }

    public String sku() {
        return getString(SKU_KEY);
    }

    public double subtotal() {
        return getDouble(SUBTOTAL_KEY, ShadowDrawableWrapper.COS_45);
    }

    public double tax() {
        return getDouble(TAX_KEY, ShadowDrawableWrapper.COS_45);
    }

    public String title() {
        return getString(TITLE_KEY);
    }

    public double total() {
        double d = getDouble(TOTAL_KEY, ShadowDrawableWrapper.COS_45);
        if (d != ShadowDrawableWrapper.COS_45) {
            return d;
        }
        double revenue = revenue();
        return revenue != ShadowDrawableWrapper.COS_45 ? revenue : value();
    }

    public String url() {
        return getString(URL_KEY);
    }

    public double value() {
        double d = getDouble(VALUE_KEY, ShadowDrawableWrapper.COS_45);
        return d != ShadowDrawableWrapper.COS_45 ? d : revenue();
    }
}
