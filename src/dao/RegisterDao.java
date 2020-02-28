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

public HrDto login(HrDto register) {
	EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("jobprofile");
	EntityManager entityManager=entityManagerFactor.createEntityManager();

	try {
	TypedQuery<HrDto> query=entityManager.createQuery("from HrDto where name=:username",HrDto.class);
	query.setParameter("username",register.getUsername());
	query.setParameter("password",register.getPassword());
	return query.getSingleResult();
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
	
	
	
	
}
	
}
