package Assignment10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
    	context.registerShutdownHook();
		Customer obj=(Customer)context.getBean("customer");
		obj.customerDetails();
        
    }
}
