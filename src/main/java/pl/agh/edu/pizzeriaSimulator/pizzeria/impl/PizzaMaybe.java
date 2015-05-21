package pl.agh.edu.pizzeriaSimulator.pizzeria.impl;

import pl.agh.edu.pizzeriaSimulator.Pizza;
import pl.agh.edu.pizzeriaSimulator.delivery.IDelivery;
import pl.agh.edu.pizzeriaSimulator.pizzeria.IPizzeria;

public class PizzaMaybe implements IPizzeria {
	
	IDelivery delivery;
	String pizzaType;
	
	public void bake(Pizza pizza) {
		pizza.setProducedBy("Pizza Maybe");
		pizza.setType(this.pizzaType);
		System.out.println("Pizza Maybe will attend your order.");
		System.out.println("Here in Pizza Maybe we like to surprise our clients, our moto is: Maybe it's pizza, maybe not ;)");
		System.out.println("Today we will try prepare a pizza" + pizzaType + ".");
		System.out.println("Maybe the Pizza is being baked...");
		delivery.deliver(pizza);
	}
	
	public void setDelivery(IDelivery delivery) {
		this.delivery = delivery;
	}
	
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	
}
