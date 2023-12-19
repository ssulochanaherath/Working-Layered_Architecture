package com.example.layeredarchitecture.dao;

import java.sql.SQLException;

public class OrderDetailDAOImpl implements OrderDetailDAO {
    @Override
    public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("INSERT INTO OrderDetail VALUES(?,?,?,?)",
                dto.getOid(),
                dto.getItemCode(),
                dto.getQty(),
                dto.getUnitPrice());
    }
}