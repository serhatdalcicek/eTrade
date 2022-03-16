package eTrade.api;

import eTrade.business.concretes.ElectronicProductManager;
import eTrade.entities.concretes.ElectronicProduct;

public class Main {

	public static void main(String[] args) {
ElectronicProduct product1 = new ElectronicProduct(1,"Bilgisayar",8000,"USB","IOS");
ElectronicProduct product2 = new ElectronicProduct(2,"Laptop",1000,"Micro USB","Android");
ElectronicProduct product3 = new ElectronicProduct(3,"Bilgisayar",8000,"USB","IOS");

ElectronicProductManager electronicProductManager = new ElectronicProductManager();
electronicProductManager.add(product1);
electronicProductManager.add(product2);
electronicProductManager.add(product3);


for(ElectronicProduct product:electronicProductManager.getAll()) {
	System.out.println(product.getUrunadi()+"/"+product.getFiyat()+"/"+product.getBaglantituru());

}
}
}
