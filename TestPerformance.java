import java.io.*;
import java.util.*;
class TestPerformance 
{
	public static void createArrayList(List MyArrayList)
	{
		int i;
		for(i=0;i<50000;i++)
		{
			MyArrayList.add(i);
		}
	}
	public static void createLinkedList(List MyLinkedList)
	{
		int i;
		for(i=0;i<50000;i++)
		{
			MyLinkedList.add(i);
		}
	}
	public static void printArrayList(List myArrayList)
	{
		int i;
		for(i=0;i<myArrayList.size();i++)
		{
			System.out.print(myArrayList.get(i) + "\t");
		}

	}
	public static void printLinkedList(List myLinkedList)
	{
		int i;
		for(i=0;i<myLinkedList.size();i++)
		{
			System.out.print(myLinkedList.get(i) + "\t");
		}

	}
	
	public static void main(String args[])
	{
		List myArrayList=new ArrayList();
		List myLinkedList =new LinkedList();
		
		long start=new java.util.Date().getTime();
		
		createArrayList(myArrayList);

		long end=new java.util.Date().getTime();
		printArrayList(myArrayList);

	

		
	
		long Lstart=new java.util.Date().getTime();
		createLinkedList(myLinkedList);
		printLinkedList(myLinkedList);
		long Lend=new java.util.Date().getTime();

		
		System.out.println("Array Time :-- " + (end-start)/1000);
		System.out.println("Time Of Linked List :-- " + (Lend-Lstart)/1000);
			
		
	}
}