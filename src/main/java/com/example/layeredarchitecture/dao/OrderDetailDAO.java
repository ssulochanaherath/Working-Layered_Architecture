package com.example.layeredarchitecture.dao;

import java.sql.SQLException;

public interface OrderDetailDAO {
    public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;
}
