package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUsername());


		/*System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).getGreeting());
		System.out.println(ctx.getBean(SetterInjectedController.class).getGreeting());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreeting());

		 */
	}

}
