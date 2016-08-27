package com.cbt.service;

import org.springframework.transaction.annotation.Transactional;

import com.cbt.dao.ProductDao;
import com.cbt.domain.Product;
@Transactional
public class ProductService {
	//注入持久化类
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	public void save(Product product){
		System.out.println("ProductService中的save方法执行了");
		productDao.save(product);
	}
}
