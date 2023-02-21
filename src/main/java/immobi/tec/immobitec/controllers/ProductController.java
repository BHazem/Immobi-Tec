package immobi.tec.immobitec.controllers;

import immobi.tec.immobitec.entities.Product;
import immobi.tec.immobitec.services.IProduct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductController {
    @Autowired
    IProduct iProduct;

    @PostMapping("/addProduct")
    @ResponseBody
    public Product addProduct(@RequestBody Product p){
        return iProduct.addProduct(p);
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        return iProduct.getAllProducts();
    }



    @GetMapping("/getProductByid/{id_product}")
    public Product getProductById(@PathVariable ("id_product") int id_product){
        return iProduct.getProductByid(id_product);
    }


    @DeleteMapping("/deleteProduct/{id_product}")
    public void deleteProduct(@PathVariable ("id_product") int id_product){
        iProduct.deleteProduct(id_product);
    }



    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product)

    {
        iProduct.updateProduct(product);
        return product;
    }






}
