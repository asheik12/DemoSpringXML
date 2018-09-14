package test.spring.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("test.spring.xml")
@PropertySource("classpath:values.properties")
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
	@Scope("singleton")
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
