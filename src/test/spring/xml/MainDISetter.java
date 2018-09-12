package test.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDISetter {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		FoodFactory factory = context.getBean("mutton", FoodFactory.class);
		
		System.out.println(factory.getMyDish());
		System.out.println(factory.deliverMyDish());
		
		factory.addMoreIngredients();
		
		System.out.println(factory.getMyDish());
		System.out.println(factory.deliverMyDish());
		
		context.close();

	}

}
