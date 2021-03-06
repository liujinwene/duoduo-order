/**
 * This class is generated by jOOQ
 */
package com.duoduo.schema;


import com.duoduo.schema.tables.Configuration;
import com.duoduo.schema.tables.Order;
import com.duoduo.schema.tables.RechangeGood;
import com.duoduo.schema.tables.RetreatGood;
import com.duoduo.schema.tables.Shop;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in duoduo_order
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>duoduo_order.configuration</code>.
     */
    public static final Configuration CONFIGURATION = com.duoduo.schema.tables.Configuration.CONFIGURATION;

    /**
     * The table <code>duoduo_order.order</code>.
     */
    public static final Order ORDER = com.duoduo.schema.tables.Order.ORDER;

    /**
     * The table <code>duoduo_order.rechange_good</code>.
     */
    public static final RechangeGood RECHANGE_GOOD = com.duoduo.schema.tables.RechangeGood.RECHANGE_GOOD;

    /**
     * The table <code>duoduo_order.retreat_good</code>.
     */
    public static final RetreatGood RETREAT_GOOD = com.duoduo.schema.tables.RetreatGood.RETREAT_GOOD;

    /**
     * The table <code>duoduo_order.shop</code>.
     */
    public static final Shop SHOP = com.duoduo.schema.tables.Shop.SHOP;
}
