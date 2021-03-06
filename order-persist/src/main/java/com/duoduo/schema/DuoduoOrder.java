/**
 * This class is generated by jOOQ
 */
package com.duoduo.schema;


import com.duoduo.schema.tables.Configuration;
import com.duoduo.schema.tables.Order;
import com.duoduo.schema.tables.RechangeGood;
import com.duoduo.schema.tables.RetreatGood;
import com.duoduo.schema.tables.Shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class DuoduoOrder extends SchemaImpl {

    private static final long serialVersionUID = -1569088742;

    /**
     * The reference instance of <code>duoduo_order</code>
     */
    public static final DuoduoOrder DUODUO_ORDER = new DuoduoOrder();

    /**
     * The table <code>duoduo_order.configuration</code>.
     */
    public final Configuration CONFIGURATION = com.duoduo.schema.tables.Configuration.CONFIGURATION;

    /**
     * The table <code>duoduo_order.order</code>.
     */
    public final Order ORDER = com.duoduo.schema.tables.Order.ORDER;

    /**
     * The table <code>duoduo_order.rechange_good</code>.
     */
    public final RechangeGood RECHANGE_GOOD = com.duoduo.schema.tables.RechangeGood.RECHANGE_GOOD;

    /**
     * The table <code>duoduo_order.retreat_good</code>.
     */
    public final RetreatGood RETREAT_GOOD = com.duoduo.schema.tables.RetreatGood.RETREAT_GOOD;

    /**
     * The table <code>duoduo_order.shop</code>.
     */
    public final Shop SHOP = com.duoduo.schema.tables.Shop.SHOP;

    /**
     * No further instances allowed
     */
    private DuoduoOrder() {
        super("duoduo_order", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Configuration.CONFIGURATION,
            Order.ORDER,
            RechangeGood.RECHANGE_GOOD,
            RetreatGood.RETREAT_GOOD,
            Shop.SHOP);
    }
}
