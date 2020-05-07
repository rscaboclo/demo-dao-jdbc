package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		List<Department> listDep = new ArrayList<>();
		Department dep = new Department();

		SellerDao sellerDao = DaoFactory.createSellerDao();
		List<Seller> listSeller = new ArrayList<>();
		
		System.out.println("====================Insert====================");
		dep = new Department(null,"Recurso Humano");
		depDao.insert(dep);
		System.out.println("Registo inserido: "+ dep);
		
		System.out.println();
		System.out.println("====================FindAll====================");
		listDep = depDao.findAll();
		for(Department obj : listDep) {
			System.out.println(obj);
		}

		System.out.println();
		System.out.println("====================DeleteByID====================");
		System.out.println(depDao.findById(7));
				
		System.out.println();
		System.out.println("====================Delete====================");
		depDao.deleteById(7);
		
		System.out.println();
		System.out.println("====================FindAll====================");
		listDep = depDao.findAll();
		for(Department obj : listDep) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("====================UPDate====================");
		dep = depDao.findById(4);
		dep.setName("Food");
		System.out.println(dep);
		depDao.update(dep);
		
		System.out.println();
		System.out.println("====================FindAll====================");
		listDep = depDao.findAll();
		for(Department obj : listDep) {
			System.out.println(obj);
		}
		//Seller seller = sellerDao.findById(3);
		//System.out.println(seller);
		
		//System.out.println();
		//Department department = new Department(2, null);
		
		//list = sellerDao.findByDepartment(department);
		//for (Seller obj : list) {
		//	System.out.println(obj);
		//}

		
		//System.out.println();
		//List<Seller> listAll = new ArrayList<>();
		//listAll = sellerDao.findAll();
		//for (Seller obj : listAll) {
		//	System.out.println(obj);
		//}
		
		
		//System.out.println();
		//Seller newSeller = new Seller(null,"Ricardo Santos Caboclo","rscaboclo@gmail.com",new Date(),3500.0,department);
		//sellerDao.insert(newSeller);
		
		
		
		//seller = sellerDao.findById(16);
		//seller.setName("Maico Santos Caboclo");
		//sellerDao.update(seller);
		
		//System.out.println();
		//listAll = new ArrayList<>();
		//listAll = sellerDao.findAll();
		//for (Seller obj : listAll) {
		//	System.out.println(obj);
		//}
		
		//sellerDao.deletById(16);
		
		//System.out.println();
		//listAll = new ArrayList<>();
		//listAll = sellerDao.findAll();
		//for (Seller obj : listAll) {
		//	System.out.println(obj);
		//}

	}

}
