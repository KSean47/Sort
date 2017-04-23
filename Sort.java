public class Sort {
  
  public static void Bubble(LinkedList list)
  {
    //loop through the list
    for(int i = 0; i <= list.getSize(); i++)
    {
      Node current = list.getHead();
      
      //iterate through list
      while(current != null)
      {
        
        if(current.getData() > current.getNext().getData())
        {
          Node swap;
          swap = current;
          current = current.getNext();
          current.setNext(swap);
         
        }
        current = current.getNext();
      }
    }
    
  }
  
  public static void main(String[] args)
  {
    LinkedList numbers = new LinkedList();
    
    Node nHead = new Node(4);
    
    numbers.setHead(nHead);
    numbers.add(1, 7);
    numbers.add(2, 6);
    numbers.add(3, 3);
    numbers.add(4, 5);
    numbers.add(5, 9);
    numbers.add(6, 2);
    numbers.add(7, 8);
    numbers.add(8, 1);
    numbers.add(9, 0);
    
    numbers.print();
    
    Bubble(numbers);
    
    numbers.print();
    
  }
}
