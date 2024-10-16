package com.program.newfeatures.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class AgeCkeck {

	public static void main(String[] args) {
		
		
		/* test()
		 * 
		 */
		Predicate<Integer> predicateObj= (no) -> no>60;
		System.out.println(predicateObj.test(65));
		System.out.println(".........");

		//......................................................

		Predicate<String> pobj=(name) -> (name.length() >8);
		System.out.println(pobj.test("abcdef"));
		System.out.println(".........");
		
		//......................................................
		ArrayList al=new ArrayList();
		al.add(15);
		System.out.println(al.size());
		
		Predicate<Collection> p=arrayListObj -> arrayListObj.size() > 0;
		System.out.println(p.test(al));
		
		System.out.println(".........");

		//......................................................
		
		
		int[] ar= {8,6,9,12,15,7};
		
		Predicate<Integer> p1= no -> (no%2!=0);
		Predicate<Integer> p2= no -> (no<10);

		check(p1,ar);
		System.out.println(".........");

		//negate() -> athu thavara
		check(p1.negate(),ar);
		System.out.println(".........");

		//and() > add another predicate
		check(p1.and(p2),ar);
		System.out.println(".........");

		//or() -> both(condition are satisfied) are present
		check(p1.or(p2),ar);
		System.out.println(".........");

		
	}

	private static void check(Predicate<Integer> p, int[] ar) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.length;i++) {
			boolean result=p.test(ar[i]);
			
			/*
			 * instead of print true or false 
			 * it print only numbers
			 */
			if(result) {
				System.out.println(ar[i]);
			}
		}
	}

}
