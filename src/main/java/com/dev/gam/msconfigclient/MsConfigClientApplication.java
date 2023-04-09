package com.dev.gam.msconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class MsConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConfigClientApplication.class, args);
	}

	/*@Autowired
	public void setEnv(Environment e)
	{
		System.out.println(e.getProperty("usuario"));
	}*/

}
