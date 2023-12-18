package com.example.layeredarchitecture.dao;

import java.sql.SQLException;

public interface OrderDAO {
    String generateOrderId() throws SQLException, ClassNotFoundException ;
}
