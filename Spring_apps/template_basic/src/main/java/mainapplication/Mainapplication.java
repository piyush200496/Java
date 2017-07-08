package mainapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;



@SpringBootApplication
public class Mainapplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SpringApplication.run(Mainapplication.class, args);
	}
	 @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(Mainapplication.class);

}
}