package test.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainScope {
	
	public static void main(String[] s) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		FoodFactory factory = context.getBean("prawn", FoodFactory.class);
		
		System.out.println(factory.getMyDish());
		factory.addMoreIngredients();
		System.out.println(factory.getMyDish());
		System.out.println(factory.deliverMyDish());
		
		FoodFactory factory1 = context.getBean("prawn", FoodFactory.class);

		System.out.println(factory1.getMyDish());
		System.out.println(factory1.deliverMyDish());
		
		context.close();
		
	}

}
