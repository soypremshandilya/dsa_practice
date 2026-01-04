package LinkedList;
public class linkedListTraverser {
public static class Node {
  int data;
  Node next;

  Node(int data){
    this.data = data;
    this.next = null;
  }
}

static void traverse(Node head){
  Node temp = head;
  while(temp != null){
    System.out.println(temp.data+"");
    temp = temp.next;
  }
}

  public static void main(String[] args){
  Node a = new Node(5);
  Node b = new Node(4);
  Node c = new Node(6);
  Node d = new Node(14);
  Node e = new Node(15);

  a.next = b;
  b.next = c;
  c.next = d;
  d.next = e;

  traverse(a);
}
}
