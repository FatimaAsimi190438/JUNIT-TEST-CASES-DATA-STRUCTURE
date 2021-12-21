package Assignment02;

//Program to implement LinkedList.

public class Linked_List_Implementation{
	int data;    
	Linked_List_Implementation nextPointer;
	
	static int numofElements;
	static Linked_List_Implementation headPointer;
	static Linked_List_Implementation tailPointer;

	public Linked_List_Implementation(){
		nextPointer=null;
	}
		
	//function to add element into the linked list.
	public void add(int number){
		System.out.println("Adding element at the back of the list : " + number);
		Linked_List_Implementation node = new Linked_List_Implementation();
		node.data=number;
		
		if(numofElements==0){
			headPointer=node;
			tailPointer=node;
		}
		else{
			tailPointer.nextPointer=node;
			tailPointer=node;
		}
		numofElements++;
		
	}

	//function to add element at the front of the list.
	public void pushFront(int number){
		System.out.println("Inserting element at the front of the list : " + number);
		Linked_List_Implementation node = new Linked_List_Implementation();
		node.data=number;
		numofElements++;	
		
		if(headPointer==null){
			headPointer=node;
			tailPointer=node;
		}
		else{
			if(headPointer==tailPointer){
				node.nextPointer=tailPointer;
				headPointer=node;
			}
			else{
				node.nextPointer=headPointer;
				headPointer=node;
			}
		}
	}

	//function to get element at the front of the list.
	public int topFront() throws Exception{
		if(headPointer==null){
			throw new Exception("LinkedList is empty");
		}
		return headPointer.data;
	}


	//function to remove elements from the front of the list.
	public void popFront() throws Exception{
		System.out.println("PopFront Operation.");
		if(headPointer==null){
			throw new Exception("LinkedList is empty");
		}
		numofElements--; 
		if(headPointer==tailPointer){
			headPointer=null;
			tailPointer=null;
		}
		else{
			headPointer=headPointer.nextPointer;
		}
			
	}

	//function to add elements at the back of the list.
	public void pushBack(int number){
		System.out.println("Inserting element at the back of the list : " + number);
		Linked_List_Implementation node = new Linked_List_Implementation();
		node.data=number;
		numofElements++;

		if(tailPointer==null){
			headPointer=node;
			tailPointer=node;
		}
		else{
			tailPointer.nextPointer=node;
			tailPointer=node;
		}
	}

	//function to get element at the back of the list. i.e last element.
	public int topBack() throws Exception{
		if(tailPointer==null){
			throw new Exception("LinkedList is empty!");
		}
		return tailPointer.data;
	}

	//function to display the LinekdList.
	public void display(){
		System.out.print("LinkedList : ");
		System.out.print("[ ");
		Linked_List_Implementation temp = headPointer;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp=temp.nextPointer;
		}
		System.out.println("]");
	}

	//funciton to get size of the list.
	public int size(){
		return numofElements;
	}
}
			

