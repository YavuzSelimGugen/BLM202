/*
 * @file LİnkedList
 * @description Liste yapısınınu oluşturan dosya.
 * @ 1. ödev
 * @date 6.03.2018
 * @author Yavuz Selim Gügen / yavuzselim.gugen@stu.fsm.edu.tr
*/
package newpackage;

public class LinkedList <Type> {
    Node<Type> head;
    int size;

    public LinkedList() {
        head = null;
    }
    public void clear () {
        head = null;
        size = 0;
    }
    //changeData metodu verilen nodu aranan node ile değiştirir. Bu işlem sadece data 
    //kısımları için gerçerlidir. Arnan node objesi değişmez sadece dataları değişir. 
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
    // Aşağıdaki metodlar klasik Singly Linked List metodlarıdır.
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
    
    public String print() {
        String result = "";
        Node<Type> temp = head;
        while (temp != null) {
            result +=("("+temp.taban + "*x^"+ temp.üs + ") ->");
            temp = temp.nextNode;
        }
        result+=(" null");
        return result;
    }
}
