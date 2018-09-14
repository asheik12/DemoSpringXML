package test.spring.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prawn")
@Scope("prototype")
public class PrawnBiriyani implements FoodFactory {

	private String status;
	private boolean ingredients;
	
	@Autowired
	@Qualifier("fastDelivery")
	private DeliveryService deliveryService;

	@Override
	public String getMyDish() {
		if(ingredients) status = "Your Hot & Spicy Prawn Biriyani Is Ready";
		else status = "Your Prawn Biriyani Is Ready";
		return status;
	}

	@Override
	public void addMoreIngredients() {
		ingredients = true;
	}

	@Override
	public String deliverMyDish() {
		return status + " will be " + deliveryService.deliverService();
	}
	
	
	public void setDeliveryService(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}
	

}
