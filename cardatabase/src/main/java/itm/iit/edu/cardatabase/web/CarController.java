package itm.iit.edu.cardatabase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itm.iit.edu.cardatabase.domain.Car;
import itm.iit.edu.cardatabase.domain.CarRepository;

@RestController
public class CarController {
    
	@Autowired
    private CarRepository repository;
    
	@RequestMapping("/cars")
    public Iterable<Car> getCars() {
		return repository.findAll();

    } 
	
	public CarController() {
		
	}
}
