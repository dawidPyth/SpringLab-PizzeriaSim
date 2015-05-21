package pl.agh.edu.pizzeriaSimulator.pizzeria.impl;

import pl.agh.edu.pizzeriaSimulator.Pizza;
import pl.agh.edu.pizzeriaSimulator.delivery.IDelivery;
import pl.agh.edu.pizzeriaSimulator.pizzeria.IPizzeria;

public class TruePizza implements IPizzeria {
	
	IDelivery delivery;
	String pizzaType;
	
	
	public void bake(Pizza pizza) {
		pizza.setProducedBy("True Pizza");
		pizza.setType(this.pizzaType);
		System.out.println("True Pizza will attend your order.");
		System.out.println("In True Pizza we never lie about our pizzas!");
		System.out.println("Today we will prepare a pizza" + pizzaType + "  for you. Please don't have high expectations.");
		System.out.println("The Pizza is being baked...");
		delivery.deliver(pizza);
	}
	
	public void setDelivery(IDelivery delivery) {
		this.delivery = delivery;
	}
	
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	
}
