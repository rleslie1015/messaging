package com.lambdaschool.part3InterfaceInjection;

public class MyApplication implements Processor
{
	public MessageService msgSrv;

	public  MyApplication(MessageService msgSrv)
	{
		this.msgSrv = msgSrv;
	}

	@Override
	public void sendMessage(String msg, String address)
	{
		msg = msg + "\n *** FOR YOUR EYES ONLY ***";
		msgSrv.sendMessage(msg, address);
	}

	@Override
	public String readMessage()
	{
		return "Not Implemented";
	}
}
