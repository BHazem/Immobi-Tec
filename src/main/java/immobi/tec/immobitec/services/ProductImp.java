package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Product;
import immobi.tec.immobitec.repositories.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductImp implements IProduct {
    @Autowired
    ProductRepo productRepo;

    @Override
    public Product addProduct(Product p) {
        return productRepo.save(p);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductByid(int id_product) {
        return productRepo.findById(id_product).orElse(null);
    }


    @Override
    public void deleteProduct(int id_product) {
        productRepo.deleteById(id_product);

    }

    @Override
    public Product updateProduct(Product p) {
        return productRepo.save(p);
    }
}
