package com.lambdaschool.part2ConstructorInjection;

public class Main
{
	public static void main(String[] args)
	{
		MyApplication messaging = new MyApplication(new MessageService());
		messaging.send("Hello 2", "lrod");
	}

}
