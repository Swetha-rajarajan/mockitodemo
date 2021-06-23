package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class DemoData 
{
	List<String> carList = new ArrayList<String>();
	
	public DemoData()
	{
		carList.add("Swift");
		carList.add("Ertiga");
		carList.add("Lamborgini");
		carList.add("Ferrari");
	}
	
	
	public List<String> getCars()
	{
		return carList;
		
	}
	
	public List<String> addCar(String car)
	{
		carList.add(car);
		
		return carList;
	}

}
