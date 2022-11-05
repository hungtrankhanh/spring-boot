package com.example.demo;

import com.example.demo.func.PlayMusic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var cx = SpringApplication.run(DemoApplication.class, args);
		var aa = cx.getBean(PlayMusic.class);
		aa.play1();
		aa.play2();
		aa.play3(true);
	}

}
