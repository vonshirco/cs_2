
package queue;

public class Queue {

    public static void main(String[] args) {
        //Creating Object of MyQueue
        MyQueue q = new MyQueue();
        
        //Checking if the Queue is empty or not
        System.out.println("The Stack is Empty: "+q.isEmpty());
        //Checking if the Queue is full or not
        System.out.println("The Stack is Full: "+q.isFull());
        
        //Inserting elements in the Queue
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(3);
        
        //Before removing elements in the queue
        System.out.println("\nElements in the Queue of size "+q.getSize()+" before removal");
        //To Show/Display the elements
        q.show();
       
        //Checking if the Queue is empty or not
        System.out.println("\nThe Stack is Empty: "+q.isEmpty());
        //Checking if the Queue is full or not
        System.out.println("The Stack is Full: "+q.isFull());
        
        //Removing elements in the Queue
        q.deQueue();
        q.deQueue();
        
        //After removing elements in the queue
        System.out.println("\nElements in the Queue of size "+q.getSize()+" after removal");
        q.show();
        
        //Checking if the Queue is empty or not
        System.out.println("\nThe Stack is Empty: "+q.isEmpty());
        //Checking if the Queue is full or not
        System.out.println("The Stack is Full: "+q.isFull());
        
        //Inserting more Elements after dequeueing
        q.enQueue(9);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(7);
        q.enQueue(8);
        
        //After inserting more elements after the removal
        System.out.println("\nElements in the Queue of size "+q.getSize()+" after inserting more elements after removal");
        q.show();
        
        //Checking if the Queue is empty or not
        System.out.println("\nThe Stack is Empty: "+q.isEmpty());
        //Checking if the Queue is full or not
        System.out.println("The Stack is Full: "+q.isFull());
        
    }
    
}
