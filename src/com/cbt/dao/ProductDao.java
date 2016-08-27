package com.cbt.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cbt.domain.Product;

public class ProductDao extends HibernateDaoSupport{

	public void save(Product product) {
		System.out.println("ProductDao中的save方法执行了");
		getHibernateTemplate().save(product);
	}

}
