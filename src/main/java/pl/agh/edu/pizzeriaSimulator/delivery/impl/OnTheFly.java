package pl.agh.edu.pizzeriaSimulator.delivery.impl;

import pl.agh.edu.pizzeriaSimulator.Pizza;
import pl.agh.edu.pizzeriaSimulator.delivery.IDelivery;

public class OnTheFly implements IDelivery {

	public void deliver(Pizza pizza) {
		pizza.setDeliveryMethod("On the fly");
		System.out.println("Your pizza is being delivered by On The Fly. "
				+ "We are a futuristic delivery company, so you'll get your pizza in the future!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("...20 years later.... Here is your pizza " + pizza.getCustomerName() +"!");
	}

}
