package pl.agh.edu.pizzeriaSimulator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.agh.edu.pizzeriaSimulator.delivery.IDelivery;
import pl.agh.edu.pizzeriaSimulator.delivery.impl.EatInside;
import pl.agh.edu.pizzeriaSimulator.delivery.impl.EatOnTheTerrace;
import pl.agh.edu.pizzeriaSimulator.pizzeria.IPizzeria;
import pl.agh.edu.pizzeriaSimulator.pizzeria.impl.MexicoPizza;

/**
 * Pizzeria Simulator
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
 	    	   new ClassPathXmlApplicationContext(new String[] {"Spring-pizzeriaSimulator.xml"});
    	
 	    Customer customer = (Customer)context.getBean("Customer");
 	    customer.iWantPizza();
 	    
 	   System.out.println("\n\n");
 	   
 	   ApplicationContext contextOrderingInPizzeria = 
	    	   new ClassPathXmlApplicationContext(new String[] {"Spring-orderingInPizzeria.xml"});

	   //We can modify  to any selected pizzeria
	   IPizzeria pizzeria = (IPizzeria)contextOrderingInPizzeria.getBean("PizzaMaybe");
	   pizzeria.makeAnOrderInThePizzeria();
 }
}
