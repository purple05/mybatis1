package cn.com.mybatis.mapper;

import java.util.List;

import cn.com.mybatis.bean.Orders;

public interface OrdersMapper {
	List<Orders> findOrdersUser();
	List<Orders> findOrdersUserdetail();
}
