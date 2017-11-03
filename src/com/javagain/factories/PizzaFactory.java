package com.javagain.factories;

import com.javagain.products.FarmHousePizza;
import com.javagain.products.IceCream;
import com.javagain.products.MargheritaPizza;
import com.javagain.products.PeppyPaneerPizza;
import com.javagain.products.Pizza;

public class PizzaFactory extends AbstractFactory {
	
	@Override
	public Pizza getPizza(String type) {
		if ("Margherita".equalsIgnoreCase(type)) {
			return new MargheritaPizza();
		}
		else if ("PeppyPaneer".equalsIgnoreCase(type)) {
			return new PeppyPaneerPizza();
		}
		else if ("FarmHouse".equalsIgnoreCase(type)) {
			return new FarmHousePizza();
		}
		return null;
	}

	@Override
	public IceCream getIceCream(String type) {
		return null;
	}
	
}
