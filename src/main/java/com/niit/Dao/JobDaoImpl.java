package com.niit.Dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Model.Job;

@Repository
@Transactional
public class JobDaoImpl implements JobDao {

	@Autowired
	private SessionFactory sesstionFactory;
	public void saveJob(Job job) {
		
		Session session=sesstionFactory.getCurrentSession();
		session.save(job);
	}

}
