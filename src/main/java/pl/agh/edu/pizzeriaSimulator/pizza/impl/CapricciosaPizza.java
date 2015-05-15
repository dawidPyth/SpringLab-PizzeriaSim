package pl.agh.edu.pizzeriaSimulator.pizza.impl;

import pl.agh.edu.pizzeriaSimulator.pizza.IPizza;

public class CapricciosaPizza implements IPizza {

	public void preparePizza() {
		System.out.println("Preparing pizza Capricciosa...");

	}
	
	public String choice() {
		return "Capricciosa";
		
	}

}
