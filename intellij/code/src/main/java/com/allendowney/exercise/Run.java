package com.allendowney.exercise;

public class Run {



  public static void main(String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);

    node1.next = node2;
    node2.next = node3;
    node3.next = null;

    System.out.println("node1 next object data is " + node1.next.data.toString());
    System.out.println("node2 next object data is " + node2.next.data.toString());
    System.out.println("node3 object data is " + node3.data.toString());

  }

}
