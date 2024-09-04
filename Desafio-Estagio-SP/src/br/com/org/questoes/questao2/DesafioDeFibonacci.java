package br.com.org.questoes.questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class DesafioDeFibonacci {

    //TODO DESAFIO A SER IMPLEMNETADO
//    2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
//    (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
//    ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
//    IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;


    static Scanner input = new Scanner(System.in);
    public static ArrayList<String> fibonacci(int n) {
        ArrayList<String> secFibo = new ArrayList<String>();
        int v1 = 0;
        int v2 = 1;
        int x;

        if (n < 2) {
            secFibo.add(Integer.toString(n));
            return secFibo;
        } else {
        for (int i = 2; i <= 30; i++) {
            x = v1 + v2;
            v1 = v2;
            v2 = x;
            secFibo.add(Integer.toString(v2));
        }
        return secFibo;
        }
    }

    public  static  void  valitadeNumber(){
        System.out.print("Qual numero deseja verificar ?");
        int n = input.nextInt();

        String value = Integer.toString(n);
        ArrayList<String> sequencia = fibonacci(n);
        if (!sequencia.contains(value)) {
            System.out.print("O Numero "+ n +" Não consta na  Sequencia ->"+sequencia );
        }else {
            System.out.print("O Numero "+ n +" Esta Presente na Seqeuncia ->"+sequencia);
        }

    }


    public static void main(String[] args) {
        valitadeNumber();
    }
}
