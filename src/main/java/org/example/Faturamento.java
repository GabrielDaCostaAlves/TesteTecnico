package org.example;

import org.json.JSONArray;
import org.json.JSONObject;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Faturamento {


    // Extrai os valores de faturamento do JSONArray, ignorando finais de semana
    public static List<Double> extrairFaturamentos(JSONArray faturamentosArray) {
        List<Double> faturamentos = new ArrayList<>();

        for (int i = 0; i < faturamentosArray.length(); i++) {
            JSONObject obj = faturamentosArray.getJSONObject(i);
            double valor = obj.getDouble("valor");
            LocalDate data = LocalDate.parse(obj.getString("data"));
            DayOfWeek diaSemana = data.getDayOfWeek();

            if (valor > 0) {
                faturamentos.add(valor);
            }
        }

        return faturamentos;
    }

    // Encontra o menor valor de faturamento
    public static double encontrarMenorFaturamento(List<Double> faturamentos) {
        double menor = faturamentos.get(0);
        for (double valor : faturamentos) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    // Encontra o maior valor de faturamento
    public static double encontrarMaiorFaturamento(List<Double> faturamentos) {
        double maior = faturamentos.get(0);
        for (double valor : faturamentos) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    // Conta quantos dias tiveram faturamento acima da média
    public static int contarDiasAcimaDaMedia(List<Double> faturamentos) {
        double soma = 0;
        for (double valor : faturamentos) {
            soma += valor;
        }
        double media = soma / faturamentos.size();

        int contador = 0;
        for (double valor : faturamentos) {
            if (valor > media) {
                contador++;
            }
        }
        return contador;
    }
}