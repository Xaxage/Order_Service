package com.xaxage.order_service.repository;

import com.xaxage.order_service.model.Product;
import com.xaxage.order_service.model.ProductStatus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ActiveProfiles("local")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;


    @Test
    void testSaveProduct() {
        Product product = new Product();
        product.setProductStatus(ProductStatus.NEW);
        product.setDescription("PRODUCT!");

        Product savedProduct = productRepository.save(product);

        Product fetchedProduct = productRepository.getById(product.getId());

        assertNotNull(fetchedProduct);
        assertNotNull(fetchedProduct.getDescription());
        assertNotNull(fetchedProduct.getCreationDate());
        assertNotNull(fetchedProduct.getLastModifiedDate());
    }

}