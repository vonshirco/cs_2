package linkedlist;


public class Main {
    public static void main(String[] args) {
        //Using builtin feature instead of creating our own
        MyList list = new MyList();
        
        //Method to take a value
        list.insert(18);
        list.insert(45);
        list.insert(12);
        
        list.insertAtStart(25);
        
        //Insert at a certain location
        list.insertAt(0, 55); //index, data
        
        //Delete a value
        list.deleteAt(2); //(index)
        
        //To show the values
        list.show();
        
    }
   
}
