package br.com.org.questoes.modelos;

import java.util.ArrayList;
import java.util.List;

public class Faturamento {
    private int dia;
    private double valor;

    public Faturamento(){
        this.dia = 1;
        this.valor = 0;
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public  void menorValueMes(List<Faturamento> faturamentos){
        var refvalue = new Object() {
            double value = faturamentos.get(0).getValor();
        };

        faturamentos.forEach(fat -> {
            if (fat.getValor() <= refvalue.value) {
                refvalue.value = fat.getValor();
            }
        });

        System.out.println("Menor valor faturado Este mês foi de R$ "+ refvalue.value);

    }

    public  void maiorValueMes(List<Faturamento> faturamentos){
        var refvalue = new Object() {
            double value = faturamentos.get(0).getValor();
        };

        faturamentos.forEach(fat -> {
            if (fat.getValor() >= refvalue.value) {
                refvalue.value = fat.getValor();
            }
        });

        System.out.println("Maior valor faturado Este mês foi de R$ "+ refvalue.value);

    }
    public  double mediaFaturamento(List<Faturamento> faturamentos){
        double[] valor = {0};

        faturamentos.forEach(fat -> {
            if (fat.getValor() != 0.0) {
                valor[0] += fat.getValor();
            }
        });
        return  valor[0] / faturamentos.size();
    }

    public void diasAcimaDaMedia(List<Faturamento> faturamentos){
        ArrayList<Integer> melhoresDias = new ArrayList<Integer>();
        double media = mediaFaturamento(faturamentos);
        int diasPositivados = 0;

        faturamentos.forEach(fat -> {
            int i =0;
            if (fat.getValor() > media) {
                melhoresDias.add(fat.getDia());
            }
        });

        diasPositivados = melhoresDias.size();
        System.out.println("Este mês foram um totoal de "+ diasPositivados + " Acima da media :)");
        System.out.println("Esses são Foram os nosso melhores dias de faturamento:  "+melhoresDias);
    }






}
