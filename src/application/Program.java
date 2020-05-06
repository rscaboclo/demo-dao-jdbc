package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		Seller seller = sellerDao.findById(3);

		System.out.println(seller);
		
		System.out.println();
		Department department = new Department(2, null);
		List<Seller> list = new ArrayList<>();
		list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		
		System.out.println();
		List<Seller> listAll = new ArrayList<>();
		listAll = sellerDao.findAll();
		for (Seller obj : listAll) {
			System.out.println(obj);
		}
		
		
		System.out.println();
		//Seller newSeller = new Seller(null,"Ricardo Santos Caboclo","rscaboclo@gmail.com",new Date(),3500.0,department);
		//sellerDao.insert(newSeller);
		
		
		
		//seller = sellerDao.findById(16);
		//seller.setName("Maico Santos Caboclo");
		//sellerDao.update(seller);
		
		System.out.println();
		listAll = new ArrayList<>();
		listAll = sellerDao.findAll();
		for (Seller obj : listAll) {
			System.out.println(obj);
		}
		
		sellerDao.deletById(16);
		
		System.out.println();
		listAll = new ArrayList<>();
		listAll = sellerDao.findAll();
		for (Seller obj : listAll) {
			System.out.println(obj);
		}

	}

}
