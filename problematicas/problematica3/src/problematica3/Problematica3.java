/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica3;

/**
 *
 * @author LAB.ELECT
 */
public class Problematica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int limite = 37;
        int numerador = 1;
        int suma = 1;
        do {
            numerador = numerador + suma;
            suma = suma + 2;
            System.out.println(numerador);
        } while (numerador < limite);
    }

}
