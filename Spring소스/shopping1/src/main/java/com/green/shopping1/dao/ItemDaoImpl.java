package com.green.shopping1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.green.shopping1.model.Item;

@Repository
public class ItemDaoImpl implements ItemDao {
	
	@Autowired
	private JdbcTemplate jt;


	public List<Item> list() {
		List<Item> list = jt.query("select * from item order by itemId",
				new BeanPropertyRowMapper<Item>(Item.class));
		return list;
	}
}
