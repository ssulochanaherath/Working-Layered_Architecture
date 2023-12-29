package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dto.OrderDetailDTO;

public interface OrderDetailDAO extends CrudDAO<OrderDetailDTO>{
    boolean save(OrderDetailDTO detail);
}
