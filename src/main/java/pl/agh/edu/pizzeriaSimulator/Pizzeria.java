package pl.agh.edu.pizzeriaSimulator;

import pl.agh.edu.pizzeriaSimulator.delivery.IDelivery;
import pl.agh.edu.pizzeriaSimulator.order.IOrder;
import pl.agh.edu.pizzeriaSimulator.pizza.IPizza;

public class Pizzeria {
	
	String customer;
	IOrder order;
	IPizza pizza;
	IDelivery delivery;
	
	public Pizzeria(IDelivery delivery)
	{
		this.delivery = delivery;
	}

	public void runPizzeria() {		
		this.order.acceptOrder();
		System.out.println("The Customer " + this.customer + " has chosen pizza " + this.pizza.choice() +
				". " + this.delivery.choice());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.pizza.preparePizza();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.delivery.deliverPizza();
		
	}
	
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public void setOrder(IOrder order) {
		this.order = order;
	}
	
	public void setPizza(IPizza pizza) {
		this.pizza = pizza;
	}

}
