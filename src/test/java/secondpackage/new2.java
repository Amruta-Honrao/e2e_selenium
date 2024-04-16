package secondpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class new2 extends Name1{
	
	
	
	public static void main(String[] args) {

	int abc [] = new int[3];
	List<Integer> i = new ArrayList<>();
	i.add(2);
	i.add(3);
	i.add(5);
	
	
	
	abc[0] = 1;
	abc[1] = 2;
	abc[2] = 3;
	
//	for(int b:abc)
//	{
//		System.out.println(b);
//	}
	
	for (Integer b: i)
	{
	System.out.println(b);	
	}

	Map<String,Integer> mp = new HashMap<>();
	mp.put("amruta", 12);
	mp.put("Viraj", 13);
	
	Set<Map.Entry<String,Integer>> se = mp.entrySet();

	Set<String> keys=mp.keySet();
	
	
	for (Map.Entry<String, Integer> ent:se)
	{
		System.out.println("key is " + ent.getKey() + " and value is " + ent.getValue());
		
	}
	
	Set<Character> mySet= new HashSet<>();
	mySet.add('a');
	mySet.add('b');
	
	for (Character c:mySet)
	{
		System.out.println(c);
	}
	
	WebDriver driver = new ChromeDriver();
	driver.switchTo().defaultContent();
	Actions act = new Actions(driver);
	act.keyDown(Keys.SHIFT).sendKeys("amruta ").keyUp(Keys.CONTROL).build().perform();
	act.moveToElement(null);
	
	

}
}
