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
		
		// Getting required bean from the spring container
		FoodFactory factory1 = context.getBean("getMuttDish", FoodFactory.class);

		System.out.println(factory1.getMyDish());

		context.close();
		
	}

}
