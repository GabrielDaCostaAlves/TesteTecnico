package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


import static org.example.Faturamento.*;
import static org.example.InverteTexto.inverterString;
import static org.example.PercentualFatura.calcularPercentual;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Atividade 1
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE )
        { K = K + 1; SOMA = SOMA + K; }
        System.out.println(SOMA); Resposta: 91
        */

        /*
        Atividade 2

        int numero = scan.nextInt();
        if (eFibonacci(numero)) {
            System.out.println(numero + " é um número de Fibonacci.");
        } else {
            System.out.println(numero + " não é um número de Fibonacci.");
        }
        */

        /*
        //Atividade 3
        String arquivoJson = "src/main/resources/faturamento.json"; // Nome do arquivo JSON

        try {
            // Lê o conteúdo do arquivo JSON
            String conteudo = new String(Files.readAllBytes(Paths.get(arquivoJson)));

            // Cria um objeto JSON a partir do conteúdo do arquivo
            JSONObject json = new JSONObject(conteudo);
            JSONArray faturamentosArray = json.getJSONArray("faturamentos");

            // Extrai os dados de faturamento
            List<Double> faturamentos = extrairFaturamentos(faturamentosArray);

            // Calcula e exibe os resultados
            if (!faturamentos.isEmpty()) {
                System.out.println("O menor valor de faturamento registrado: " + encontrarMenorFaturamento(faturamentos));
                System.out.println("O maior valor de faturamento registrado: " + encontrarMaiorFaturamento(faturamentos));
                System.out.println("Quantidade de dias com faturamento acima da média mensal: " +
                        contarDiasAcimaDaMedia(faturamentos));
            } else {
                System.out.println("Nenhum dado de faturamento disponível.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
        */


        /*
        //atividade 4
        // Valores de faturamento por estado
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        // Calcula o faturamento total
        double totalFaturamento = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        // Calcula e exibe o percentual de representação de cada estado
        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: %.2f%%\n", calcularPercentual(faturamentoSP, totalFaturamento));
        System.out.printf("RJ: %.2f%%\n", calcularPercentual(faturamentoRJ, totalFaturamento));
        System.out.printf("MG: %.2f%%\n", calcularPercentual(faturamentoMG, totalFaturamento));
        System.out.printf("ES: %.2f%%\n", calcularPercentual(faturamentoES, totalFaturamento));
        System.out.printf("Outros: %.2f%%\n", calcularPercentual(faturamentoOutros, totalFaturamento));
         */


        /*
        //Atividade 5
        System.out.print("Digite a string a ser invertida: ");
        String entrada = scan.nextLine(); // Lê a string do usuário

        // Inverte a string
        String invertido = inverterString(entrada);

        // Exibe a string invertida
        System.out.println("Texto invertido: " + invertido);

        // Fecha o scanner

         */
        scan.close();
    }
}

