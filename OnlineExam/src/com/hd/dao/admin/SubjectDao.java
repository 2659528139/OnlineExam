package com.hd.dao.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hd.entity.admin.Subject;

/**
 * ѧ��רҵdao��
 * 
 *
 */
@Repository
public interface SubjectDao {
	public int add(Subject subject);//���
	public int edit(Subject subject);//�༭����
	public List<Subject> findList(Map<String, Object> queryMap);//��ѯ
	public int delete(Long id);//ɾ��
	public Integer getTotal(Map<String, Object> queryMap);//��ȡsubject�ܼ�¼��
	public Subject findById(Long id);
}
