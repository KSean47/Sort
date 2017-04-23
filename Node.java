public class Node {

 private int id = 0;
 private String name = "";
 private Node next;
 private int data;
 
 public Node(int id, String name) {
  this.id = id;
  this.name = name;
  this.next = null;
 }
 
 public Node(int data) 
 {
    this.data = data;
    this.next = null;
  }
 
 public Node(String name)
 {
   this.id = 0;
   this.name = name;
   this.next = null;
 }

  public int getData() {
    return this.data;
  }
  
  public void setData(int data) {
    this.data = data;
  }
  
 public Node getNext() {
  return next;
 }

 public void setNext(Node node) {
  this.next = node;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }
 
 public String toString() {
  return "ID : "+this.id+" Name : "+this.name;
 }
 
  public void print() 
  {
    System.out.print(this.data + " ");
  }
}
