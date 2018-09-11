package test.spring.xml;

public class MuttonBiriyani implements FoodFactory {

	private boolean ingredients;
	private DeliveryService deliveryService;
	private String status;
	
	public MuttonBiriyani() {
	}

	// Dependency Injection by constructor
	public MuttonBiriyani(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
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
		return status + " will be " + deliveryService.deliverService();
	}

}
