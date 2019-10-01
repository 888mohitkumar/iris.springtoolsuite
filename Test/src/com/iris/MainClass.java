package com.iris;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(8);
		al.add(9);
		al.add(10);
		al.add(11);
		//Stream s = al.stream().filter((s)->{s>1});
		/*
		 * Stream s = al.stream().filter(new Predicate<Integer>() {
		 * 
		 * @Override public boolean test(Integer t) { // TODO Auto-generated method stub
		 * return (t>1); } });
		 */
		
		al.parallelStream();
		 List<Integer> collect = al.stream().filter(( t) ->{return (t>1);}).collect(Collectors.toList());		
		
		 collect.forEach(System.out::println);
		
		
		Random r = new Random();
		r.ints().limit(5).sorted().forEach(System.out::println);
		
		
		Stream ss=al.stream().map(new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
		});
		
		ss.forEach(System.out::println);
		
		
	}

}