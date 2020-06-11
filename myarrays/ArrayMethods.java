package myarrays;

public class ArrayMethods {
//Receives: integer array called list. and an integer that is the number of elements in the array
//Returns: iterates and returns the values of the array list
//Example: receives list=[1, 2 , 3] and prints "1" new line "2" new line "3" 
	public static void printArray(int [] list, int numElements)
	{
		for(int index = 0; index < numElements; index ++)
		{
			System.out.println(list[index]);
		}
	}
	//Receives: integer list array, integer that indicates the values of the list, and a value to add to the list of e
	//Returns:nothing, but manipulates values in the list to be added to the value given
	//Example: list = [1,2,3] value= [10] manipulates list to be list=[11,12,13]
	public static void increaseByValue(int [] list, int numElements, int value)
	{
	for (int index = 0; index < numElements; index++)
	{
		list[index] = list[index] + value;
	}
	}
	//Receives:integer list array, integer that indicates the values of the list.
	//Returns:the sum of all the values in the list array
	//Example:list=[1, 2 , 3] returns 6
	
	public static int sumOfArrayValues(int []list, int numElements)
	{
	int sum = 0;
		for (int index = 0; index < numElements; index++)
		{
			sum += list[index];
		}
		return sum;
	}
	//Receives:integer array called list, 2 indexes of the list
	//Returns: Nothing, but swaps the values for the indexes given
	//Example: list=[1, 2 , 3] location1 =[0] location2 = [1] list is now list =[2,1,3]
	public static void swapArrayValues(int [] list, int location1, int location2)
	{
		if (location1<0 || location1 >= list.length)
		{
			return;
		}
		if (location2<0 || location2 > list.length)
		{
			return;
		}
		
		int num1 = list[location1];
		list[location1]= list[location2];
		list[location2] = num1;
	}

}

