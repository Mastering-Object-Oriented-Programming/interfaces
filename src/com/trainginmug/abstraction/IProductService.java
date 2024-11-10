package com.trainginmug.abstraction;

public interface IProductService {

    //contains only abstract classes
    void addProduct(Product product);//public abstract (by default)
    void getProduct(int id);
}
