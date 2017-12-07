package com.classes;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Set<ProductDetails> details1 = new TreeSet<ProductDetails>(new AscendingOrderOfString());
		ProductDetails pd = null;
		System.out.println("Enter How Many Details you need to add");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter a Product Name");
			String productName1 = sc.next();
			System.out.println("Enter a Product id");
			String productId1 = sc.next();
			System.out.println("Enter a Amount");
			int productPrice1 = sc.nextInt();
			System.out.println("Enter a Discount");
			int productDiscount1 = sc.nextInt();
			int finalPrice1 = productPrice1 - productDiscount1;
			pd = new ProductDetails();
			pd.setProductName(productName1);
			pd.setProductId(productId1);
			pd.setProductPrice(productPrice1);
			pd.setProductDiscount(productDiscount1);
			pd.setFinalPrice(finalPrice1);
			details1.add(pd);
		}
		Iterator<ProductDetails> itr = details1.iterator();
		while (itr.hasNext()) {
			ProductDetails productDetails = (ProductDetails) itr.next();
			System.out.println("NAME        :" + productDetails.productName);
			System.out.println("PRICE       :" + productDetails.productPrice);
			System.out.println("OUR PRICE   :" + productDetails.finalPrice);
			System.out.println("YOU SAVE    :" + productDetails.productDiscount);
			System.out.println("----------------------------");

		}

	}
}
