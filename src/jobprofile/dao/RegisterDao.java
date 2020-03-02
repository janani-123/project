package jobprofile.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import jobprofile.dto.HrDto;
import jobprofile.dto.Job;

public class RegisterDao {
	public boolean register(HrDto register) {

		EntityManagerFactory entityManagerFactor = Persistence.createEntityManagerFactory("jobprofile");
		EntityManager entityManager = entityManagerFactor.createEntityManager();
		EntityTransaction transcation = entityManager.getTransaction();

		try {
			transcation.begin();
			entityManager.persist(register);
			transcation.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transcation.rollback();
		}
		return false;
	}

	public boolean login(String username, String password) {
		EntityManagerFactory entityManagerFactor = Persistence.createEntityManagerFactory("jobprofile");
		EntityManager entityManager = entityManagerFactor.createEntityManager();

		try {
			TypedQuery<HrDto> query = entityManager
					.createQuery("from HrDto where username=:username and password=:password", HrDto.class);
			query.setParameter("username", username);
			query.setParameter("password", password);
			return true;
			// return query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean addjob(Job add) {

		EntityManagerFactory entityManagerFactor = Persistence.createEntityManagerFactory("jobprofile");
		EntityManager entityManager = entityManagerFactor.createEntityManager();
		EntityTransaction transcation = entityManager.getTransaction();

		try {
			transcation.begin();
			entityManager.persist(add);
			transcation.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transcation.rollback();
		}
		return false;
	}
   public List<Job> display(int id){
	   EntityManagerFactory entityManagerFactor = Persistence.createEntityManagerFactory("jobprofile");
		EntityManager entityManager = entityManagerFactor.createEntityManager();

		try {
			TypedQuery<Job> query = entityManager.createQuery("from HrDto where id=:id ", Job.class);
			
			query.setParameter("id", id);
			return query.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	
	   
   }
}
