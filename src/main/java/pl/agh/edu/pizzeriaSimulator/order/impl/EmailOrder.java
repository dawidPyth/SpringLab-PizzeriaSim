package pl.agh.edu.pizzeriaSimulator.order.impl;

import pl.agh.edu.pizzeriaSimulator.order.IOrder;

public class EmailOrder implements IOrder{
	
	public void acceptOrder() {
		System.out.println("New order by Email!");
		
	}

}
