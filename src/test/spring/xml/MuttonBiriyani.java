package test.spring.xml;

public class MuttonBiriyani implements FoodFactory {

	private boolean ingredients;
	
	@Override
	public String getMyDish() {
		if(ingredients) return "Tasty & Yummy Mutton Biriyani Is Very Hot";
		else return "Your Mutton Biriyani Is Ready To Taste";
	}

	@Override
	public void addMoreIngredients() {
		ingredients = true;
	}

}
