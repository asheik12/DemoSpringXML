package test.spring.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mutton")
public class MuttonBiriyani implements FoodFactory {

	private String status;
	private boolean ingredients;
	
	
	private DeliveryService deliveryService;
	
	public MuttonBiriyani() {
	}

	@Override
	public String getMyDish() {
		if(ingredients) status = "Tasty & Yummy Mutton Biriyani Is Very Hot";
		else status = "Your Mutton Biriyani Is Ready To Taste";
		return status;
	}

	@Override
	public void addMoreIngredients() {
		ingredients = true;
	}

	@Override
	public String deliverMyDish() {
		// TODO Auto-generated method stub
		return status + " will be " + deliveryService.deliverService();
	}

	@Autowired
	@Qualifier("normalDelivery")
	public void setDeliveryService(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}

	
	
}
