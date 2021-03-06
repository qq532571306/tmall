package com.how2java.tmall.service;

import java.util.List;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page;

public interface CategoryService {

	List<Category> list(Page page);
	int total();
	void add(Category category);
	void delete(int id);
	Category get(int id);
	void update(Category category);
}
