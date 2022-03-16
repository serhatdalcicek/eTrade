package eTrade.business.concretes;

import java.util.List;

import eTrade.dataAccess.concretes.ElectronicProductDao;
import eTrade.entities.abstracts.Product;
import eTrade.entities.concretes.ElectronicProduct;

public class ElectronicProductManager {
ElectronicProductDao electronicProductDao = new ElectronicProductDao();

public void add(ElectronicProduct product) {
	if (sorgu(product)==true) {
		electronicProductDao.add(product);
	}  
}
public boolean sorgu (ElectronicProduct product) {
	 for (ElectronicProduct custom : electronicProductDao.getAll()) {
		 
	        if (product.getUrunadi() == custom.getUrunadi()) {
	        	
	            return false;
	        
	        }
	    }
	 return true;
	    
	    
}
public List<ElectronicProduct> getAll(){
	return electronicProductDao.getAll();
}
}
