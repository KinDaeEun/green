package com.green.shopping1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.shopping1.dao.ItemDao;
import com.green.shopping1.model.Item;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao id;

	public List<Item> list() {
		
		return id.list();
	}
}
