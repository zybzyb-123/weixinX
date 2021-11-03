package com.qf.weixinuser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class WeixinUserApplicationTests {

	@Test
	public void contextLoads() {

		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");

		set.contains("A"); // 判断这个key是否存在


		String str1 ="A123";
		String str2 ="B456";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println("ABCDEa123abc".hashCode()); // 165374702
		System.out.println("ABCDFB123abc".hashCode()); //  165374702


	}

}
