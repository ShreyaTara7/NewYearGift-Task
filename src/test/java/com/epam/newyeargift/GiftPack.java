package com.epam.newyeargift;

abstract class GiftPack 
{
	abstract void display();
	private int price;
	private int weight;
	public GiftPack(int price,int weight) 
	{
		this.price=price;
		this.weight=weight;
	}
		public int getPrice()
		{
			return price;
		}
		public int getWeight()
		{
			return weight;
		}
		
		@Override
		public String toString()
		{
			return "Price :Rs."+this.price+"\nWeight :"+this.weight;
		}
		// TODO Auto-generated constructor stub
	}


