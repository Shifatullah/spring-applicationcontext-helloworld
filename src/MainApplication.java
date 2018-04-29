import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	public static void main(String[] args){
		
		// Create context and load beans definitions
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Get bean
		System.out.println("Getting bean instance...");
		HelloWorld objHelloWorld = (HelloWorld) context.getBean("helloworld");
		objHelloWorld.printMessage();

		// Wait for user to enter exit
		System.out.println("Press any key to exit...");
		System.console().readLine();		
	}
}