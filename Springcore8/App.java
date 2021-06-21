package Springcore8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.http.codec.CodecConfigurer.CustomCodecs;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	context.registerShutdownHook();
		Customer obj=(Customer)context.getBean("customer");
		 obj.customerDetails();
        
    }
	

}
