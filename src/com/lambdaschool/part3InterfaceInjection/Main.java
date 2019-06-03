package com.lambdaschool.part3InterfaceInjection;

public class Main
{
	public static void main(String[] args)
	{
		String myMsg = "Come Here== I want to see you.";
		String myAddress = "Mr. Watson";

		MessageServiceInjector injector;
		Processor app;

		// send lambda message
		injector = new LambdaMessageInjector();
		app = injector.getProcess();
		app.sendMessage(myMsg, myAddress);

		//send lambda texting
		injector = new LambdaTextingServiceInjector();
		app.sendMessage(myMsg, myAddress);

	}

}
