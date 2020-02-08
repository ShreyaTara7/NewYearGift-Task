package com.epam.newyeargift;
//import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import java.util.List;

public class Check 
{
	static ArrayList<Chocolates> alc=new ArrayList<Chocolates>(); 
	static ArrayList<Sweets> als=new ArrayList<Sweets>(); 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of gifts");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the choice \n 1.Chocolates\n 2.Sweets");
		int ch=sc.nextInt();
			switch (ch) 
			{
				case 1:inputChoc();			
						break;
				case 2:inputSweet();
						break;	

				default:System.out.println("Enter the number between 1 ans 2");
						break;
		}
	}
		System.out.println("Enter the lower limit weight");
		int min=sc.nextInt();
		System.out.println("enter the upper limit weight");
		int max=sc.nextInt();
				
		if(!(alc.isEmpty()))
		  {
			System.out.println(alc);
		  }
		if(!(als.isEmpty()))
		  {
			  System.out.println(als);
		  }		
		System.out.println("Total Weight of Candies :"+(Total_weight(alc,als))+" grams");
		HashMap<String, Integer> hmc=new HashMap<String, Integer>();
		for(Chocolates choc : alc)
			{
				hmc.put(choc.get_choc_name(),choc.getPrice());
			}
		Map<String, Integer> hm=sort_chocolates(hmc);
		System.out.println("After sorting with respect to Values\n");
		 for (Map.Entry<String, Integer> dis : hm.entrySet()) 
		 	{ 
	            System.out.println("Chocolate_name = " + dis.getKey() +  
	                          ", Price = " + dis.getValue());
		 	}
		 System.out.println("candies in between range of min and max");
		 for(Chocolates choc : alc)
				{
			 		if(choc.getWeight()>=min && choc.getWeight()<=max)
			 			{
			 				System.out.println(choc);
				 
			 			}
				}
		 for(Sweets sw : als)
			{
		 		if(sw.getWeight()>=min && sw.getWeight()<=max)
		 			{
		 				System.out.println(sw);
			 
		 			}
			}
		 
		
	}

	public static HashMap<String, Integer> sort_chocolates(HashMap<String, Integer> hm) 
	{
		 List<Map.Entry<String, Integer> > ll = 
	               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
	  
	        
	        Collections.sort(ll, new Comparator<Map.Entry<String, Integer> >() 
	        { 
	            public int compare(Map.Entry<String, Integer> i1,  
	                               Map.Entry<String, Integer> i2) 
	            { 
	                return (i1.getValue()).compareTo(i2.getValue()); 
	            } 
	        }); 
	          
	        
	        HashMap<String, Integer> hm2 = new LinkedHashMap<String, Integer>(); 
	        for (Map.Entry<String, Integer> j : ll) { 
	            hm2.put(j.getKey(), j.getValue()); 
	        } 
	        return hm2; 
		
	}

	public static int Total_weight(ArrayList<Chocolates> ac,ArrayList<Sweets> as) 
	{
		int sum=0;
		for(Chocolates choc : ac)
		{
			sum+=choc.getWeight();
		}
		for(Sweets sw : as)
		{
			sum+=sw.getWeight();
		}
		
		return sum;
	}

	public static void inputSweet() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sweet name");
		String name=sc.next();
		System.out.println("Enter the sweet price");
		int price=sc.nextInt();
		System.out.println("Enter the sweet weight");
		int weight=sc.nextInt();
		if(name.equals("kalakand"))
		{
			Kalakand ka=new Kalakand(name,  price, weight);
			als.add(ka);						
		}
		else 
		{
			Kheer kh=new Kheer(name, price, weight);
			als.add(kh);			
		}		
	}

	public static void inputChoc() 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Chocolate name");
		String name=sc.next();
		System.out.println("Enter the Chocolate price");
		int price=sc.nextInt();
		System.out.println("Enter the Chocolate weight");
		int weight=sc.nextInt();
		if(name.equals("kitkat"))
		{					
			Kitkat ki=new Kitkat(name, price, weight);
			alc.add(ki);	
		}
		else 
		{
			Lottie_chocopie lcp=new Lottie_chocopie(name, price, weight);
			alc.add(lcp);			
		}		
	}

}
 