package test.spring.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("test.spring.xml")
public class SpringConfig {

	@Bean
	public FoodFactory getChicDish() {
		ChickenBiriyani chickenBiriyani = new ChickenBiriyani();
		return chickenBiriyani;
	}
	
	@Bean
	public FoodFactory getMuttDish() {
		MuttonBiriyani muttonBiriyani = new MuttonBiriyani();
		return muttonBiriyani;
	}
}
