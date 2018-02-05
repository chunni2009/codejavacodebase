package com.mk.test;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		List<String> al = new ListAdder().addList();

		System.out.println("Output::" + al.stream().findFirst());
		System.out.println("Output any::" + al.stream().count());

		al.stream().filter(line -> !"ZTest".equals(line)).collect(Collectors.toList());


	}

}
