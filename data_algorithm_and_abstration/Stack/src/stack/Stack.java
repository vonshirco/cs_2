
package stack;

public class Stack {

    public static void main(String[] args) {
        
        /*
       //Stack Implementation using Static Array
       
       //Creating object of stack
       MyStack nums = new MyStack();
       
       //Checking if the Stack is empty
       System.out.println("Stack is Empty: " + nums.isEmpty());
       
       // Performing Operations
       nums.push(15);
       nums.push(8);
       
       System.out.println("You fetched " + nums.peek());
       
       nums.push(10);
       nums.push(7);
       nums.push(23);
       
       
       //To remove or delete the last data
       System.out.println("You removed " + nums.pop());
       
       //To Print the size of the stack
       System.out.println("The size of the stack is " + nums.size());
       
       //Checking if the Stack is empty
       System.out.println("Stack is Empty: " + nums.isEmpty());
       
       nums.push(6);
       nums.push(9);
       
       //To print the elements in the stack
       nums.show();
    */
        
    //Stack Implementation using Dynamic Array
    //Creating object of stack
       MyDStack nums = new MyDStack();
       
//       //Checking if the Stack is empty
//       System.out.println("Stack is Empty: " + nums.isEmpty());
//       
//       // Performing Operations
//       nums.push(15);
//       nums.push(8);
//       
//       System.out.println("You fetched " + nums.peek());
//       
//       nums.push(10);
//       nums.push(7);
//       nums.push(23);
//       
//       
//       //To remove or delete the last data
//       System.out.println("You removed " + nums.pop());
//       
//       //To Print the size of the stack
//       System.out.println("The size of the stack is " + nums.size());
//       
//       //Checking if the Stack is empty
//       System.out.println("Stack is Empty: " + nums.isEmpty());
//       
//       nums.push(6);
//       nums.push(9);
//       
//       //To print the elements in the stack
//       nums.show();

        //Adding elements in the Stack
        nums.push(5);
        nums.show();
        nums.push(10);
        nums.show();
        nums.push(15);
        nums.show();
        nums.push(20);
        nums.show();
        nums.push(25);
        nums.show();
        nums.push(30);
        nums.show();
        nums.push(35);
        nums.show();
        nums.push(40);
        nums.show();
        
        //Removing Elements in the Stack
        nums.pop();
        nums.show();
        
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        
    }
    
}
