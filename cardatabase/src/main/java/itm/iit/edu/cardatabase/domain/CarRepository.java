package itm.iit.edu.cardatabase.domain;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends CrudRepository <Car, Long>, PagingAndSortingRepository<Car, Long> {

	List<Car> findByBrand(@Param("brand") String brand);
	
	List<Car> findByColor(@Param("color") String color);
	
	 List<Car> findByBrandAndModel(String brand, String model);

	  // Fetch cars by brand or color
	  List<Car> findByBrandOrColor(String brand, String color); 
	  
	  List<Car> findByBrandOrderByYearAsc(String brand);
}
