package dao;




import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import dto.HrDto;

public class RegisterDao {
public boolean register(HrDto register) {
	
	EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("jobprofile");
	EntityManager entityManager=entityManagerFactor.createEntityManager();
	EntityTransaction transcation=entityManager.getTransaction();

	try {
		transcation.begin();
		entityManager.persist(register);
		transcation.commit();
		return true;
	}catch(Exception e) {
		e.printStackTrace();
		transcation.rollback();
	}
	return false;
	}

public boolean login(String username ,String password) {
	EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("jobprofile");
	EntityManager entityManager=entityManagerFactor.createEntityManager();

	try {
	TypedQuery<HrDto> query=entityManager.createQuery("from HrDto where username=:username and password=:password",HrDto.class);
	query.setParameter("username",username);
	query.setParameter("password",password);
	return true;
	//return query.getSingleResult();
	}catch(Exception e) {
		e.printStackTrace();
		return false;
	}
	
	
	
	
}
	
}
