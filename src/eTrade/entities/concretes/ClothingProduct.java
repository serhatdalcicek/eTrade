package eTrade.entities.concretes;

import eTrade.entities.abstracts.Product;

public class ClothingProduct extends Product {
private String beden;
private String kumasturu;
private String renk;
public ClothingProduct() {

}
public ClothingProduct(int id,String urunadi,double fiyat,String beden, String kumasturu, String renk) {
	
	super(id,urunadi,fiyat);
	this.beden = beden;
	this.kumasturu = kumasturu;
	this.renk = renk;
}
public String getBeden() {
	return beden;
}
public void setBeden(String beden) {
	this.beden = beden;
}
public String getKumasturu() {
	return kumasturu;
}
public void setKumasturu(String kumasturu) {
	this.kumasturu = kumasturu;
}
public String getRenk() {
	return renk;
}
public void setRenk(String renk) {
	this.renk = renk;
}

}
