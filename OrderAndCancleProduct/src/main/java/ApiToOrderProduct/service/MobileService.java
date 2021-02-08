package ApiToOrderProduct.service;

import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ApiToOrderProduct.model.MobileCart;
import ApiToOrderProduct.repository.MobileRepository;

@Service
public class MobileService extends TimerTask{

	@Autowired
	private MobileRepository mobileRepository;

	public MobileCart addMobileInfo(MobileCart mobileCart) {

		return mobileRepository.save(mobileCart);
	}

	public List<MobileCart> getInfoOfMobile() {
		return mobileRepository.findAll();
	}
	
	@Override
	public void run() {
		try {
			updateCart(0, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ResponseEntity<MobileCart> updateCart(int id, MobileCart mcart) throws Exception{
		
		MobileCart cart = mobileRepository.findById(id).get();	
		
		if(cart.isPlaced()==false) {
			cart.setPlaced(true);
			System.out.println("Order Placed");
			TimeUnit.SECONDS.sleep(5);
		}

		MobileCart update = mobileRepository.save(cart);
		return ResponseEntity.ok(update);
	}

}
