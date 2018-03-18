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
public class test2 {
    public static void main(String[] args) {
        String s1= "18x^75-4x^56+18x^37+18x^19-18x^9-12";
        String s2= "17x^56+18x^44-11x^37-21x^19+94";
        String[] parts = s1.split("(?=\\+|\\-)");
        for (String part : parts) {
            String[] split = part.split("x\\^");
            for (String string : split) {
                System.out.print(split.length+" ");
            }
            System.out.println("");
        }
        String v = "-18";
        System.out.println(Integer.parseInt(v));
    }
}
