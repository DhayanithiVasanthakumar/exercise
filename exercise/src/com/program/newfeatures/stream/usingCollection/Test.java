package com.program.newfeatures.stream.usingCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * as same as using array
 */

public class Test {

	public static void main(String[] args) {
		List<Integer> l =new ArrayList<Integer>();
		
		l.add(10);
		l.add(25);
		l.add(40);
		l.add(30);
		l.add(60);
		l.add(60);
		l.add(30);
		
		 l
		 //intermediate operation yethana venalu use panikalam
		.stream()
		//.count());
		.distinct()
		.sorted()
		.forEach(System.out::println);
		 
		 
		 /*
		  * decending order or user defined order
		  */
		 
		 List<String> s=new ArrayList<String>();
		 s.add("Dhaya");
		 s.add("Aswini");
		 s.add("Naren");
		 s.add("Hari");
		 
		 s
		 .stream()
		 .distinct()
		// .sorted((elem1 , elem2) -> 0)//positive-> for sort insertion order 
		 							// negative value->reverse insetrion order
		 							// 0-> for insertion order
		 
		// .sorted((elem1,elem2)->elem1.compareTo(elem2))//for ascending oder 
		 .sorted((elem1,elem2)->elem2.compareTo(elem1))//for decending oder 

		 .forEach(System.out::println);
		 
		 
		 /*
		  * using map intermediate operation
		  */
		 
		 //number
		 System.out.println("using map intermediate operation in number");
		 
		 l
		 .stream()
		 .map(no -> no/2)
		 .forEach(System.out::println);
		 
		 
		 
		 // string 
		 
		 System.out.println("using map intermediate operation in String");
		 s
		 .stream()
		 .map(name -> name +" B.E...,")
		 .forEach(System.out::println);
		 
		 /*
		  * additional terminal operations
		  */
		 
		 System.out.println("terminal operations ");
		 System.out.println();
		 System.out.println("Reduce");
		 // it give single result from a sequence of elements
		 Optional<Integer> result=l
		 .stream()
		 .reduce((no1,no2) -> no1+no2);
		 
		 System.out.println(result.get());
		 
		 System.out.println("........");
		 
		 /*
		  * toArray
		  */
		 Object[]  result2=l
		 .stream()
		 .toArray();
		 
		 for(Object o:result2) {
			 System.out.println(o);
		 }
		 System.out.println("........");

		 /*
		  * max
		  */
		 
		 Optional<Integer> maxRes= l
		 .stream()
		 .max((ele1,ele2) -> ele1.compareTo(ele2));
		 
		 System.out.println(maxRes.get());
		 
		 System.out.println("........");
		 
		 /*
		  * parallel stream
		  */
		 System.out.println("parallel stream");
		 l
		 .parallelStream()
		 .forEachOrdered(System.out::println);

		 System.out.println("........");

		 
		 /*
		  * perform opertions in hashmap
		  */
		 System.out.println("perform opertions in hashmap");
		 
		 HashMap<String,Integer> hm=new HashMap<String,Integer>();
		 //      key     value
		 hm.put("dhaya", 100);
		 hm.put("aswini", 101);
		 hm.put("naren", 102);
		 hm.put("hari", 103);
		 
		 //direct ah hashmap ah stream pana mudiyathu so atha first entryset ah vangi appram stream panamudiyum
		 
		 hm
		 .entrySet()
		 .stream()
		 //sort panum pothu yetha base pani sort pananum nu inga kuduthukalam eg: key ah vachi ah ila vaue ah vachi ah 
		 .sorted(Map.Entry.comparingByKey())
		 .forEach(System.out::println);
		 
		 
		//convert map into list/set
		 List<String> list=  hm
		 .keySet()
		 .stream()
		 .collect(Collectors.toList());//.toSet and etc...
		 System.out.println(list);
		 
		 //filter the data
		 boolean filterRecord= hm
		 .keySet()
		 .stream()
		 .anyMatch(name -> name.startsWith("d"));
		 
		 System.out.println(filterRecord);
		 
	}

}
