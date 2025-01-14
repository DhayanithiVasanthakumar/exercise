package com.program.newfeatures.supplier;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierExample implements Supplier<Object>{

	//way 1->
	@Override
	public Object get() {
		Calendar calendar=Calendar.getInstance();
		
		return calendar.getTime();
	}

	
	
	public static void main(String[] args) {
		SupplierExample se=new SupplierExample();
		//System.out.println(se.get());
		
		
		//way 2->use lambda
		Supplier<Object> suplier=()->{
			Calendar calendar=Calendar.getInstance();
			return calendar.getTime();
			
		};
		System.out.println(suplier.get());
		
	}

	
}
