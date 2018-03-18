/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Yavuz
 */
public class LinkedList <Type> {
    Node<Type> head;
    int size;

    public LinkedList() {
        head = null;
    }
    public void changeData (Node<Type> arnan, Node<Type> b) {
        Node<Type> wantedData = head;
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
    public void add(Node <Type> newNode) {
        if(head == null) {
            addFirst(newNode);
        } else {
            addLast(newNode);
        }
        size++;
    }
    public void addFirst(Type data, Type data2) {
        addFirst(new Node(data,data2));
    }

    public void addFirst(Node<Type> newNode) {
        newNode.nextNode = head;
        head = newNode;
    }

    public void addLast(Node<Type> newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node<Type> temp = head;
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

    public boolean remove(Type iData, Type sData) {
        Node<Type> temp = head;
        Node<Type> prev = null;
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
        Node<Type> temp = head;
        while (temp != null) {
            System.out.print("("+temp.taban + "^"+ temp.üs + ") ->");
            temp = temp.nextNode;
        }
        System.out.println(" null");
    }
}
