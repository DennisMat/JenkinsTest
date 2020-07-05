package hello;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		try {

			


			return "Hello from Jenkins test app , from dennis " 
			+ "<br>Ip adress = " + InetAddress.getLocalHost().getHostAddress()
			+ "<br>Time = " + (new Date()).toString()
			+ "<br><br><br>";

		} catch (Exception e) {
			return "";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
