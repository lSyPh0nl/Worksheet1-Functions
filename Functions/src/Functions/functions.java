package Worksheet1;

public class functions {

	
	
	
	
	public static void outputArrayValues(int[] arrayParameter)	
	{
		for (int i = 0; i <= arrayParameter.length -1; i++) 
		{
		System.out.println("Element " + i + " is: " + arrayParameter[i]);  
		}
	}
	
	
	
	

	public static void main(String[] args) 
	{
	
		int[] intigerArray1 = new int [10]; 
		int[] intigerArray2 = new int [5]; 
		
		
		System.out.println("Array 1 - ");
		
		for (int i = 0; i <=9; i++)
		{
			intigerArray1[i] = (int)(Math.random()*10) + 1;
		}
		outputArrayValues(intigerArray1);
		
        System.out.println("Array 2 - ");
		
		for (int x = 0; x <=4; x++)
			{
			intigerArray2[x] = (int)(Math.random()*5) + 1;
			}
		outputArrayValues(intigerArray2);
		
	}
}


