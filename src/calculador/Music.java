/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculador;

import java.util.Scanner;
/**
 *
 * @author Edson
 */
public class Music {
    public static void main(String[] args) {
        double time, totalTime;
        int amount;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quanto tempo dura sua musica? ");
        time = entrada.nextDouble();
        System.out.println("Quantas vezes você ouviu a musica? ");
        amount = entrada.nextInt();
        totalTime = amount * time;
        System.out.println ("Você escutou " + totalTime + " minutos!");
    }
}