/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import test.LinkedList;
import test.Node;

/**
 *
 * @author Yavuz
 */
public class test3 {

    public static void main(String[] args) {
        LinkedList<String> liste1 = new LinkedList<>();
        LinkedList<String> liste2 = new LinkedList<>();

        liste1.add(new Node(18, 75));
        liste1.add(new Node(4, 56));
        liste1.add(new Node(18, 37));
        liste1.add(new Node(18, 19));
        liste1.add(new Node(18, 9));
        liste1.add(new Node(12, 1));

        liste2.add(new Node(17, 56));
        liste2.add(new Node(18, 44));
        liste2.add(new Node(11, 37));
        liste2.add(new Node(21, 19));
        liste2.add(new Node(94, 1));

        Node temp1 = liste1.head;
        for (int i = 0; i < liste1.size; i++) {
            boolean boo = true;
            Node temp2 = liste2.head;
            for (int j = 0; j < liste2.size; j++) {
                if (temp2.üs.equals(temp1.üs)) {
                    Node newNode = new Node(
                            (int) (temp2.taban) + (int) (temp1.taban),
                            (int) (temp2.üs));
                    liste2.changeData(temp2,newNode);
                    boo = false;
                    break;
                }
                temp2 = temp2.nextNode;
            }
            if (boo) {
                liste2.add(new Node(temp1.taban, temp1.üs));
            }
            temp1 = temp1.nextNode;
        }
        liste1.print();
        System.out.println(liste1.size);
        liste2.print();
    }
}
