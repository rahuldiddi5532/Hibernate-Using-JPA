package org.jsp.merchent.product.app.dao;

import java.util.List;

import javax.persistence.*;

import org.jsp.merchent.product.app.entity.Merchent;
import org.jsp.merchent.product.app.entity.Product;

public class ProductDao {

	private EntityManager entitymanager=Persistence.createEntityManagerFactory("dev").createEntityManager();

//	private MerchentDao mdao;
	
	public Product saveProduct(int mid,Product product)
	{
//		Merchent m=mdao.findMerchentByIdDao(mid);
		Merchent m=entitymanager.find(Merchent.class, mid);
		if(m!=null)
		{
			EntityTransaction tran=entitymanager.getTransaction();
			tran.begin();
			List<Product> listproducts=m.getProducts();
			listproducts.add(product);
			product.setMerchent(m);
			entitymanager.persist(product);
			tran.commit();
			return product;
		}
		return null;
	}

	public List<Product> getAllProductsByMerchentId(int mid) {
		Query q=entitymanager.createQuery("select m.products from Merchent m where m.id=?1");
		//Query q=entitymanager.createQuery("select p from Product p where p.merchent.id=?1");
		q.setParameter(1, mid);
		List<Product> lp=q.getResultList();
		return lp;
	}

	public Product updateProduct(int pid, Product product) {
		Product p=entitymanager.find(Product.class, pid);
		if(p!=null)
		{
			p.setName(product.getName());
			p.setBrand(product.getBrand());
			return p;
		}
		return null;
	}

	public List<Product> FindProductByBrand(String brand) {
		Query q=entitymanager.createQuery("select p from Product p where p.brand=?1");
		q.setParameter(1, brand);
		List<Product> products=q.getResultList();
		return products;
	}

	public List<Product> findProductsByCategory(String category) {
		Query q=entitymanager.createQuery("select p from Product p where p.category=?1");
		q.setParameter(1, category);
		List<Product> products=q.getResultList();
		return products;
	}
	
}
