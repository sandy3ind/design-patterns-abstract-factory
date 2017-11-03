package com.javagain.factories;

import com.javagain.products.IceCream;
import com.javagain.products.Pizza;

public abstract class AbstractFactory {
	
	public abstract Pizza getPizza(String type);
	public abstract IceCream getIceCream(String type);

	public static AbstractFactory getFactory(String factory) {		
		if ("IceCream".equalsIgnoreCase(factory)) {
			return new IceCreamFactory();
		}
		else if ("Pizza".equalsIgnoreCase(factory)) {
			return new PizzaFactory();
		}
		return null;
	}
	
}
