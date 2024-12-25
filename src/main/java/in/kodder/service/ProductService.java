package in.kodder.service;

import in.kodder.model.Product;
import in.kodder.payload.ProductDTO;

public interface ProductService {
    ProductDTO addProduct(Long categoryId, Product product);
}
