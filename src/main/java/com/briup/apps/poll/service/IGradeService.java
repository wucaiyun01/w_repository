package com.briup.apps.poll.service;

import java.util.List;


import com.briup.apps.poll.bean.Grade;

public interface IGradeService {
	List<Grade> findAll() throws Exception;
	
	List<Grade> query(String keywords) throws Exception;
	
	void save(Grade grade) throws Exception;
	
	void update(Grade grade) throws Exception;
	
	void deleteById(long id) throws Exception;
	
	void batchDelete(long[] ids) throws Exception;

}
