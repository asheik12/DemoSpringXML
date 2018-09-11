package test.spring.xml;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// If I want chicken biriyani, I can ask my food factory
		FoodFactory factory = new ChickenBiriyani();
		
		// Getting biriyani from the food factory
		System.out.println(factory.getMyDish());

		// Adding some iongredients to my biriyani
		factory.addMoreIngredients();
		
		// Getting biriyani
		System.out.println(factory.getMyDish());
		
		// If I want mutton biriyani, I can ask my food factory
		FoodFactory factory1 = new MuttonBiriyani();

		// Getting biriyani from the food factory
		System.out.println(factory1.getMyDish());

		// Adding some iongredients to my biriyani
		factory1.addMoreIngredients();

		// Getting biriyani
		System.out.println(factory1.getMyDish());
		
	}

}
