package com.myself.example.exit;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

@Component
public class ExitCodeGeneratorCustomer implements ExitCodeGenerator {

	@Override
	public int getExitCode() {
		
		System.out.println("exit +++++++++++++++++++++");
		return 0;
	}

}
