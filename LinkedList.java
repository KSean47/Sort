public class LinkedList
{
  
  private Node head = null;
  private Node tail = null;
  private int size = 0;

  
  public Node getHead() 
  {
    return this.head;
  }
  
  public Node getTail() 
  {
    return this.tail;
  }
  
  public void setHead(Node newNode) 
  {
    this.head = newNode;
    this.size = 1;
  }

  public int getSize() 
  {
    return this.size;
  }
  
  public void print() 
  {
    if (this.isEmpty()) 
    {
      System.out.println("List is empty.");
    }
    else 
    {
      Node tmp = this.head;
      while (tmp != null) 
      {
        tmp.print();
        tmp = tmp.getNext();
      }
      System.out.println("");
    }
  }
  
  public boolean isEmpty() 
  {
    return this.head==null;
  }
  
  public void add(int index, int data) 
  {
    Node newNode = new Node(data);
    
    if( index > this.size)
      //error
      System.out.println("Index " + index + " does not exist.");
    else 
    {
      // if list is empty, newNode is head
      if (this.isEmpty()) 
      {
        this.head = newNode;
        this.tail = newNode;
      }
      // adds to front of list
      else if (index == 0) 
      {
        newNode.setNext(head);
        this.head = newNode;
      }
      else if (index == this.size) 
      {
        // adds to end of list
        Node current = this.head;
        while (current.getNext() != null) 
        {
          current = current.getNext();
        }
        current.setNext(newNode);
        this.tail = newNode;
      }
      else 
      {
        // adds to middle of list
        Node current = this.head;
        for(int i = 0; i < index - 1; i++) 
        {
          current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
      }
    this.size++;
    }
  }
  
  public void addNode(int index, Node newNode) { 
    if( index > this.size)
      //error
      System.out.println("Index " + index + " does not exist.");
    else {
      // if list is empty, newNode is head
      if (this.isEmpty()) {
        this.head = newNode;
        this.tail = newNode;
      }
      // adds to front of list
      else if (index == 0) {
        newNode.setNext(head);
        this.head = newNode;
      }
      else if (index == this.size) {
        // adds to end of list
        Node current = this.head;
        while (current.getNext() != null) {
          current = current.getNext();
        }
        current.setNext(newNode);
        this.tail = newNode;
      }
      else {
        // adds to middle of list
        Node current = this.head;
        for(int i = 0; i < index - 1; i++) {
          current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
      }
    this.size++;
    }
  }
     
  public void destroy() {
    this.head = null;
    this.tail = null;
  }
  
}