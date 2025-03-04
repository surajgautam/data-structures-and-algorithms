package com.surajgautam.datastructures.and.algorithms.linkedlist;


import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList<T> implements LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    /*
        Time Complexity of O(1)
     */
    @Override
    public void add(T value){
        size++;
        Node<T> node;
        if(this.head == null){
            node = new Node<>(value, null);
            this.head = node;
            this.tail = node;
        }else{
            node = new Node<>(value, null);
            this.tail.setNext(node);
            this.tail = node;
        }
    }

   /*
        Time Complexity of O(1)
    */
   @Override
   public void addToHead(T value){
       size++;
       this.head = new Node<>(value, this.head);
    }

    @Override
    public void addToPosition(int position, T value) {
       if(position == 1 && this.head == null){
           add(value);
       }else{
           Node<T> node = this.head;
           int counter = 1;
           while(node!=null){
               if(counter == position-1){
                   size++;
                   Node<T> newNode = new Node<>(value, node.getNext());
                   node.setNext(newNode);
               }
               counter++;
               node = node.getNext();
           }
           if(position > counter){
               throw new RuntimeException("The position is out of bound");
           }
       }
    }

    /*
        Time Complexity of O(n)
     */
    @Override
    public void delete(){
        size--;
        Node<T> node = this.head;
        while(node!=null){
            if(node.getNext() == this.tail){
                node.setNext(null);
                this.tail = node;
            }
            node = node.getNext();
        }
    }

    /*
        Time Complexity of O(1)
     */
    @Override
    public void deleteHead(){
        size--;
        Node nextNode = this.head.getNext();
        this.head.setNext(null);
        this.head = nextNode;
    }

    @Override
    public void deleteOfPosition(int position) {
        if(position == 1 && this.head == null){
            throw new RuntimeException("Cannot delete in empty linked list");
        }else{
            Node<T> node = this.head;
            int counter = 1;
            while(node!=null){
                if(counter == position-1){
                    node.setNext(node.getNext().getNext());
                    break;
                }
                counter++;
                node = node.getNext();
            }
        }
        size--;
    }

    @Override
    public List<T> getAllValues() {
        List<T> values = new ArrayList<>();
        if(this.head != null) {
            Node<T> node = this.head;
            while (node != null) {
                values.add(node.getValue());
                node = node.getNext();
            }
        }
        return values;
    }

    /*
        Time Complexity of O(n)
     */
    @Override
    public void printAll(){
        if(this.head == null){
            System.out.println("List is empty");
        }
        Node<T> node = this.head;
        while(node!=null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    @Override
    public int size() {
        return this.size;
    }

}
