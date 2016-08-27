package com.cbt.action;

import com.cbt.domain.Product;
import com.cbt.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	private static final long serialVersionUID = 1L;
	//模型驱动使用的类
	private Product product = new Product();
	@Override
	public Product getModel() {
		return product;
	}
	
	//Struts和Spring整合过程中按名称自动装配业务层的类
	private ProductService productService;

	public String save(){
		System.out.println("Action中的Save方法执行了");
		productService.save(product);
		return NONE;
	}
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}
