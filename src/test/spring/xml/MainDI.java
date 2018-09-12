package test.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To demostrate constructor level dependency injection
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		FoodFactory factory = context.getBean("chickenBiriyani", FoodFactory.class);
		
		System.out.println(factory.getMyDish());
		System.out.println(factory.deliverMyDish());
		
		factory.addMoreIngredients();
		
		System.out.println(factory.getMyDish());
		System.out.println(factory.deliverMyDish());
		
		context.close();
		
	}

}
