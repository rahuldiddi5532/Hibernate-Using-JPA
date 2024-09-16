package org.jsp.merchent.product.app.dao;

import javax.persistence.*;

import org.jsp.merchent.product.app.entity.Merchent;

public class MerchentDao {
	
	private EntityManager entitymanager=Persistence.createEntityManagerFactory("dev").createEntityManager();

	public Merchent saveMerchentDao(Merchent m) {
		EntityTransaction tran=entitymanager.getTransaction();
		tran.begin();
		entitymanager.persist(m);
		tran.commit();
		return m;
	}

	public Merchent updateMerchentDao(Merchent m) {
		Merchent mdb=entitymanager.find(Merchent.class, m.getId());
		if(mdb!=null)
		{
			EntityTransaction tran=entitymanager.getTransaction();
			tran.begin();
			mdb.setName(m.getName());
			mdb.setGst_num(m.getGst_num());
			mdb.setEmail(m.getEmail());
			entitymanager.merge(mdb);
			tran.commit();
		}
		return mdb;
	}

	public Merchent findMerchentByIdDao(int id) {
		return entitymanager.find(Merchent.class, id);
	}

	public Merchent findMerchentByEmailPasword(String email, String password) {
		Query q=entitymanager.createQuery("select m from Merchent m where m.email=?1 and m.password=?2");
		q.setParameter(1, email);
		q.setParameter(2, password);
		try
		{
			Merchent m=(Merchent) q.getSingleResult();
			return m;
		}
		catch (NoResultException e) {
			return null;
		}
	}

	public Merchent findMerchentByPhonePassword(long phone, String password) {
		Query q=entitymanager.createQuery("select m from Merchent m where m.phone=?1 and m.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		try
		{
			Merchent m=(Merchent) q.getSingleResult();
			return m;
		}
		catch (NoResultException e) {
			return null;
		}
	}

}
