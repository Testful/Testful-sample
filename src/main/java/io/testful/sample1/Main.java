package io.testful.sample1;

import io.testful.core.Testful;
import io.testful.core.TestfulParams;

public class Main {

	public static void main(String[] args) {

		TestfulParams params = new TestfulParams();
		params.configFolder = "D:/DEVEL/projetos/Testful/src/main/resources/jsonplaceholder/todo";
		
		Testful testfull = new Testful(params);
		
		testfull.run();
		
	}
	
	
}
