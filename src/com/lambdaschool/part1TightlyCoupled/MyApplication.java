package com.lambdaschool.part1TightlyCoupled;

public class MyApplication
{
	private MessageService msgSrv = new MessageService();

	public void send(String msg, String receiveAddress)
	{
		//rules of message
		msg = msg + "\n *** FOR YOU EYES ONLY ***";
		msgSrv.sendMessage(msg, receiveAddress);
	}
}
