package guru.springframework.services;


import guru.springframework.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);
    void deleteProductById(Integer id);

    Product saveProduct(Product product);
}
