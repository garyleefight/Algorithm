package com.lsr.algo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by lsr on 16/9/8.
 */
public class MyLinkedList {
    private Node first_node;
    private Node current;
    private static class Node{
        Node next;
        int value;
        public Node(int value) {
            this.next = null;
            this.value=value;
        }

    }

    public MyLinkedList() {
        this.first_node=null;
        this.current=null;
        this.initial();
    }

    private void initial(){
        File file=new File("./src/com/lsr/algo/f.txt");
        Scanner s= null;
        try {
            s = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(s.hasNext()){
            if(first_node==null){
                first_node=new Node(s.nextInt());
                current=first_node;
                continue;
            }
            current.next=new Node(s.nextInt());
            current=current.next;
        }
    }

    public void show(){
        if(first_node==null){
            System.out.println("No Element Found");
            return;
        }
        current=first_node;
        while(current!=null){
            System.out.print(current.value+",");
            current=current.next;
        }
    }

    public Node getFirst_node() {
        return first_node;
    }

    public void setFirst_node(Node first_node) {
        this.first_node = first_node;
    }

    public Node reverse(Node head){
        if(head==null||head.next==null){
            first_node=head;
            return head;
        }
        Node node=reverse(head.next);

        node.next=head;
        head.next=null;
        return head;
    }

    public Node reverse1(Node head){
        Node front=null;
        if(head==null&&head.next==null){
            return head;
        }
        Node next=head.next;
        while(next!=null){
            front=head;
            if(front.next.equals(next)){
                front.next=null;
            }//let the last node.next ==null;
            head=next;
            next=next.next;
            head.next=front;
        }
        return head;
    }

}
