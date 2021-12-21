package Assignment02;

//Array Programs - ArrayInsertion, ArrayDeletion, DisplayArray, LinearSearch, BinarySearch, BubbleSort

import java.util.*;
public class Full_Array{
	static int [] array;  //array
	static int size;      //size increases as elements are filled in the array.	
	
	public Full_Array(){
		array=new int[100]; //length of array = 100
		size=0;
	}
	
	
	//function to get values from the user.
	/*static public void getValues(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of values to insert:");
		int numofElem = input.nextInt(); //number of elements to insert.
		for(int i=0;i<numofElem;i++){
			System.out.println("Enter the num"+i+":");
			insert(input.nextInt(),i);
		}
	} */
	public void set(int[] array1, int s)
	{
		this.size=s;
		for(int i=0;i<size;i++)
		{
			array[i]=array1[i];
		}
	}
	public int [] get()
	{
		return array;
	}
	//function to insert elements in the array.
	static public void insert(int number,int position){ // 10, 5
		for(int i=size-1;i>=position;i--){ // i = 
			array[i+1]=array[i];
		}
		array[position]=number;
		size++;
	}
     /*public void set(int s)
     {

    	 this.size=s;
     }*/
	//function to delete elements from the array.
	static public void delete(int position){
		for(int i=position;i<size-1;i++){
			array[i]=array[i+1];
		}
		size--;
	}

	//function to display the array.
	static public void display(){
		for(int i=0;i<size;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void setsize(int [] ar,int s) {
		array=ar;
		size= s;
	}
	//function to do Linear Search on the array.
	static public boolean linearSearch(int number){
		for(int i=0;i<size;i++){
			if(number==array[i]){
				return true;
			}
		}
		return false;
	}

	//fuction to sort the array.
	static public void bubbleSort(){
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-i-1;j++){
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
				
	
	//function to to Binary Search on the array.
	static public boolean binarySearch(int number,int low, int high){
		if(low>high){
			return false;
		}
		int mid=low + (high-low)/2;
		if(array[mid]==number){
			return true;
		}
		if(array[mid]>number){
			return binarySearch(number,low,mid-1);
		}
		else{
			return binarySearch(number,mid+1,high);
		}
		
	}
	public void set11(int ar[], int n )
	{
		size=n;
		array=ar;
	}
	}
/*
	//main function
	public static void main(String [] args){
		Full_Array array = new Full_Array(); //create an array.
		array.getValues(); //get values from the user.
		array.display();   //display the array.

		array.insert(10,4);//insert num=10 at pos=4
		array.display();   //display the array.

		array.delete(3);   //delete num at pos=3 from the array.
		array.display();   //display the array.

		System.out.println(array.linearSearch(40)); //check 40 is present in the array using linearSearch.

		array.bubbleSort();//sort the array.
		array.display();   //display the array.

		System.out.println(array.binarySearch(56,0,size)); //search for num=56 using Binary Search.
	}
}
	*/
			

		
		
		 	