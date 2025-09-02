package day_2;

public class product {
String productName;
double price;
int discount;
String quantity;
public static void main(String[] args) {
	product p1=new product();
	p1.productName="shampoo";
	p1.price=199;
	p1.discount=15;
	p1.quantity="05";
	System.out.println("productName :"+p1.productName);
	System.out.println("price :"+p1.price);
	System.out.println("discount "+p1.discount);
	System.out.println("quantity :"+p1.quantity);
	product p2=new product();
	p2.productName="Tooth Paste";
	p2.price=299;
	p2.discount=10;
	p2.quantity="02";
	System.out.println("productName :"+p2.productName);
	System.out.println("price :"+p2.price);
	System.out.println("discount "+p2.discount);
	System.out.println("quantity :"+p2.quantity);
	product p3=new product();
	p3.productName="Bike:BMW";
	p3.price=10000000;
	p3.discount=04;
	p3.quantity="01";
	System.out.println("productName :"+p3.productName);
	System.out.println("price :"+p3.price);
	System.out.println("discount "+p3.discount);
	System.out.println("quantity :"+p3.quantity);
}

}
