package test.spring.xml;

public class FishBiriyani implements FoodFactory {

	private boolean ingredients;
	private DeliveryService deliveryService;
	private String status;
	
	// Setter Dependency Injection
	public void setDeliveryService(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}

	@Override
	public String getMyDish() {
		if(ingredients) status = "Tasty & Fresh Fish Biriyani Is Ready";
		else status = "Your Fish Biriyani Is On The Way";
		return status;
	}

	@Override
	public void addMoreIngredients() {
		ingredients=true;
	}

	@Override
	public String deliverMyDish() {
		return status + " will be " + deliveryService.deliverService();
	}

}
