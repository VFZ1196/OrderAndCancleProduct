package ApiToOrderProduct.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

	public ResponseEntity<MobileCart> getOrderDetails(int id) {
		Optional<MobileCart> user = mobileRepository.findById(id);
		if(user.isPresent()) {
	        return ResponseEntity.ok().body(user.get());
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

}
