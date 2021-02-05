package ApiToOrderProduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ApiToOrderProduct.model.MobileCart;
import ApiToOrderProduct.repository.MobileRepository;

@Service
public class MobileService {

	@Autowired
	private MobileRepository mobileRepository;

	public MobileCart addMobileInfo(MobileCart mobileCart) {

		return mobileRepository.save(mobileCart);
	}

	public List<MobileCart> getInfoOfMobile() {
		return mobileRepository.findAll();
	}

	public MobileCart getOrderDetails(int id) {
		

		MobileCart cart = mobileRepository.findById(id).get();

		if (cart.isPlaced() == true) {
			
			System.out.println("Order Placed");

		} else {
			System.out.println("Order not placed");
		}
		
		return cart;
	}

}
