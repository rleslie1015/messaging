package com.lambdaschool.part3InterfaceInjection;

public class LambdaMessageInjector implements MessageServiceInjector
{
	@Override
	public Processor getProcess()
	{
		return new MyApplication(new LambdaMessagingImp());
	}
}
