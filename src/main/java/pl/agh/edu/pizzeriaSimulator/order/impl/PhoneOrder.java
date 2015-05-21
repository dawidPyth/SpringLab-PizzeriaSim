package pl.agh.edu.pizzeriaSimulator.order.impl;

import pl.agh.edu.pizzeriaSimulator.Pizza;
import pl.agh.edu.pizzeriaSimulator.order.IOrder;
import pl.agh.edu.pizzeriaSimulator.pizzeria.IPizzeria;

public class PhoneOrder implements IOrder {

	IPizzeria pizzeria;
	Pizza pizza;
	
	public void order(String customerName) {
		pizza = new Pizza("By Phone", customerName);
		System.out.println("Your order has been accepted, calling Pizzeria...");
		
		pizzeria.bake(pizza);
		
		System.out.println("hi " + pizza.getDeliveryMethod());
		
	}
	
	public void setPizzeria(IPizzeria pizzeria) {
		this.pizzeria = pizzeria;
	}

}
