package com.jagan.learning;

public class SinglyLinkedList {
	 public static void main(String[] args) {            
	        SinglyLinkedList list = new SinglyLinkedList();    
	        list.addNode(10);    
	        list.addNode(22);    
	        list.addNode(33);    
	        list.addNode(44);    
	        list.display();    
	    }    	       
	  class Node{    
	        int data;    
	        Node next;    
	            
	        public Node(int data) {    
	            this.data = data;    
	            this.next = null;    
	        }    
	    }    
	    public Node top = null;    
	    public Node bottom = null;    	        	   
	    public void addNode(int data) {   	    	
	    	Node newNode = new Node(data);    	            	           
	        if(top == null) {    	              
	            top = newNode;    
	            bottom = newNode;    
	        }    
	        else {    	             
	            bottom.next = newNode;    	            
	            bottom = newNode;    
	        }    
	    }    	      
	    public void display() {    	        
	        Node current = top;    	            
	        if(top == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Nodes of singly linked list: ");    
	        while(current != null) {    
	               
	            System.out.print(current.data + " ");    
	            current = current.next;             
	        }    
	        System.out.println();    
	    }    	        	   
}   
