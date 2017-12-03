package com.niit.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Model.Person;

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao{

	
			@Autowired
		private SessionFactory sessionFactory;
			public List<Person> getAllPersons() {
				Session session=sessionFactory.getCurrentSession();
				Query query=session.createQuery("from Person");//select * from person_s180133
				return query.list();
			}
			public void savePerson(Person person) {
				Session session=sessionFactory.getCurrentSession();
				session.save(person);
			}
			public void deletePerson(int id) {
				Session session=sessionFactory.getCurrentSession();
				Person person=(Person)session.get(Person.class, id);
				session.delete(person);
			}
			public Person getPerson(int id) {
				Session session=sessionFactory.getCurrentSession();
				Person person=(Person)session.get(Person.class, id);
				return person;
			}
			public void updatePerson(Person person) {
				Session session=sessionFactory.getCurrentSession();
				session.update(person);
				
			}

	
	
}
