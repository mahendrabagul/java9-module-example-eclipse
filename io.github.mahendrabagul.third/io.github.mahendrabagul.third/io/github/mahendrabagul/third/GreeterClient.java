package io.github.mahendrabagul.third;

import io.github.mahendrabagul.second.Greeter;

public class GreeterClient {

	public static void main(String arg[]) {
		Greeter greeter = new Greeter();
		System.out.println(greeter.greet("Mahendra"));
	}

}