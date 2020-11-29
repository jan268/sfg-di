package guru.springframework.sfgdi;

import guru.springframework.sfgdi.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		//MyController myController = new MyController(); What is the differance?

		String greetings = myController.sayHello();

		System.out.println(greetings);
	}

}
