package com.windows3.dao;

import com.windows3.po.OrderList;

import java.util.List;

/**
 * Created by 3 on 2018/3/3.
 */
public interface OrderListDao {
   List<OrderList> findOrderListByCid(int cid);
}

