package com.ruanko.service;


import com.ruanko.entity.Article;

import java.util.List;

/**
 * 
* Title: ArticleService
* Description: 
* 小组接口
* Version:1.0.0  

 */
public interface ArticleService {

	void add(Article article);
	void delete(int id);
	void update(Article article);
	Article get(int id);
	List<Article> getAll();
}
