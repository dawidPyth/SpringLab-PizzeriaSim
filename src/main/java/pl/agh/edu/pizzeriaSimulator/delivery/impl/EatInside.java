package pl.agh.edu.pizzeriaSimulator.delivery.impl;

import pl.agh.edu.pizzeriaSimulator.Pizza;
import pl.agh.edu.pizzeriaSimulator.delivery.IDelivery;

public class EatInside implements IDelivery {
	
	public void deliver(Pizza pizza) {
		pizza.setDeliveryMethod("Eat inside");
		System.out.println("Your Pizza is being provided to your table inside the restaurant, don't worry we're really fast!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Here is your Pizza " + pizza.getCustomerName() +"! Now pay!");
	}

}
