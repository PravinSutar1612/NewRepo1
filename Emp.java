package Java_IO_25_april_serialization;

import java.io.Serializable;
//Serializable  is a marker interface 
//marker interface are empty interface 
public class Emp implements Serializable{

	int  empid;
	String name;
	String address;
	Emp(){}
	public Emp(int empid, String name, String address) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
	}
	void display()
	{
		System.out.println(empid +"  "+ name +"  "+address);
	}
	
}
