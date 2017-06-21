/**
 * This class is generated by jOOQ
 */
package com.duoduo.schema.tables.records;


import com.duoduo.schema.tables.Shop;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShopRecord extends UpdatableRecordImpl<ShopRecord> implements Record7<Long, String, String, String, String, String, String> {

    private static final long serialVersionUID = 46434030;

    /**
     * Setter for <code>duoduo_order.shop.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>duoduo_order.shop.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>duoduo_order.shop.shop_id</code>.
     */
    public void setShopId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>duoduo_order.shop.shop_id</code>.
     */
    public String getShopId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>duoduo_order.shop.shop_name</code>.
     */
    public void setShopName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>duoduo_order.shop.shop_name</code>.
     */
    public String getShopName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>duoduo_order.shop.account</code>.
     */
    public void setAccount(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>duoduo_order.shop.account</code>.
     */
    public String getAccount() {
        return (String) get(3);
    }

    /**
     * Setter for <code>duoduo_order.shop.token</code>.
     */
    public void setToken(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>duoduo_order.shop.token</code>.
     */
    public String getToken() {
        return (String) get(4);
    }

    /**
     * Setter for <code>duoduo_order.shop.cookie</code>.
     */
    public void setCookie(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>duoduo_order.shop.cookie</code>.
     */
    public String getCookie() {
        return (String) get(5);
    }

    /**
     * Setter for <code>duoduo_order.shop.json_data</code>.
     */
    public void setJsonData(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>duoduo_order.shop.json_data</code>.
     */
    public String getJsonData() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Shop.SHOP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Shop.SHOP.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Shop.SHOP.SHOP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Shop.SHOP.ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Shop.SHOP.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Shop.SHOP.COOKIE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Shop.SHOP.JSON_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getShopName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCookie();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getJsonData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRecord value2(String value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRecord value3(String value) {
        setShopName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRecord value4(String value) {
        setAccount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRecord value5(String value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRecord value6(String value) {
        setCookie(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRecord value7(String value) {
        setJsonData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShopRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShopRecord
     */
    public ShopRecord() {
        super(Shop.SHOP);
    }

    /**
     * Create a detached, initialised ShopRecord
     */
    public ShopRecord(Long id, String shopId, String shopName, String account, String token, String cookie, String jsonData) {
        super(Shop.SHOP);

        set(0, id);
        set(1, shopId);
        set(2, shopName);
        set(3, account);
        set(4, token);
        set(5, cookie);
        set(6, jsonData);
    }
}
