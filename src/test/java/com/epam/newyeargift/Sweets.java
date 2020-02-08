package com.epam.newyeargift;

public abstract class Sweets extends GiftPack
{
	abstract void display();
	private int price;
	private int weight;
	private String sweet_name;
	
	public Sweets(String sweet_name,int price,int weight) 
	{
		super(price, weight);
		this.sweet_name=sweet_name;
		this.price=price;
		this.weight=weight;
		// TODO Auto-generated constructor stub
	}
	public String get_sweet_name()
	{
		return sweet_name;
	}
	public int getPrice()
	{
		return price;
	}
	public int getWeight()
	{
		return weight;
	}
	public String toString()
	{
		return "\nSweet name :"+this.sweet_name+"\nPrice :Rs."+this.price+"\nWeight :"+this.weight+"grams";
	}

}
