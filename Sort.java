public class Sort {
  
  public void Bubble(LinkedList list)
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
  
  public static void Main(String[] args)
  {
    LinkedList numbers = new LinkedList();
    
  }
}
