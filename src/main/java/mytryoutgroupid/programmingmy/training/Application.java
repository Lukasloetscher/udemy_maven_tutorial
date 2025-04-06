package mytryoutgroupid.programmingmy.training;

import java.util.ArrayList;
import java.util.List;



public class Application{ 

	public void greet() {
		List<String>greetings = new ArrayList<>();
		greetings.add("Hello");
		greetings.add("Hallo");
		greetings.add("Bonjour");
		for(String greeting : greetings){
			System.out.println("Greeting; "+greeting);
		}
	
	};

	public Application(){
			System.out.println("Inside Application");

		};

	public static void main(String[] args){
		System.out.println("Starting Application");
		Application app = new Application();
	};
};
