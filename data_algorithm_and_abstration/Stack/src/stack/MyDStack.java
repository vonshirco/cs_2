
package stack;

public class MyDStack {
    
    //Creating an array even before we push elements
    int capacity = 2; //Here you can go beyond it expanding and shrinking
    int stack[] = new int[capacity]; 
    int top = 0; //for a counter
    
    //Method push to add elements
    public void push(int data){ //void because we are just adding values and not expecting any value
        //Checking if the Stack is full
        if(size()==capacity)
        expand(); //Calling the method when the stack is full
        
        stack[top] = data;
        top++;
    } 
    
    private void expand() { //Private so as you can access the method in this class only
        int length = size(); //get the current length
        //Create a new stack/array
        int newStack[] = new int[capacity*2]; //Doubling the current stack
        //Copying elements from the current array to the new array
        System.arraycopy(stack, 0, newStack, 0, length);//fromWhichArray,fromIndex,toWhichArray,insertFromIndex,numberOfElementsYouCopy 
        //Replace the stack reference with the newStack reference 
        stack = newStack;
        //Replace the capacity with the new capacity
        capacity = capacity*2; //or capacity *= 2;
    }
    
    //Method pop to remove elements (This will also fetch the values and remove them)
    public int pop(){
        //to fetch the values
        int data = 0;
        if(isEmpty()){ //Checking if stack is empty before remoevin elements to avoid exceptional error
            System.out.println("Stack is Empty");
        }else{ //Otherwise remove the top/last element
            top--; //decrementing the top value to the value you want to remove
            data = stack[top];
            stack[top] = 0; //Making where you fetched your data zero (deleting)
            //Shrink the stack everytime you remove the element
            shrink();
        } 
        return data;
    }
    
    public void shrink(){
        int length = size();
        if(length<=(capacity/2)/2) //If number of array is less than a quarter 1/4
            capacity = capacity/2; //Reduce the capacity by half (half the size of array)
        
        //Creating a new array
        int newStack[] = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);//fromWhichArray,fromIndex,toWhichArray,insertFromIndex,numberOfElementsYouCopy 
        //Replace the stack reference with the newStack reference 
        stack = newStack;
        
    }
    
    //Method pop to fetch the first/top element in the stack (It won't delete it)
     public int peek(){
        //to fetch the values
        int data;
        data = stack[top-1];
        return data;
    }
     
    //To get the size of the stack
     public int size(){
         return top;
     }
     
    //To check if stack is empty
     public boolean isEmpty(){
         return top <=0 ; //Stack is truely empty if it is 0 or less else it is false
     }
    
    //Method show to print the elements in the stack (fetch)
    public void show(){
        for(int n : stack){
            System.out.print(n + " ");
        }
        System.out.println();
    }

}

