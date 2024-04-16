package secondpackage;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Name1 {
	
	
	public static void stmethod()
	{
		System.out.println("in paraent");
		
	}
	
	
	public static void main(String[] args)
	{
		String a = "Amruta";
		String b = "Viraj";
	
		a = a+b;
		b = a.substring(0, a.length()-1);
		a = a.substring(b.length()+1);
		
		System.out.println(b);
		System.out.println(a);
		//printFibonacci(10);
		//checkDuplicatechar();
		checkPrime();
		
				
	}
	
	

    public static void printFibonacci(int n) {
     int first = 0; 
     int second = 1;
     int next;
     
    System.out.print(first + " " + second + " ");
     for(int i =2 ; i< n; i++)
     {
    	 System.out.print(first+second+ " ");
    	 next = first+second;
    	 first = second;
    	 second = next;
    	 
     }		
		
	}
    
    public static void checkDuplicatechar()
    {
    	String abc = "amruta am";

    	Map<Character, Integer> mp = new LinkedHashMap<>();
     	
    	
    	for (int i = 0; i< abc.length(); i++)
    	{
    		
    		if(mp.containsKey(abc.charAt(i)))
    		{    						
    		mp.put(abc.charAt(i), mp.get(abc.charAt(i))+1);
    		}
    		else 
    			mp.put(abc.charAt(i),1);
    	}
    	System.out.println(mp);
    	Set<Map.Entry<Character, Integer>> se = mp.entrySet();
    	Iterator<Map.Entry<Character,Integer>> it=se.iterator();
    	
    	while(it.hasNext())
    	{
    		Map.Entry<Character, Integer> etr=it.next();
    		System.out.println("key is " +etr.getKey() +" and value is " + etr.getValue());
    	}
    		
    	}
    
    
    public static void checkPrime()
    {
    	int num, i =1;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number");
    	num= sc.nextInt();
    	
    	for (i =2; i<num; i++)
    	{
    		if (num%i == 0)
    		{
    			System.out.println("Number is not prime :) ");
    			break;
    		}    		
    	   }

    	if (num == i)
    		System.out.println("Number is Prime ,,,,enjoy");
    }
}
