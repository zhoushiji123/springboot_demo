package com.example;

import com.example.util.Md5;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {

	@Test
	public void contextLoads() {
		String mes = "zhoushiji310";
		System.out.println("md5 = "+ Md5.getMd5(mes));
	}

}
