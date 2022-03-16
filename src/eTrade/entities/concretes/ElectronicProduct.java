package eTrade.entities.concretes;

import eTrade.entities.abstracts.Product;

public class ElectronicProduct extends Product {
private String baglantituru;
private String isletimsistemi;
public ElectronicProduct() {
	
}
public ElectronicProduct(int id,String urunadi,double fiyat,String baglantituru, String isletimsistemi) {
	super(id,urunadi,fiyat);
	this.baglantituru = baglantituru;
	this.isletimsistemi = isletimsistemi;
}
public String getBaglantituru() {
	return baglantituru;
}
public void setBaglantituru(String baglantituru) {
	this.baglantituru = baglantituru;
}
public String getIsletimsistemi() {
	return isletimsistemi;
}
public void setIsletimsistemi(String isletimsistemi) {
	this.isletimsistemi = isletimsistemi;
}

}
