package com.lambdaschool.part3InterfaceInjection;

public interface Processor
{
	void sendMessage(String msg, String address);
	String readMessage();
}
