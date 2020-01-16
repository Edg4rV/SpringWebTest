package beginer.springframework.springwebapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


//@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SpringwebappApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SpringwebappApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
