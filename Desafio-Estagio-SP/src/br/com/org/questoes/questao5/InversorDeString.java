package br.com.org.questoes.questao5;
import java.util.Scanner;

public class InversorDeString {

    //TODO DESAFIOA  SER FEITO
//    5) Escreva um programa que inverta os caracteres de um string.
//
//    IMPORTANTE:
//    a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//    b) Evite usar funções prontas, como, por exemplo, reverse;
//
//    NÃO SE ESQUEÇA DE INSERIR O LINK DO SEU REPOSITÓRIO NO GITHUB COM O CÓDIGO FONTE QUE VOCÊ DESENVOLVEU

       static Scanner input = new Scanner(System.in);

        public String StringInverss(String palavra){
            String novaString ="";
            String velhastring = ajustComposta(palavra);

            for(int i = velhastring.length() - 1; i >= 0; i--){

                novaString += velhastring.charAt(i);
            }
            return normalizeComposta(novaString);
        }

        protected String ajustComposta(String oldString){
            if (oldString.contains(" ")) {
                return  oldString.replaceAll(" ","/");
            }
            return oldString;
        }

         protected String normalizeComposta(String velhastring){
        if (velhastring.contains("/")) return velhastring.replaceAll("/", " ");
        return velhastring;
    }


        public void  geterString(){
            String nome="";
            System.out.println("Qual palavra deseja inverter, pode ser nome composto também:");
            nome = input.nextLine();

            if ("".equals(nome)) {
                System.out.println("A palavra vazia não pode ser Invertida");
            }else {
                System.out.println("O Inversso da palavra "+nome.toUpperCase()+" Fica -> "+ StringInverss(nome.toUpperCase()));
                ispalindorme(StringInverss(nome.toUpperCase()), nome.toUpperCase());
            }


        }

        private void ispalindorme(String nome, String inversNome){
            if (nome.equals(inversNome)) {
                System.out.println("Curiosamente "+ nome+" é palavra é um palíndromos !");
            }
        }



    public static void main(String[] args) {

        InversorDeString re = new InversorDeString();

        re.geterString();


    }
}
