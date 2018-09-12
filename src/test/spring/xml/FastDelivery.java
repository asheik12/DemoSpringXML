package test.spring.xml;

import org.springframework.stereotype.Component;

@Component
public class FastDelivery implements DeliveryService {

	@Override
	public String deliverService() {
		return "Delivered In 2 Minutes";
	}

}
