package Abhay.dao;

import Abhay.entity.Product;

public class ProductDaoFileImpl implements ProductDao {
    @Override
    public Product getProduct(int id) {
        System.out.println("Getting a product om FILE...");
        return null;
    }

    @Override
    public void saveProduct (Product p) {
        System.out.println ("Saving a product to FILE... ");
    }

    @Override
    public void updateProduct (Product p) {
        System.out.println ("Updat ing a product to FILE... ");
    }
    @Override
    public void deleteProduct (int id)  {
        System.out.println ("Deleting a product from FILE... ");
    }
}