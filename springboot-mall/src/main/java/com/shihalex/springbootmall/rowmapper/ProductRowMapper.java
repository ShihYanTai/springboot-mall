package com.shihalex.springbootmall.rowmapper;

import com.shihalex.springbootmall.constant.ProductCategory;
import com.shihalex.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();

        product.setProductid(resultSet.getInt("product_id"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock(resultSet.getInt("stock"));
        product.setProductname(resultSet.getString("product_name"));
        String categoryStr = resultSet.getString("category");

        ProductCategory category = ProductCategory.valueOf(categoryStr);
        product.setCategory(category);


        product.setImageUrl(resultSet.getString("image_url"));
        product.setDescription(resultSet.getString("description"));
        product.setCreatedDate(resultSet.getDate("created_date"));
        product.setLastModifiedDate(resultSet.getDate("last_modified_date"));

        return product;
    }
}
