package com.ecommerce.dao;

import com.ecommerce.db.DBConnection;
import com.ecommerce.model.Product;
import java.sql.*;
import java.util.*;

public class ProductDAO {
    public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getInt("stock")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
