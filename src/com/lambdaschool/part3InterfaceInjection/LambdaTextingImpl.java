package com.lambdaschool.part3InterfaceInjection;

public class LambdaTextingImpl implements MessageService
{
	@Override
	public void sendMessage(String message, String address)
	{
		System.out.println(message + ": " + address.toUpperCase());
	}

	@Override
	public String readMessage()
	{
		return "Not Implemented";
	}
}
