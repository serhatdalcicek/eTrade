package eTrade.entities.abstracts;

public class Product {
private int id;
private double fiyat;
private String urunadi;
public Product() {
}
public Product(int id,String urunadi, double fiyat ) {
	this.id = id;
	this.fiyat = fiyat;
	this.urunadi = urunadi;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getFiyat() {
	return fiyat;
}
public void setFiyat(double fiyat) {
	this.fiyat = fiyat;
}
public String getUrunadi() {
	return urunadi;
}
public void setUrunadi(String urunadi) {
	this.urunadi = urunadi;
}

}
