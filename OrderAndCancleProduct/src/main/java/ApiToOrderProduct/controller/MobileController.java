package ApiToOrderProduct.controller;

import java.util.List;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ApiToOrderProduct.model.MobileCart;
import ApiToOrderProduct.service.MobileService;

@RestController
public class MobileController extends TimerTask {
	
	@Autowired
	private MobileService mobileService;
	
	@PostMapping("/mobile")
	public MobileCart insertMobile(@RequestBody MobileCart mobileCart) {
		return mobileService.addMobileInfo(mobileCart);
	}
	
	@GetMapping("/mobile")
	public List<MobileCart> getAllMobile(){
		return mobileService.getInfoOfMobile();
	}
	
	@Override
	public void run() {
		try {
			getOrderDetails(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@GetMapping("/mobile/{id}")
	public MobileCart getOrderDetails(@PathVariable int id) throws InterruptedException{
		
		Thread.sleep(10000);

		return mobileService.getOrderDetails(id);
			
	}

}
