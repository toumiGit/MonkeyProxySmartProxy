package services;

import buisiness.ProductServicesImpl;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class ProductCatalog {

    ProductServicesImpl productServices = new ProductServicesImpl();
    @WebMethod
    public List<String> getProductCategories()
    {
        return productServices.getProductCategories();
    }

    public List<String> getProducts(String categorie)
    {
        return productServices.getProducts(categorie);
    }

}
