package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Product;

import java.util.List;

public interface IProduct {

    public Product addProduct(Product p);
    public List<Product> getAllProducts();
    public Product getProductByid(int id_product);
    public void deleteProduct(int id_product);

    public Product updateProduct(Product p);
}
