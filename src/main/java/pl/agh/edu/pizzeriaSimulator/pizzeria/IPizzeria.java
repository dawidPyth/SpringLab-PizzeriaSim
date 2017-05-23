package pl.agh.edu.pizzeriaSimulator.pizzeria;

import pl.agh.edu.pizzeriaSimulator.Pizza;
import pl.agh.edu.pizzeriaSimulator.delivery.IDelivery;

public interface IPizzeria {
	
	public void bake(Pizza pizza);
	
	public void makeAnOrderInThePizzeria();

}
