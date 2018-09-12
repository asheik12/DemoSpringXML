package test.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDISetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		FoodFactory factory = context.getBean("fish", FoodFactory.class);
		
		System.out.println(factory.getMyDish());
		
		factory.addMoreIngredients();
		
		System.out.println(factory.getMyDish());
		
		System.out.println(factory.deliverMyDish());
		
		context.close();
	}

}
