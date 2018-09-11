package test.spring.xml;

public class NormalDelivery implements DeliveryService {

	@Override
	public String deliverService() {
		return "Delivered in 20 Minutes";
	}

}
