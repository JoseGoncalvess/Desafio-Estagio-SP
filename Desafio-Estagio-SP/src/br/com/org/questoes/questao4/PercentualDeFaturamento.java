package br.com.org.questoes.questao4;
import java.util.Scanner;
import br.com.org.questoes.modelos.FatRegiao;

public class PercentualDeFaturamento {
   static Scanner input = new Scanner(System.in);
    // TODO DESAFIOA  SER IMPLEMENTADO
//     Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
//            • SP – R$67.836,43
//            • RJ – R$36.678,66
//            • MG – R$29.229,88
//            • ES – R$27.165,48
//            • Outros – R$19.849,53
//
//    Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.



    public void parcentFaturamento(){
        double somatotal = 0;
        double x;

        somatotal = fatTotal();

        FatRegiao  regiaoSelecionada = geterRegiao();

        x = (regiaoSelecionada.getValorFaturado() / somatotal) * 100;

        System.out.println("A região "+ "Sigla"+"Corresponde a " +  String.format("%.2f",x) +"% Do Faturamento total.");
        System.out.println("Em detalhes, "+regiaoSelecionada.getNome()+" teve o faturemneto de R$ "+regiaoSelecionada.getValorFaturado() +"de um Total de R$ "+somatotal);
    }

     public FatRegiao geterRegiao(){
        String sigla = "";
        FatRegiao region = FatRegiao.OUTROS;;

        System.out.println("Selecione a Sigla da Região abaixo para saber qual a deseja saber participação dela no faturamento Total");
        System.out.println("• SP – SÂO PAULO\n" +
                "• RJ – RIO DE JANEIRO\n" +
                "• MG – MINAS GERAIS\n" +
                "• ES – ESPIRITO SANTO\n" +
                "• Outros – OUTRAS REGIÕES");

        sigla = input.nextLine();

        for (FatRegiao fat : FatRegiao.values()) {
            if (fat.getSigla().equals(sigla.toUpperCase())){
                region =   fat;
            }

        }
            return region;
    }

    public double fatTotal() {
        double totoal = 0;
        for (FatRegiao fat : FatRegiao.values()) {
            totoal+= fat.getValorFaturado();
        }

        return totoal;
    }




    public static void main(String[] args) {

        PercentualDeFaturamento percent = new
                PercentualDeFaturamento();
percent.parcentFaturamento();

    }
}
