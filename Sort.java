public class Sort {
  
  public static void Bubble(LinkedList list)
  {
    for(int i = 0; i <= list.getSize(); i++)
    {
      Node current = list.getHead();
      
      while(current.getNext() != null)
      {
        
        if(current.getData() > current.getNext().getData())
        {
          int swap;
          swap = current.getData();
          current.setData(current.getNext().getData());
          current.getNext().setData(swap);
         
        }
        current = current.getNext();
      }
    }
    
  }
  
  public static void main(String[] args)
  {
    LinkedList numbers = new LinkedList();
    
    int x1 = (int)(Math.random() * 10);
    
    Node nHead = new Node(x1);
    
    int x2 = (int)(Math.random() * 10);
    int x3 = (int)(Math.random() * 10);
    int x4 = (int)(Math.random() * 10);
    int x5 = (int)(Math.random() * 10);
    int x6 = (int)(Math.random() * 10);
    int x7 = (int)(Math.random() * 10);
    int x8 = (int)(Math.random() * 10);
    int x9 = (int)(Math.random() * 10);
    int x10 = (int)(Math.random() * 10);

    numbers.setHead(nHead);
    numbers.add(1, x2);
    numbers.add(2, x3);
    numbers.add(3, x4);
    numbers.add(4, x5);
    numbers.add(5, x6);
    numbers.add(6, x7);
    numbers.add(7, x8);
    numbers.add(8, x9);
    numbers.add(9, x10);
    
    numbers.print();
    
    Bubble(numbers);
    
    numbers.print();
    
  }
}
