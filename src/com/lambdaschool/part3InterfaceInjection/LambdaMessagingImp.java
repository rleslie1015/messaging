package com.lambdaschool.part3InterfaceInjection;

public class LambdaMessagingImp implements MessageService
{
	@Override
	public void sendMessage(String message, String address)
	{
		System.out.println("For " + address + ": " + message);
	}

	@Override
	public String readMessage()
	{
		return "Not Implemented";
	}
}
