package pl.agh.edu.pizzeriaSimulator.pizza.impl;

import pl.agh.edu.pizzeriaSimulator.pizza.IPizza;

public class KebabPizza implements IPizza {

	public void preparePizza() {
		System.out.println("Preparing pizza.... Is this even a real type of pizza??!");

	}
	
	public String choice() {
		return "Kebab";
		
	}

}
