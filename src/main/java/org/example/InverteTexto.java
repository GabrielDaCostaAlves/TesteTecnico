package org.example;

public class InverteTexto {


    // Inverte o texto
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;


        while (inicio < fim) {

            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;


            inicio++;
            fim--;
        }
        return new String(caracteres);
    }
}
