package com.myself.example.mybean;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;


@Component
public class MyBean implements ApplicationRunner,Ordered {

	public MyBean(ApplicationArguments args) {
		
		boolean debug = args.containsOption("debug");
//		List<String> files = args.getNonOptionArgs();
		
		System.out.println("===============" + debug);
	}

	/*@Override
	public void run(String... as) throws Exception {
		
		for (String string : as) {
			
			System.out.println("++++++++++++" + string);
		}
		
	}*/

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("+++++++++1+++++++++++++=");
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
}
