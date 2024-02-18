package org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Javastream {

	@Test
	public void addnames() {
		
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("anbu");
		names.add("babu");
		names.add("aadheeran");
		names.add("marutha");
		names.add("ananda");
		names.add("vadivel");
		names.add("akash");
		
		int count=0;
		for (int i = 0; i < names.size(); i++) {
			
			String actual=names.get(i);
			if (actual.startsWith("a")) 
			{
				
				count++;
			}
			
		}
		System.out.println(count);
	}
	//@Parameters({"URL"})
	//@Test
	public void stream() {
ArrayList<String> names=new ArrayList<String>();
		
		names.add("anbu");
		names.add("babu");
		names.add("aadheeran");
		names.add("marutha");
		names.add("ananda");
		names.add("vadivel");
		names.add("akash");
		
		Long c=names.stream().filter(s->s.startsWith("a")).count();
		
		System.out.println(c);
		
		//print the count name start with a
		long d= Stream.of("anbu","babu","aadheeran","marutha","ananda","vadivel","akash").filter(s->
		{
			s.startsWith("a");
			return true;
			}).count();
		
		//System.out.println(urlname);
		System.out.println(d);
		//print tha all names of array list
		names.stream().filter(s->s.length()>0).forEach(s->System.out.println(s));
		
		//print particular name
		names.stream().filter(s->s.length()>6).limit(1).forEach(s->System.out.println(s));
		
		
		//PRINT NAMES LAST LETTER AS "A" WITH UPPERCASE
		
		Stream.of("anbu","babu","aadheeran","marutha","ananda","vadivel","akash")
		.filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print names sorted 
		
		List<String> name=Arrays.asList("anbu","babu","aadheeran","marutha","ananda","vadivel","akash");
		
		name.stream().filter(s-> s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
		
		//merging two different list
ArrayList<String> names1=new ArrayList<String>();
		
		names1.add("Don");
		names1.add("Man");
		names1.add("Women");
		
		
		Stream<String> newstream=Stream.concat(names1.stream(), name.stream());
		//newstream.sorted().forEach(s-> System.out.println(s));
		
		
		boolean match=newstream.anyMatch(s->s.equalsIgnoreCase("anbu"));
		System.out.println(match);
		Assert.assertTrue(match);
	}
	@Test
	public void streamcollect() {
		
		List<String> coll=Stream.of("anbu","babu","aadheeran","marutha","ananda","vadivel","akash")
		.filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(coll.get(0));
		
		//print the unique number
		//sort the array
		List<Integer> name=Arrays.asList(1,2,3,5,5,7,9,3);
		//name.stream().distinct().forEach(s->System.out.println(s));
		
		
		//sort the array - 3rd index
		List<Integer> number=name.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(number.get(2));
		
		
	}	
	@Test(dataProvider ="getdata")
	public void pass(String username, String password){
		
		System.out.println(username);
		System.out.println(password);
		
	}
	@Test
	public void example() {
		System.out.println("hello");
		Assert.assertTrue(false);
	}
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
		data[1][0]="secondtusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdtusername";
		data[2][1]="thirdpassword";
		
		return data;
	}
	
	
}
