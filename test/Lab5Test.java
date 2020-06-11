package test;

import java.util.Scanner;

import myarrays.ArrayMethods;

public class Lab5Test {
	public static void main(String []args)
	{
		int [] list = {40, 55, 98};
		int [] list1 = {1,2,3,4,5,6,7,8,9,10};
		int [] list2 = {1,2,3,4,5,6,7,8,9,10};
		int [] listShort = {10, 20, 30};
		int [] listOne = {122};
		int [] listEmpty = {};
		int count = list.length;
		utils.MyUtils.printTimeStamp("Testing begins");
		System.out.println("*****Now testing method ArrayMethods.printArray()");
		System.out.println("Should see these values down the console output: " 
				+ arrayAsString(list,count));
		ArrayMethods.printArray(list, count);

		count = list1.length;
		System.out.println("Should see these values down the console output: " 
				+ arrayAsString(list1,count));
		ArrayMethods.printArray(list1, count);
		count = listEmpty.length;
		System.out.println("Should see these values down the console output (which is an empty array - nothing printed): " 
				+ arrayAsString(listEmpty,count));
		ArrayMethods.printArray(listEmpty, count);
		System.out.println("*****Now testing method ArrayuMethods.increaseByValue()");
		count =  list2.length;
		System.out.println("Array BEFORE increaseByValue: \n" + arrayAsString(list2, count));
		ArrayMethods.increaseByValue(list2, count, 13);
		boolean success = true;
		System.out.println("Array AFTER increaseByValue (13) : \n" + arrayAsString(list2, count));
		for(int i = 0; i < count; i++)
		{
			if(list2[i] != list1[i] + 13)
				success = false;
		}
		if(success) 
			System.out.println("**SUCCESS, method increaseByValue() test #1 working");
		else
			System.out.println("**FAILURE, method increaseByValue() test #1 has a failure");
		// test #2
		int [] list3 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array BEFORE increaseByValue: \n" + arrayAsString(list3, count));
		ArrayMethods.increaseByValue(list3, count, -2);
		System.out.println("Array AFTER increaseByValue (-2) : \n" + arrayAsString(list3, count));
		success = true;
		for(int i = 0; i < count; i++)
		{
			if(list3[i] != list1[i] + -2)
				success = false;
		}
		if(success)
			System.out.println("**SUCCESS, method increaseByValue() test #2 working...");
		else
			System.out.println("**FAILURE, method increaseByValue() test #2 has a failure");
		count = listOne.length;
		System.out.println("Array BEFORE increaseByValue: \n" + arrayAsString(listOne, count));
		ArrayMethods.increaseByValue(listOne, count, 100);
		success = true;
		System.out.println("Array AFTER increaseByValue of (100) : \n" + arrayAsString(listOne, count));
		count = listShort.length;
		System.out.println("Array BEFORE increaseByValue: \n" + arrayAsString(listShort, count));
		ArrayMethods.increaseByValue(listShort, count, 100);
		success = true;
		System.out.println("Array AFTER increaseByValue of (100) : \n" + arrayAsString(listShort, count));
		count = listEmpty.length;
		System.out.println("Array BEFORE increaseByValue: \n" + arrayAsString(listEmpty, count));
		ArrayMethods.increaseByValue(listEmpty, count, 100);
		success = true;
		System.out.println("Array AFTER increaseByValue of (100) : \n" + arrayAsString(listOne, count));



		System.out.println("Now testing ArrayMethods.sumOfArrayValues()");
		count = list1.length;
		int expectedInt = 55;
		int sum = ArrayMethods.sumOfArrayValues(list1, count);
		success = (sum == expectedInt);
		if(success)
			System.out.println("**SUCCESS, sum Of values in list1:"  + arrayAsString(list1, count) + 
					" was "+ sum + " and is correct.");
		else
			System.out.println("**FAILURE, sum of values in list1: " + arrayAsString(list1, count) + 
					" was " + sum + " but should have been " + expectedInt);
		expectedInt = 185;
		count = list2.length;
		sum = ArrayMethods.sumOfArrayValues(list2, count);
		success = (sum == expectedInt);
		if(success)
			System.out.println("**SUCCESS, sum Of values in list2:"  + arrayAsString(list2, count) + 
					" was "+ sum + " and is correct.");
		else
			System.out.println("**FAILURE, sum of values in list2: " + arrayAsString(list2, count) + 
					" was " + sum + " but should have been " + expectedInt);	
		count = list3.length;
		expectedInt = 35;
		sum = ArrayMethods.sumOfArrayValues(list3, count);
		success = (sum == expectedInt);
		if(success)
			System.out.println("**SUCCESS, sum Of values in list3:"  + arrayAsString(list3, count) + 
					" was "+ sum + " and is correct.");
		else
			System.out.println("**FAILURE, sum of values in list3: " + arrayAsString(list3, count) + 
					" was " + sum + " but should have been " + expectedInt);
		expectedInt = 60;
		int [] list4 = {10, 20, 30};
		count = list4.length;
		sum = ArrayMethods.sumOfArrayValues(list4, count);
		success = (sum == expectedInt);
		if(success)
			System.out.println("**SUCCESS, sum Of values in list4:"  + arrayAsString(list4, count) + 
					" was "+ sum + " and is correct.");
		else
			System.out.println("**FAILURE, sum of values in list4: " + arrayAsString(list4, count) + 
					" was " + sum + " but should have been " + expectedInt);	
		expectedInt = 100;
		int [] list5 = {100};
		count = list5.length;
		sum = ArrayMethods.sumOfArrayValues(list5, count);
		success = (sum == expectedInt);
		if(success)
			System.out.println("**SUCCESS, sum Of values in list5:"  + arrayAsString(list5, count) + 
					" was "+ sum + " and is correct.");
		else
			System.out.println("**FAILURE, sum of values in list5: " + arrayAsString(list5, count) + 
					" was " + sum + " but should have been " + expectedInt);	
		expectedInt = 0;
		int [] list6 = {};
		count = list6.length;
		sum = ArrayMethods.sumOfArrayValues(list6, count);
		success = (sum == expectedInt);
		if(success)
			System.out.println("**SUCCESS, sum Of values in list6:"  + arrayAsString(list6, count) + 
					" was "+ sum + " and is correct.");
		else
			System.out.println("**FAILURE, sum of values in list6: " + arrayAsString(list6, count) + 
					" was " + sum + " but should have been " + expectedInt);	

		System.out.println("*****Now testing method ArrayMethods.swapArrayValues()");
		System.out.print("Enter yes to continue on to test of Method #4, no to stop:");
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine().trim().toLowerCase();
		if(!answer.equals("yes"))
		{
			return;
		}
		System.out.println("Here is original list: " + arrayAsString(list1,  list1.length));
		int loc1 = 0;
		int loc2 = list1.length-1;
		ArrayMethods.swapArrayValues(list1,  loc1,  loc2);
		System.out.println("Here is array after swapping value at ["+loc1+"]" + " with value at ["+loc2+"]" 
				+ "\n                       " + arrayAsString(list1,  list1.length));
		System.out.println("Here is original list: " + arrayAsString(listShort,  listShort.length));
		loc1 = 0;
		loc2 = listShort.length-1;
		ArrayMethods.swapArrayValues(listShort,  loc1,  loc2);
		System.out.println("Here is array after swapping value at ["+loc1+"]" + " with value at ["+loc2+"]" 
				+ "\n                       " + arrayAsString(listShort,  listShort.length));
		System.out.println("Here is original list: " + arrayAsString(listShort,  listShort.length));
		loc1 = 0;
		loc2 = 1;
		ArrayMethods.swapArrayValues(listShort,  loc1,  loc2);
		System.out.println("Here is array after swapping value at ["+loc1+"]" + " with value at ["+loc2+"]" 
				+ "\n                       " + arrayAsString(listShort,  listShort.length));
		System.out.println("Here is original list: " + arrayAsString(listShort,  listShort.length));
		loc1 = 0;
		loc2 = 199;
		ArrayMethods.swapArrayValues(listShort,  loc1,  loc2);
		System.out.println("Here is array after swapping value at ["+loc1+"]" + " with value at ["+loc2+"]" 
				+ "\n                       " + arrayAsString(listShort,  listShort.length));
		System.out.println("Here is original list: " + arrayAsString(listShort,  listShort.length));
		loc1 = 10;
		loc2 = -199;
		ArrayMethods.swapArrayValues(listShort,  loc1,  loc2);
		System.out.println("Here is array after swapping value at ["+loc1+"]" + " with value at ["+loc2+"]" 
				+ "\n                       " + arrayAsString(listShort,  listShort.length));
		System.out.println("Here is original list: " + arrayAsString(listEmpty,  listEmpty.length));
		loc1 = -2;
		loc2 = 3;
		ArrayMethods.swapArrayValues(listEmpty,  loc1,  loc2);
		System.out.println("Here is array after swapping value at ["+loc1+"]" + " with value at ["+loc2+"]" 
				+ "\n                       " + arrayAsString(listEmpty,  listEmpty.length));
		utils.MyUtils.printTimeStamp("Testing ENDS");
	}
	// receives list - an int array
	//   	    count - number of elements in the array
	// returns a String with count values from the array in it shown -- all on 1 line.
	// example use:
	//    given int [] list = { 110, 120, 130 };    array of 3 elements
	//    String result = ArrayMethods.arrayAsString(list, 3);
	//    result would be: [110, 120, 130]
	public static String arrayAsString(int []list, int count)
	{
		String retValue = "";
		if(count > 0)
			retValue += "[";
		for(int i=0; i<count-1; i++)
			retValue += list[i] + ", ";
		if(count > 0)
			retValue += (list[count-1]) + "]";
		if(count == 0)
			retValue += "[ ]";
		return retValue;
	}

}

