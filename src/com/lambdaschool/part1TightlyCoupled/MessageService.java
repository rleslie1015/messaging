package com.lambdaschool.part1TightlyCoupled;

public class MessageService
{
	public void sendMessage(String message, String address)
	{
		System.out.println("For " + address + ": " + message);
	}

	public String readMessage()
	{
		return "Not Implemented"; //lrod
	}
}
