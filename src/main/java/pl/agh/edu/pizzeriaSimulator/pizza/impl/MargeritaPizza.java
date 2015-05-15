package pl.agh.edu.pizzeriaSimulator.pizza.impl;

import pl.agh.edu.pizzeriaSimulator.pizza.IPizza;

public class MargeritaPizza implements IPizza {

	public void preparePizza() {
		System.out.println("Preparing pizza Margerita...");

	}
	
	public String choice() {
		return "Margerita";
		
	}

}
