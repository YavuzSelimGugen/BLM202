/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Yavuz
 */
public class LinkedList <T> {
    Node<T> head;
    int size;
    

    public LinkedList() {
        head = null;
    }

    public void add(Node <T> newNode) {
        if(head == null) {
            addFirst(newNode);
        } else {
            addLast(newNode);
        }
        size++;
    }
    
    public void changeData (Node<T> arnan, Node<T> b) {
        Node<T> wantedData = head;
        while (wantedData != null) {
            if (wantedData.taban == arnan.taban && wantedData.üs == arnan.üs) {
                break;
            }
            wantedData = wantedData.nextNode;
        }
        if (wantedData == null) {
            System.out.println("Aranan data bulunamadı");
        } else {
            wantedData.taban = b.taban;
            wantedData.üs = b.üs;
        }
    }
    
    public void addFirst(T data, T data2) {
        addFirst(new Node(data,data2));
    }

    public void addFirst(Node<T> newNode) {
        newNode.nextNode = head;
        head = newNode;
    }

    public void addLast(Node<T> newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
        }
    }

    /*
    public boolean insetAfter(Type iData, Type newData) {
        Node<Type> wantedData = head;
        while (wantedData != null) {
            if (wantedData.taban == iData) {
                break;
            }
            wantedData = wantedData.nextNode;
        }
        if (wantedData == null) {
            System.out.println("Aranan data bulunamadı");
            return false;
        } else {
            Node<Type> newNode = new Node(newData);
            newNode.nextNode = wantedData.nextNode;
            wantedData.nextNode = newNode;
            return true;
        }
    }*/

    public boolean remove(T iData, T sData) {
        Node<T> temp = head;
        Node<T> prev = null;
        if (head != null) {
            while (temp != null && !temp.taban.equals(iData) && !temp.üs.equals(sData)) {
                prev = temp;
                temp = temp.nextNode;
            }
            if (temp == null) {
                System.out.println("Aranan data bulunamadı.");
                return false;
            } else {
                prev.nextNode = temp.nextNode;
                size--;
                return true;
            }
        }
        return false;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print("("+temp.taban + "^"+ temp.üs + ") ->");
            temp = temp.nextNode;
        }
        System.out.println(" null");
    }
}
