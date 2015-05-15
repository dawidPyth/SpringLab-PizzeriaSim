package pl.agh.edu.pizzeriaSimulator.delivery.impl;

import pl.agh.edu.pizzeriaSimulator.delivery.IDelivery;

public class TakeAway implements IDelivery {
	
	public void deliverPizza() {
		System.out.println("Sir, here is your pizza.");
	}
	
	public String choice() {
		return "Your pizza should be ready within 15 minutes.";
		
	}

}
