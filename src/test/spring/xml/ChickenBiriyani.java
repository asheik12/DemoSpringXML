package test.spring.xml;

import org.springframework.stereotype.Component;

@Component
public class ChickenBiriyani implements FoodFactory {

	private boolean ingredients;
	private DeliveryService deliveryService;
	
	
	
	public ChickenBiriyani() {
		// TODO Auto-generated constructor stub
	}

	public ChickenBiriyani(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}

	@Override
	public String getMyDish() {
		if(ingredients) return "Tasty & Yummy Chicken Biriyani Is Ready";
		else return "Your Chicken Biriyani Is Ready To Eat";
	}

	@Override
	public void addMoreIngredients() {
		ingredients = true;
	}

	@Override
	public String deliverMyDish() {
		// TODO Auto-generated method stub
		return "Your Dish will be delivered in " + deliveryService.deliverService();
	}

}
