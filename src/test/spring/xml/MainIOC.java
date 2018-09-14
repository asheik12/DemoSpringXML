package test.spring.xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainIOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating spring container (Application Context) which stores the beans (Objects of our classes)
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		// Getting required bean from the spring container
		FoodFactory factory = context.getBean("getChicDish", FoodFactory.class);
		
		System.out.println(factory.getMyDish());
		factory.addMoreIngredients();
		System.out.println(factory.getMyDish());
		System.out.println(factory.deliverMyDish());
		
		FoodFactory factory2 = context.getBean("getChicDish", FoodFactory.class);

		System.out.println(factory2.getMyDish());
		System.out.println(factory2.deliverMyDish());
		
		// Getting required bean from the spring container
		FoodFactory factory1 = context.getBean("getMuttDish", FoodFactory.class);

		System.out.println(factory1.getMyDish());
		factory1.addMoreIngredients();
		System.out.println(factory1.deliverMyDish());

		context.close();
		
	}

}
