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
public class Node <Type>{
    Type taban;
    Type üs;
    
    Node <Type> nextNode;
    
    Node(Type taban, Type üs) {
        this.taban = taban;
        this.üs = üs;
    }
}

