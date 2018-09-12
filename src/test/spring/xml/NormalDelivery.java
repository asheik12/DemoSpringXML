package test.spring.xml;

import org.springframework.stereotype.Component;

@Component
public class NormalDelivery implements DeliveryService {

	@Override
	public String deliverService() {
		return "Delivered In 10 Minutes";
	}

}
