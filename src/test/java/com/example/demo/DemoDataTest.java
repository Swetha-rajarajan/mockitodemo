package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DemoDataTest 
{
	
	DemoData dm;
	
	@BeforeEach
	public void init()
	{
		dm = new DemoData();// real object
	}
	
	@Test
	public void test01()
	{
		int carcount = dm.getCars().size();
		List<String> data = dm.addCar("Bentley");
		assertEquals(carcount+1, data.size());
	}
	
	@Test
	public void test02()
	{
		DemoData dm1 = Mockito.mock(DemoData.class);// dummy
		
		System.out.println("Mockito object result "+ dm1.getCars());
		
		System.out.println("Real object result "+ dm.getCars().get(0));
		
		List <String> dummyCarList = new ArrayList<String>();
		
		dummyCarList.add("Porche");
		when(dm1.getCars()).thenReturn(dummyCarList);
		
		System.out.println("Mockito object result "+ dm1.getCars().get(0));
		
		DemoData dm3 = Mockito.spy(DemoData.class);
		System.out.println("Spy object result "+ dm3.getCars().get(1));
		
	}

}





