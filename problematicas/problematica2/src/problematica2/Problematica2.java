/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica2;

/**
 *
 * @author Lenovo
 */
public class Problematica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero = 0;
        int numero_limite = 110;
        int contador = 2;
        String presentado = " ";

        while (numero < numero_limite) {
            numero = numero + contador;
            contador = contador + 2;
            presentado = String.format("%s\n%d", presentado, numero);
        }
        System.out.printf("%s\n", presentado);
    }
}
