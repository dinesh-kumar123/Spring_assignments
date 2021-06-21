package Assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext factory= new AnnotationConfigApplicationContext(config.class);
		Question ques=factory.getBean(Question.class);
		ques.viewDetails();
	}

}
