package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class MyUtils {
	//receives: theName - a String containing a name that will be properly formatted in a //    uniform style
	// returns: a String formatted with first letter of each word in uppercase
	//      all letters after first letter in word in lowercase
	//      all extra spaces removed before and after each word of received String
	//      returned string is copy of received string in described format
	// example use:
	//  String name1 = MyUtils.properFormat("  JOEY THE TiGeR   ");
	//  assertTrue(name1.equals("Joey The Tiger"));
	public static String properFormat(String theName)
	{
		String temp = "";
		boolean atSpace=true; // so that first letter gets capitalized...
		theName = theName.trim();
		for(int i=0; i< theName.length(); i++)
		{
			if(Character.isWhitespace(theName.charAt(i)) && !atSpace)
			{
				atSpace=true;
				temp += ' ';
			}
			else if (atSpace == true)
			{
				if(!Character.isWhitespace(theName.charAt(i)))
				{
					temp += Character.toUpperCase(theName.charAt(i));
					atSpace = false;
				}
			}
			else
			{
				temp += Character.toLowerCase(theName.charAt(i));
				atSpace = false;
			}
		}// end for
		return temp;
	}


	//receives: String to count number of newLine chars in ('\n')
	//returns:  the number of newlines in the received String
	//Example use:
	// int num = MyUtils.numberLines("Hello \nWelcome\n");
	//  assertTrue(num == 2);
	public static int numberLines(String data)
	{
		int count=0;
		for(int i=0; i<data.length(); i++)
		{
			if (data.charAt(i) =='\n')
				count++;
		}
		return count;
	}
	// receives: a date as a GregorianCalendar instance
	// returns: received date as a string in format mm/dd/yyyy
	// Example use:
	//  String someDate = MyUtils.dateToString(new GregorianCalendar(2018,0,1))
	//  assertTrue(someDate.equals("1/1/2018"));  // remember months are 0-11
	public static String dateToString(GregorianCalendar date)
	{  
		String temp="";
		int month = date.get(Calendar.MONTH);
		month++; // add 1 due to zero-based months
		int day = date.get(Calendar.DAY_OF_MONTH);
		int year = date.get(Calendar.YEAR);
		temp = month + "/" + day + "/" + year;
		return temp;
	}

	// receives: theDate as a String in format mm/dd/yyyy
	//  pre:  theDate is in format mm/dd/yyyy
	// returns: received date as a correct GregorianCalendar object
	public static GregorianCalendar stringToDate(String theDate)
	{
		StringTokenizer tokenizer = new StringTokenizer(theDate, "/");
		String temp = tokenizer.nextToken();  // grabs up to "/"
		int month=0, day=1, year=2000;  // default date values
		try {
			month = Integer.parseInt(temp);
			month--;  // zero-based months
			temp = tokenizer.nextToken();
			day = Integer.parseInt(temp);
			temp = tokenizer.nextToken();
			year = Integer.parseInt(temp);
		}
		catch(NumberFormatException e) {
			System.out.println("error extracting date, using default date");
		}
		return new GregorianCalendar(year, month, day);
	}
	public static String stripSpaces(String theId) {
		// TODO Auto-generated method stub
		String temp="";
		int count=0;
		for(int i=0; i< theId.length(); i++)
		{
			if(!Character.isWhitespace(theId.charAt(i)))
			{
				temp += theId.charAt(i);
				count ++;
				if(count == 6)
					break;
			}
		}
		return temp;
	}
	//receives: a String
	// returns true if the received String is all alphabetic and/or numeric
	//     characters only, returns false if not
	// Example call:  boolean valid = MyUtils.isValid("xyz{}zz[]");
	//			      assertFalse(valid);
	public static boolean isValid(String aString)
	{
		if(aString.equals(""))
			return false;  // not alphanumeric chars if empty
		for(int i=0; i< aString.length(); i++)
		{
			if(!Character.isLetterOrDigit(aString.charAt(i)))
				return false;
		}
		return true;
	}
	//receives: theId - a string of characters and maxLength, # of chars to strip string down to
	//returns: a String of the first maxLength alphanumeric characters in given theId
	//  returns empty string if theId is empty or contains no alphanumeric chars.
	public static String stripNonAlpha(String theId, int maxLength) {
		// TODO Auto-generated method stub
		String temp="";
		int count=0;
		for(int i=0; i< theId.length(); i++)
		{
			if(Character.isAlphabetic(theId.charAt(i)) ||
					Character.isDigit(theId.charAt(i)))
			{
				temp += theId.charAt(i);
				count ++;
				if(count == maxLength)
					break;
			}
		}
		return temp;
	}
	//receives: descriptor - value to print out with time stamp
	// task: prints timeStamp to std output with date(yyyy-mm-dd) and time (HH:mm:ss) and descriptor
	//        descriptor is begins or ends or currently or some such indicator of what the time is describing
	// returns: nothing
	public static void printTimeStamp(String descriptor)
	{
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
		System.out.println("Execution " + descriptor + "  at: " + timeStamp);
	}

	// displays array of ints to screen, 10 per line w/indexes
	// Example call:  showIntArray(list1, 4)
	// Example call:  showIntArray(list2, 10);
	// Example call:  showIntArray(list3, 65);
	public static void showIntArray(int [] list, int count)
	{
		int numValues = 0;
		for(int i = 0; i < count ; i++)
		{
			System.out.println("[" + i + "] : " + list[i] + " ");
			numValues++;
		}
		System.out.println("");
	}
	// displays array of ints to screen, 10 per line w/indexes
	// Example call:  showDoubleArray(list1, 4)
	// Example call:  showDoubleArray(list2, 10);
	// Example call:  showDoubleArray(list3, 65);
	public static void showDoubleArray(double [] list, int count)
	{
		int numValues = 0;
		for(int i = 0; i < count ; i++)
		{
			System.out.println("[" + i + "] : " +list[i] + " ");
			numValues++;
		}
		System.out.println("");
	}

	// displays array of ints to screen, 10 per line w/indexes
	// Example call:  showStringArray(list1, 4)
	// Example call:  showStringArray(list2, 10);
	// Example call:  showStringArray(list3, 65);
	public static void showStringArray(String [] list, int count)
	{
		for(int i = 0; i < count ; i++)
		{
			System.out.println("[" + i + "] : " +list[i] + "  " );				  
		}
		System.out.println("");
	}

}
