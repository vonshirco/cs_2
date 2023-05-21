
package queue;

public class MyQueue {
    int queue[] = new int[5];
    int size;
    int front; //will refer to the front element
    int rear; //will refer to a rear element
    
    //Method to insert values/elements
    public void enQueue(int data){
        //Checking if the queue is not full
        if(!isFull()){
            queue[rear] = data; //rear at first is in the position of the front
            rear = (rear + 1)%5; //shift the position of rear in a circular loop
            size++; //everytime we add a value the size increments too
        }else{
            System.out.println("Queue is full");
        }   
    }
    
    //Method to remove/delete values/elements in a queue
    public int deQueue(){
        //Here we just move our front(which references to a value)
        int data = queue[front]; //to get the value of front(first value)
        //Checking if the queue is not empty
        if(!isEmpty()){
            front = (front + 1)%5; //Move front to the next location in a circular loop
            size--; //Reduce the size of the queue
        }else{
            System.out.println("Queue is empty");
        }
        return data;
    }
    
    //Methods to print the elements
    public void show(){
        System.out.print("Elements : ");
        for(int i=0; i<size; i++){
            System.out.print(queue[(front+i)%5] + " ");
        }
    }
    
    //Method to get the size of the Queue
    public int getSize(){
        return size;
    }
    
    //Method to check if the Queue is empty or not
    public boolean isEmpty(){
        return getSize()==0;
    }
    
    //Method to check if the Queue is full or not
    public boolean isFull(){
        return getSize()==5;
    }
}
