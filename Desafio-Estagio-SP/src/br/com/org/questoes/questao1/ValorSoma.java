package br.com.org.questoes.questao1;

public class ValorSoma {

    //TODO DESAFIO A SER REPONDIDO
    //    1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
    //    Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
    //    Imprimir(SOMA);
    //    Ao final do processamento, qual será o valor da variável SOMA?



    //IMPLEMNETAÇÂO DO DESAFIO
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice){
            k += 1;
            soma += k;
        }
        System.out.println("O valor da soma é " + soma);
    }

}
