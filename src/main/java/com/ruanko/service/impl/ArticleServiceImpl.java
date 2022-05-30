package com.ruanko.service.impl;

import com.ruanko.dao.ArticleDao;
import com.ruanko.entity.Article;
import com.ruanko.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
* Title: ArticleServiceImpl
* Description: 
* 小组操作实现类
* Version:1.0.0  

 */
@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	/**
	 * 添加
	 *
	 * @param article
	 * 			文章
	 */
	public void add(Article article) {
		articleDao.save(article);
	}

	/**
	 * 删除
	 *
	 * @param id
	 * 			文章編号
	 */
	public void delete(int id) {
		articleDao.deleteById(id);
	}

	/**
	 * 更新
	 *
	 * @param article
	 * 			文章
	 *
	 */
	public void update(Article article) {
		articleDao.save(article);
	}

	/**
	 * 得到一个文章
	 *
	 * @param id
	 * 			文章编号
	 *
	 * @return 文章
	 */
	public Article get(int id) {
		return articleDao.getOne(id);
	}

	/**
	 * 得到所有文章
	 *
	 * @return 所有文章
	 */
	public List<Article> getAll(){
		return articleDao.findAll();
	}

}
