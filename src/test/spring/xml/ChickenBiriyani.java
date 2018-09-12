package test.spring.xml;

import org.springframework.stereotype.Component;

@Component()
public class ChickenBiriyani implements FoodFactory {

	private boolean ingredients;
	
	@Override
	public String getMyDish() {
		if(ingredients) return "Tasty & Yummy Chicken Biriyani Is Ready";
		else return "Your Chicken Biriyani Is Ready To Eat";
	}

	@Override
	public void addMoreIngredients() {
		ingredients = true;
	}

}
