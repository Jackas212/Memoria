/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoria;

import java.util.Scanner;

/**
 *
 * @author darkangel
 */
public class Memoria {

    public final static int OVERFLOW = 200000000;
    private String salida;
    String tempOOM = "";

    public Memoria(int leng) {
        for (int i = 0; i < leng; i++) {
            try {
                this.salida += "a";
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                i=leng;
            }
        }
        this.salida = tempOOM.toString();
    }

    public String getOom() {
        return salida;
    }

    public static void main(String[] args) {
        Memoria javaHeapTest = new Memoria(OVERFLOW);
        System.out.println(javaHeapTest.getOom().length());
        System.out.println(OVERFLOW);
        Scanner sc = new Scanner(System.in);
        System.out.println("precione cualquier numero");
        sc.nextInt();
    }
}
