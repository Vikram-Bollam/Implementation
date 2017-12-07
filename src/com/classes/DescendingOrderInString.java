package com.classes;

import java.util.Comparator;

public class DescendingOrderInString implements Comparator<ProductDetails>{

	@Override
	public int compare(ProductDetails o1, ProductDetails o2) {
		// TODO Auto-generated method stub
		return -o1.getProductName().compareTo(o2.getProductName());
	}	

}
 