package Abhay.dao;

public class DaoFactory
{
    public static ProductDao getProductDao(String type) {
        if (type.equalsIgnoreCase("file")){
            return new ProductDaoFileImpl();
        }
        else if (type.equalsIgnoreCase("jdbc")){
            return new ProductDaoJdbcImpl();
        }

        return null;
    }
}
