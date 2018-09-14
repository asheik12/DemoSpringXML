package test.spring.xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class MuttonBiriyani implements FoodFactory {

	@Value(value = "${foo.message1}")
	private String message;
	private boolean ingredients;
	private DeliveryService deliveryService;
	
	
	
	public MuttonBiriyani() {
		// TODO Auto-generated constructor stub
	}

	public MuttonBiriyani(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}

	@Override
	public String getMyDish() {
		if(ingredients) return "Tasty & Yummy Mutton Biriyani Is Very Hot";
		else return "Your Mutton Biriyani Is Ready To Taste";
	}

	@Override
	public void addMoreIngredients() {
		ingredients = true;
	}

	@Override
	public String deliverMyDish() {
		// TODO Auto-generated method stub
		return "Your dish which is "+ message +"will be delivered in " + deliveryService.deliverService();
	}

}
