package pl.agh.edu.pizzeriaSimulator.delivery.impl;

import pl.agh.edu.pizzeriaSimulator.delivery.IDelivery;

public class HomeDelivery implements IDelivery {
	
	public void deliverPizza() {
		System.out.println("Ding...Dong........Here is your Pizza! Now pay!");
	}
	
	public String choice() {
		return "The pizza should be delivered to your his within 20 minutes.";
		
	}

}
