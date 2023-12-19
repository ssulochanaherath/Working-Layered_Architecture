package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
     ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;
     boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;
     boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;
     boolean delete(String id) throws SQLException, ClassNotFoundException ;
     String generateNewId() throws SQLException, ClassNotFoundException;
     boolean existCustomer(String id) throws SQLException, ClassNotFoundException;
     public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;
}
