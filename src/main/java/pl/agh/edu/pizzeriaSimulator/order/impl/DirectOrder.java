package pl.agh.edu.pizzeriaSimulator.order.impl;

import pl.agh.edu.pizzeriaSimulator.Pizza;
import pl.agh.edu.pizzeriaSimulator.order.IOrder;
import pl.agh.edu.pizzeriaSimulator.pizzeria.IPizzeria;

public class DirectOrder implements IOrder {

	Pizza pizza;
	
	public void order(String customerName) {
		pizza = new Pizza("Direct order", customerName);
	}
	
	public Pizza getPizza() {
		return this.pizza;
	}


}
