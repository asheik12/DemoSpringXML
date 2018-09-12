package test.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConDes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		FoodFactory factory = context.getBean("chic", FoodFactory.class);
		//FoodFactory factory = context.getBean("mutt", FoodFactory.class);
		
		// Delivering dish without ingredients
		System.out.println(factory.getMyDish());
		System.out.println(factory.deliverMyDish());
		
		factory.addMoreIngredients();
		
		// Delivering dish with ingredients
		System.out.println(factory.getMyDish());
		System.out.println(factory.deliverMyDish());
		
		context.close();
		
	}

}
