/*
 * @file Node
 * @description Node yapısınınu oluşturan dosya.
 * @ 1. ödev
 * @date 6.03.2018
 * @author Yavuz Selim Gügen / yavuzselim.gugen@stu.fsm.edu.tr
*/
package newpackage;

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
