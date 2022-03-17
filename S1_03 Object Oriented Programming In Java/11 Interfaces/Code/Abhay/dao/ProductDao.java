package Abhay.dao;

import Abhay.entity.Product;

public interface ProductDao {
    public Product getProduct(int id);
    public void saveProduct( Product p);
    public void updateProduct( Product p);
    public void deleteProduct(int id);
}