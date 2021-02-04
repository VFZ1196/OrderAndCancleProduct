package ApiToOrderProduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ApiToOrderProduct.model.MobileCart;
import ApiToOrderProduct.repository.MobileRepository;

@Service
public class MobileService {

	private static final String HttpConnectionParams = null;
	private static final String httpParameters = null;
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

		try {
			
			if (cart.isPlaced() == true) {
				System.out.println("Order Placed");
				//HttpConnectionParams.setConnectionTimeout( httpParameters, 60000 * 5 );

			} else {
				System.out.println("Order not placed");
			}
		} catch (Exception ex) {
			
		}
		
		return null;
	}

}
