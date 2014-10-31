package com.Interface;

import java.io.Serializable;

public class Item implements Serializable{
	private static final long serialVersionUID = 1L;
	
	String name;
	int price;
	String date;
	
	public Item(String n, int p, String d){
		name = n;
		price = p;
		date = d;
	}
	
	public Item(){
	}

	public void setname(String name){
		this.name = name;
	}
	
	public void setprice(int price){
		this.price = price;
	}
	
	public void setdate(String date){
		this.date = date;
	}
	
	public String getname(){
		return name;
	}
	public int getprice(){
		return price;
	}
	
	public String getdate(){
		return date;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s, Price: %d, date: %s ", name, price, date);
	}


}
