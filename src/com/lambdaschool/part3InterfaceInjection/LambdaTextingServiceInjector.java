package com.lambdaschool.part3InterfaceInjection;

public class LambdaTextingServiceInjector implements MessageServiceInjector
{
		@Override
		public Processor getProcess()
		{
			return new MyApplication(new LambdaMessagingImp());
		}

}
