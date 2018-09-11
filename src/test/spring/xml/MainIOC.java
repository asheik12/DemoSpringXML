package test.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainIOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating spring container (Application Context) which stores the beans (Objects of our classes)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Getting required bean from the spring container
		FoodFactory factory = context.getBean("chic", FoodFactory.class);
		
		System.out.println(factory.getMyDish());
		
		// Getting required bean from the spring container
		FoodFactory factory1 = context.getBean("mutt", FoodFactory.class);

		System.out.println(factory1.getMyDish());

		context.close();
		
	}

}
