
package linkedlist;

//Building our own List Class
public class MyList {
    Node head; //First node
    
    //Method to insert elements
    public void insert(int data){
        //Creating a new node (object: a node is also a object)
        Node node = new Node();
        node.data = data; //data which is coming from the user
        node.next = null; //the first node
        
        //Our first head is has null we verify
        if(head == null){ //If this is our first node
            head = node;
        }else{ //if it's not the first node(you already have the first node)
            Node n = head;
            while(n.next != null){ //Travelling till the last node which has null
                n = n.next; //jumping btw nodes
            }
            //It will stop once you get null at the end
            //Then you have to change from null to refer to the new node which you have created
            n.next = node; 
        }
    }
    
    //Insert element at the start
    public void insertAtStart(int data){
        //Involves changing the head location from the current object to the a new object
        //Creating a new node (object: a node is also a object)
        Node node = new Node();
        node.data = data; //data which is coming from the user
        node.next = null; 
        
        node.next = head; //Before assigning the current node to be the head 
        //we make whatever node which was the head to be the next for the new node
        
        head = node;//make the current node the to be the head
    }
    
    //Insert at any Location (will insert it before that specified node)
    public void insertAt(int index, int data){
        //Creating a new node (object: a node is also a object)
        Node node = new Node();
        node.data = data; //data which is coming from the user
        node.next = null; 
        
        //Traversing to the index (location) we wanna change **Traverse*
        //If the index is 2 you have to reach up to 1 (because there is where you make the changes)
        //if we need to add at the start (index zero) we have to check condition
        if(index==0){
            insertAtStart(data);
        }else{
            Node n = head; //Starting from the head node
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            //Change the address of the current node to the new node
            node.next = n.next; 
            //We update the value
            n.next = node;
        } 
    }
    
    //Delete method, you just change the address the element before the one to be deleted
    //To be as that of the deleted one
    public void deleteAt(int index){
        //To delete the first element you just change the head location
        if(index == 0){
        //Change head location
        head = head.next;
        }else{ //if it's not the first element
            //Here we need to traverse
            Node n = head; //Starting from the head node
            Node n1 = null; //Our n1 initially does not reference to anything
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            //To get the reference(address) of the delete one
            n1 = n.next;
            n.next = n1.next; //The n.next needs to be replaced by the n1.next
            //System.out.println("You deleted " + n1.data);
            //delete completely in the memort and be available for Garbage collection
            n1 = null;
            
        }
    }
    
    //Method to print all the values
    public void show(){
        //Travelling through all nodes
        Node node = head; //Starts from the head
        while(node.next != null){
        System.out.println(node.data); //Printing a node
        node = node.next; //Shifting to the next node
        }
        //Printing the last element in the node with null 
        System.out.println(node.data);
    }
    
}
 
