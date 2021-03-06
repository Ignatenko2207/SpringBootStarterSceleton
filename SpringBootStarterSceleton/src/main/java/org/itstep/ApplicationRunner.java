package org.itstep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationRunner 
{
	
    public static void main( String[] args )
    {
    	ApplicationContext ctx = SpringApplication.run(ApplicationRunner.class, args);
    
    }
}
