package test.spring.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("test.spring.xml")
public class SpringConfig {

	@Bean
	public DeliveryService setChicDependency() {
		return new FastDelivery();
	}
	
	@Bean
	public DeliveryService setMuttDependency() {
		return new NormalDelivery();
	}
	
	@Bean
	public FoodFactory getChicDish() {
		ChickenBiriyani chickenBiriyani = new ChickenBiriyani(setChicDependency());
		return chickenBiriyani;
	}
	
	@Bean
	public FoodFactory getMuttDish() {
		MuttonBiriyani muttonBiriyani = new MuttonBiriyani(setMuttDependency());
		return muttonBiriyani;
	}
}
