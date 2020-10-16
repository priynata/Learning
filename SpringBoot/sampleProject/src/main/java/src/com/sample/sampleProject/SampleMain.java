package src.com.sample.sampleProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SampleMain {

	@Autowired()
	DemoController restController;

	public static void main( String[] args )
	{
		SpringApplication.run(SampleMain.class, args);
		System.out.println( "Hello World!" );
	}

}