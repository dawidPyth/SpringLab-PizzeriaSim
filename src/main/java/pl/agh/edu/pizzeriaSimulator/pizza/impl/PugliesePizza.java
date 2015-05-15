package pl.agh.edu.pizzeriaSimulator.pizza.impl;

import pl.agh.edu.pizzeriaSimulator.pizza.IPizza;

public class PugliesePizza implements IPizza {

	public void preparePizza() {
		System.out.println("Preparing pizza Pugliese...");

	}
	
	public String choice() {
		return "Publiese";
		
	}

}
