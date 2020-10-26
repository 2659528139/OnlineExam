package com.hd.dao.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hd.entity.admin.Subject;

/**
 * 学科专业dao层
 * 
 *
 */
@Repository
public interface SubjectDao {
	public int add(Subject subject);//添加
	public int edit(Subject subject);//编辑更新
	public List<Subject> findList(Map<String, Object> queryMap);//查询
	public int delete(Long id);//删除
	public Integer getTotal(Map<String, Object> queryMap);//获取subject总记录数
	public Subject findById(Long id);
}
