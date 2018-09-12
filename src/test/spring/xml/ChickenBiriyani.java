package test.spring.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ChickenBiriyani implements FoodFactory {

	private String status;
	private boolean ingredients;
	
	@Autowired
	@Qualifier("fastDelivery")
	private DeliveryService deliveryService;
	
	
	public ChickenBiriyani() {
	}

	
	public ChickenBiriyani(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}

	@Override
	public String getMyDish() {
		if(ingredients) status = "Tasty & Yummy Chicken Biriyani Is Ready";
		else status = "Your Chicken Biriyani Is Ready To Eat";
		return status;
	}

	@Override
	public void addMoreIngredients() {
		ingredients = true;
	}

	@Override
	public String deliverMyDish() {
		// TODO Auto-generated method stub
		return status + "will be " + deliveryService.deliverService();
	}

}
