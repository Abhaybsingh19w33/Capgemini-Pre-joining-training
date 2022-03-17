package Abhay.dao;

import Abhay.entity.Product;

public class ProductDaoJdbcImpl implements ProductDao {
    @Override
    public Product getProduct(int id) {
        System.out.println("Getting a product om DATABASE...");
        return null;
    }

    @Override
    public void saveProduct (Product p) {
        System.out.println ("Saving a product to DATABASE... ");
    }

    @Override
    public void updateProduct (Product p) {
        System.out.println ("Updat ing a product to DATABASE... ");
    }
    @Override
    public void deleteProduct (int id)  {
        System.out.println ("Deleting a product from DATABASE... ");
    }
}
