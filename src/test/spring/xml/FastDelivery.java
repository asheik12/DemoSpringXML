package test.spring.xml;

public class FastDelivery implements DeliveryService {

	@Override
	public String deliverService() {
		return "Delivered in 5 Minutes";
	}

	
}
