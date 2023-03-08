package com.careerit.helloworldgit;

import com.careerit.helloworldgit.util.CommonUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldGitApplication.class, args);
		System.out.println("HelloWorld Application is Started....");
		System.out.println(CommonUtil.maskAccountNumber("9876543210"));
	}

}
