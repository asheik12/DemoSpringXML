package test.spring.xml;

public class ChickenBiriyani implements FoodFactory {

	private boolean ingredients;
	private DeliveryService deliveryService;
	private String status;
	
	public ChickenBiriyani() {
	}

	// Dependency Injection by constructor
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
		return status + " will be " + deliveryService.deliverService();
	}

	public void myPostConstruct() {
		System.out.println("This is called inside Post Construct");
	}
	
	public void myPreDestroy() {
		System.out.println("This is called inside Pre Destroy");
	}
	
}
