package itm.iit.edu.cardatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import itm.iit.edu.cardatabase.domain.Car;
import itm.iit.edu.cardatabase.domain.CarRepository;
import itm.iit.edu.cardatabase.domain.Owner;
import itm.iit.edu.cardatabase.domain.OwnerRepository;
import itm.iit.edu.cardatabase.domain.User;
import itm.iit.edu.cardatabase.domain.UserRepository;

@SpringBootApplication
public class CardatabaseApplication {
	 @Autowired 
     private CarRepository repository;
	 
	 @Autowired
	 private OwnerRepository oRepository;
//	 
	 @Autowired
	 private UserRepository uRepository;
	 
	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}
	
	@Bean
    CommandLineRunner runner(){
		return args -> {
			Owner owner1 = new Owner("John" , "Johnson");
            Owner owner2 = new Owner("Mary" , "Robinson");
            
            oRepository.save(owner1);
            oRepository.save(owner2);
            
            Car car = new Car("Ford", "Mustang", "Red", 
                    "ADF-1121", 2017, 59000, owner1);
            repository.save(car);
            car = new Car("Nissan", "Leaf", "White",
                    "SSJ-3002", 2014, 29000, owner2);
                repository.save(car);
                car = new Car("Toyota", "Prius", "Silver",
                    "KKO-0212", 2018, 39000, owner2);
                repository.save(car);
             User user = new User("user", "$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi", "USER");
             uRepository.save(user);
              user = new User("admin", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG", "ADMIN");
             uRepository.save(user);
          };
             
	}
}
