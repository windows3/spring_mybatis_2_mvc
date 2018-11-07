package com.windows3.dao;

import com.windows3.po.OrderItem;
import com.windows3.po.OrderList;

import java.util.List;

/**
 * Created by 3 on 2018/3/3.
 */
public interface OrderItemDao {
    List<OrderItem>  findOrderItemByOrderList(OrderList orderList);
}
