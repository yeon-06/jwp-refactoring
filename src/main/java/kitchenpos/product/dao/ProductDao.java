package kitchenpos.product.dao;

import java.util.List;
import java.util.Optional;
import kitchenpos.product.domain.Product;

public interface ProductDao {
    Product save(Product entity);

    Optional<Product> findById(Long id);

    List<Product> findAll();

    List<Product> findByIdIn(List<Long> productIds);
}