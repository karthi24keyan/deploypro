package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	
	public static void main(String args[]){
		SpringApplication.run(Application.class);
	}
	
	@RequestMapping(value="/test")
	public String demo(){
		return "CHEcking to Automerge TO MASTER";
	}
	

}
