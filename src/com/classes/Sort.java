package com.classes;

import java.util.Comparator;

public class Sort implements Comparator<ProductDetails> {

	@Override
	public int compare(ProductDetails pd1, ProductDetails pd2) {
		if (pd1.getProductDiscount() == pd2.getProductDiscount()) {
			return 0;
		} else if (pd1.getProductDiscount() > pd1.getProductDiscount()) {
			return 1;
		} else {
			return -1;
		}

	}

}
