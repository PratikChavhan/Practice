package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int save(Product p) {
		return jdbcTemplate.update("insert into product100 values(?,?,?,?)", new Object[] {p.getPid(), p.getPname(), p.getQty(), p.getPrice()});
	}
	
}
