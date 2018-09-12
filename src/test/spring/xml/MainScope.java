package test.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainScope {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Prototype Scope
		FoodFactory factory = context.getBean("mutt", FoodFactory.class);
		
		System.out.println(factory.getMyDish());
		
		System.out.println(factory.deliverMyDish());
		
		factory.addMoreIngredients();
		
		System.out.println(factory.getMyDish());
		
		System.out.println(factory.deliverMyDish());
		
		// Creating another object
		FoodFactory factory1 = context.getBean("mutt", FoodFactory.class);
		
		System.out.println(factory1.getMyDish());
		
		System.out.println(factory1.deliverMyDish());
		
		context.close();
	}

}
