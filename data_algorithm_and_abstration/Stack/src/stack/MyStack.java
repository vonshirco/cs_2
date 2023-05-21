
package stack;

public class MyStack {
    
    //Creating an array even before we push elements
    int stack[] = new int[5]; //You can also make it dynamic or take from the user
    int top = 0; //for a counter
    
    //Method push to add elements
    public void push(int data){ //void because we are just adding values and not expecting any value
        //Checking if the stack is full
        if(top==5){
            System.out.println("Stack is full");
        }else{
            stack[top] = data;
            top++;
        }
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
        } 
        return data;
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
            System.out.println(n + " ");
        }
    }
}
