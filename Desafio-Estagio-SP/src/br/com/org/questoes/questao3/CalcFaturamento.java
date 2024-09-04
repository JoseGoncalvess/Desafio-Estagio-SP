package br.com.org.questoes.questao3;
import br.com.org.questoes.modelos.Faturamento;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.lang.reflect.Type;
import java.util.List;

public class CalcFaturamento {
    //TODO DESAFIO A SER RESPONDIDO
//    3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
//    • O menor valor de faturamento ocorrido em um dia do mês;
//    • O maior valor de faturamento ocorrido em um dia do mês;
//    •  Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
//
//            IMPORTANTE:
//    a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
//    b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;

    public static void main(String[] args) {
        Gson gson = new Gson();
        ClassLoader classLoader = CalcFaturamento.class.getClassLoader();
        Faturamento  faturamento = new Faturamento();

        List<Faturamento> listFaturamentos = new ArrayList<>();

        try (Reader reader = new InputStreamReader(Objects.requireNonNull(classLoader.getResourceAsStream("assets/dados.json")))) {
            Type pessoaListType = new TypeToken<List<Faturamento>>() {}.getType();
            listFaturamentos = gson.fromJson(reader, pessoaListType);

        } catch (IOException e) {
            System.out.println("Erro De leitura do Arquivo -> "+e);
        }

        faturamento.maiorValueMes(listFaturamentos);
        faturamento.menorValueMes(listFaturamentos);
        System.out.println("A Média Mensal foi-> "+String.format("%.2f",faturamento.mediaFaturamento(listFaturamentos)));
        faturamento.diasAcimaDaMedia(listFaturamentos);

    }


}
