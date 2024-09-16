package org.jsp.merchent.product.app.controller;

import java.util.List;
import java.util.Scanner;

import org.jsp.merchent.product.app.dao.MerchentDao;
import org.jsp.merchent.product.app.dao.ProductDao;
import org.jsp.merchent.product.app.entity.Merchent;
import org.jsp.merchent.product.app.entity.Product;

public class Merchent_Product_Controller {

	private static Scanner sc = new Scanner(System.in);

	private static MerchentDao mdao = new MerchentDao();
	
	private static ProductDao pdao=new ProductDao();

	public static void main(String[] args) {
		System.out.println("1.Save Merchent");
		System.out.println("2.Update Merchent");
		System.out.println("3.Find Merchent by id");
		System.out.println("4.Verify Merchent my emailid and password");
		System.out.println("5.Verify Merchent by phone and password");
		System.out.println("6.Add Product");
		System.out.println("7.Update Product");
		System.out.println("8.Find Product by Merchent Id");
		System.out.println("9.Find Product by Brand");
		System.out.println("10.Find Product by Category");
		System.out.println("Enter your option");
		int option = sc.nextInt();

		switch (option) {
		case 1:
			saveMerchent();
			break;

		case 2:
			updateMerchent();
			break;

		case 3:
			findMerchentById();
			break;

		case 4:
			verifyMerchentByEmailPassword();
			break;

		case 5:
			verifyMerchentByPhonePassword();
			break;

		case 6:
			addProduct();
			break;

		case 7:
			updateProduct();
			break;

		case 8:
			findProductsByMerchentId();
			break;

		case 9:
			findProductByBrand();
			break;

		case 10:
			findProductByCategory();
			break;

		default:
			System.err.println("Invalid choice...!");
			break;
		}

	}

	
	

	/*
	 * 1.Save Merchent
	 */
	private static void saveMerchent() {
		Merchent m = new Merchent();
		System.out.println("Enter Merchent name");
		m.setName(sc.next());
		System.out.println("Enter Merchent phone number");
		m.setPhone(sc.nextLong());
		System.out.println("Enter GST_Number");
		m.setGst_num(sc.next());
		System.out.println("Enter email");
		m.setEmail(sc.next());
		System.out.println("Enter Password");
		m.setPassword(sc.next());
		Merchent mdb = mdao.saveMerchentDao(m);
		System.out.println("Merchent has been saved with id " + mdb.getId());
	}

	/*
	 * 2.Update Merchent
	 */
	private static void updateMerchent() {
		System.out.println("Enter Merchent id to update Merchent details");
		Merchent m = new Merchent();
		m.setId(sc.nextInt());
		System.out.println("Enter Merchent details like --name, --Gst_number, --email");
		m.setName(sc.next());
		m.setGst_num(sc.next());
		m.setEmail(sc.next());
		Merchent mdb = mdao.updateMerchentDao(m);
		if (mdb != null) {
			System.out.println("Merchet is update with given details");
		} else {
			System.out.println("Merchent is not update since invalid Merchent id" + m.getId());
		}
	}

	/*
	 * 3.Find Merchent by id
	 */
	private static void findMerchentById() {
		System.out.println("Enter Merchent id to get details");
		int id = sc.nextInt();
		Merchent m = mdao.findMerchentByIdDao(id);
		if (m != null) {
			System.out.println(m);
		} else {
			System.err.println("No Merchent information found sisnce invalid Merchent id " + id);
		}
	}

	/*
	 * 4.Verify Merchent my emailid and password
	 */
	private static void verifyMerchentByEmailPassword() {
		System.out.println("Enter the Email to get Merchent details");
		String email = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();
		Merchent m = mdao.findMerchentByEmailPasword(email, password);
		if (m!= null) {
			System.out.println("Merchent verified");
			System.out.println(m);
		} else {
			System.err.println("No Merchent record found since invalid Email id or pwssword...!");
		}
	}

	/*
	 * 5.Verify Merchent by phone and password
	 */
	private static void verifyMerchentByPhonePassword() {
		System.out.println("Enter the Phone Number to get Merchent details");
		long phone = sc.nextLong();
		System.out.println("Enter Password");
		String password = sc.next();
		Merchent m = mdao.findMerchentByPhonePassword(phone, password);
		if (m!= null) {
			System.out.println("Merchent verified");
			System.out.println(m);
		} else {
			System.err.println("No Merchent record found since invalid Phone id or pwssword...!");
		}
	}

	/*
	 * 6.Add Product
	 */
	private static void addProduct() {
		System.out.println("Enter Merchent id");
		int mid=sc.nextInt();
		Product p=new Product();
		System.out.println("Enter Product name");
		p.setName(sc.next());
		System.out.println("Enter Product Brand");
		p.setBrand(sc.next());
		System.out.println("Enter Product catagory");
		p.setCategory(sc.next());
		Product pdb=pdao.saveProduct(mid, p);
		if(pdb!=null)
		{
			System.out.println("Product is added with id "+pdb.getId());
		}
		else
		{
			System.err.println("Product is not added since Invalid  Merchent id...!");
		}
	}

	/*
	 * 7.Update Product
	 */
	private static void updateProduct() {
		System.out.println("Enter Product id To update the product details");
		int pid=sc.nextInt();
		Product product=new Product();
		System.out.println("Enter Product name");
		product.setName(sc.next());
		System.out.println("Enter the Product brand name");
		product.setBrand(sc.next());
		Product pro=pdao.updateProduct(pid,product);
		if(pro!=null)
		{
			System.out.println("Product is Updated ");
		}
		else
		{
			System.err.println("Product is not Updated since invalid Product id...!");
		}
	}

	/*
	 * 8.Find Product by Merchent Id
	 */
	private static void findProductsByMerchentId() {
		System.out.println("Enter Merchent Id to get all product");
		int mid=sc.nextInt();
		List<Product> products=pdao.getAllProductsByMerchentId(mid);
		if(products.size()>0)
		{
			for (Product pro : products) {
				System.out.println(pro);
			}
		}
		else
		{
			System.err.println("No Products found sisnce given Merchent id is invalid...!");
		}
	}

	/*
	 * 9.Find Product by Brand
	 */
	private static void findProductByBrand() {
		System.out.println("Enter Brand Name to to Get Products");
		List<Product> products=pdao.FindProductByBrand(sc.next());
		if(products.size()>0)
		{
			for (Product pro : products) {
				System.out.println(pro);
			}
		}
		else
		{
			System.err.println("No Product found since given Brand name is not found in the database...!");
		}
		
	}
	
	/*
	 * 10.Find Product by Category
	 */
	private static void findProductByCategory() {
		System.out.println("Enter Product Catagory to get Product Details");
		List<Product>products=pdao.findProductsByCategory(sc.next());
		if(products.size()>0)
		{
			for (Product pro : products) {
				System.out.println(pro);
			}
		}
		else
		{
			System.err.println("No Product found since given Category is not found in the database...!");
		}
	}

}
