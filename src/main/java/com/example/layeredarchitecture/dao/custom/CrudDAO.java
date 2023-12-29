package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.entity.Item;
import com.example.layeredarchitecture.entity.Order;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T> {
    ArrayList<T> getAll() throws SQLException, ClassNotFoundException;
    boolean save(Order dto) throws SQLException, ClassNotFoundException;
    boolean update(Item dto) throws SQLException, ClassNotFoundException;
    boolean exist(String id) throws SQLException, ClassNotFoundException;
    boolean delete(String id) throws SQLException, ClassNotFoundException;
    String generateId() throws SQLException, ClassNotFoundException;
    public T search(String id) throws SQLException, ClassNotFoundException;
}
