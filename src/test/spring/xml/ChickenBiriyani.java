package test.spring.xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChickenBiriyani implements FoodFactory {
	
	@Value(value = "${foo.message2}")
	private String message;
	private boolean ingredients;
	private DeliveryService deliveryService;
	private String status;
	
	
	
	public ChickenBiriyani() {
		// TODO Auto-generated constructor stub
	}

	public ChickenBiriyani(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}

	@Override
	public String getMyDish() {
		if(ingredients) status = "Tasty & Yummy Chicken Biriyani Is Ready ";
		else status = "Your Chicken Biriyani Is Ready To Eat ";
		return status;
	}

	@Override
	public void addMoreIngredients() {
		ingredients = true;
	}

	@Override
	public String deliverMyDish() {
		// TODO Auto-generated method stub
		return status + message + " will be delivered in " + deliveryService.deliverService();
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
