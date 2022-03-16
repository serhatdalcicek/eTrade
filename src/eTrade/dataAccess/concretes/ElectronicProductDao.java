package eTrade.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.entities.concretes.ElectronicProduct;

public class ElectronicProductDao {
List<ElectronicProduct> products;

public ElectronicProductDao() {
products = new ArrayList<ElectronicProduct>();
}
public void add(ElectronicProduct product) {
	
	products.add(product);
	
}
public void delete(ElectronicProduct product) {
	products.remove(product);
}
public void update(ElectronicProduct product) {
	
}
public List<ElectronicProduct> getAll(){
	return products;
}
}
