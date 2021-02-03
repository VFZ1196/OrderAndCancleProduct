package ApiToOrderProduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ApiToOrderProduct.model.MobileCart;
import ApiToOrderProduct.service.MobileService;

@RestController
public class MobileController {
	
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
	
	@GetMapping("/mobile/{id}")
	public ResponseEntity<MobileCart> getOrderDetails(@PathVariable int id){
		return mobileService.getOrderDetails(id);
			
	}

}
