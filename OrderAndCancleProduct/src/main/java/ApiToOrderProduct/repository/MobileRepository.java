package ApiToOrderProduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ApiToOrderProduct.model.MobileCart;

@Repository
public interface MobileRepository extends JpaRepository<MobileCart, Integer>{

}
