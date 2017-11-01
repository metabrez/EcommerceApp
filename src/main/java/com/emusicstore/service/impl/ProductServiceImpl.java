package com.emusicstore.service.impl;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import com.emusicstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by shams on 4/20/2017.
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public Product getProductById(int productId) {

        return productDao.getProductById(productId);


    }

    public List<Product> getProductList() {

        return productDao.getProductList();


    }

   /* @Override
    public Product getProductById(int id) {
        return null;
    }*/

    public void addProduct() {
        addProduct();
    }

    public void addProduct(Product product) {

        productDao.addProduct(product);
    }

    public void editProduct(Product product) {

        productDao.editProduct(product);
    }

    public void deleteProduct(Product product) {

        productDao.deleteProduct(product);
    }
}
