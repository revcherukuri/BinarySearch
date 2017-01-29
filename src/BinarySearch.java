import java.util.Scanner;

public class BinarySearch {
	public static void main(String[]args){
		int counter;
		int num;
		int select;
		int array[];
		int first;
		int last;
		int middle;
		Scanner read = new Scanner(System.in);
		System.out.println("How many numbers are in your array?");
		num = read.nextInt();
		
		array = new int[num];
		System.out.println("Please enter " + num + " integers.");
		for(counter = 0; counter < num; counter ++)
		{
			array[counter] = read.nextInt();
		}
		
		System.out.println("What number are you searching for?");
		select = read.nextInt();
		first = 0;
		last = num -1;
		middle = (last+first)/2;
		while( first <= last )
	      {
	         if ( array[middle] < select )
	           first = middle + 1;
	         else if ( array[middle] == select )
	         {
	           System.out.println(select + " is at " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(select + " is not found.");
	}


	
	

}
