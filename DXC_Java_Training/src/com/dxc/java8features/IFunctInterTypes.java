package com.dxc.java8features;

public interface IFunctInterTypes {

	public int getData();       /* Supplier Functional Interface Except boolean*/
		
	public void setName(String x); /* Consumer Functional Interface */
	
	public boolean isValid();   /* Predicate Functional Interface */
	
	public int fun(String s);   /* Function Functional Interface */
}
