package com.javagain.factories;

import com.javagain.products.ChocolateIceCream;
import com.javagain.products.IceCream;
import com.javagain.products.Pizza;
import com.javagain.products.StrawberryIceCream;
import com.javagain.products.VanillaIceCream;

/**
 * This is factory class to create ice creams subclasses
 * 
 * @author Sandeep.Sharma
 *
 */
public class IceCreamFactory extends AbstractFactory {	
	
	@Override
	public IceCream getIceCream(String type) {
		if ("Chocolate".equalsIgnoreCase(type)) {
			return new ChocolateIceCream();
		}
		else if ("Strawberry".equalsIgnoreCase(type)) {
			return new StrawberryIceCream();
		}
		else if ("Vanilla".equalsIgnoreCase(type)) {
			return new VanillaIceCream();
		}
		return null;
	}

	@Override
	public Pizza getPizza(String type) {
		return null;
	}
	
}
