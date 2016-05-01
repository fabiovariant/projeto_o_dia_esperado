package br.com.unasp.projeto.repository.login;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.unasp.projeto.models.GroomsModel;

@Repository(value = "loginDao")
public class LoginDaoImpl implements LoginDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public GroomsModel doLogin(String email, String password) {

        try {
        	GroomsModel groomsModel = (GroomsModel) entityManager
        			.createQuery("SELECT u from GroomsModel u where u.groomsEmail = :userEmail and u.grPassword = :password")
                       .setParameter("userEmail", email)
                       .setParameter("password", password).getSingleResult();

            return groomsModel;
      } catch (NoResultException e) {
            return new GroomsModel();
      }
	}

}
