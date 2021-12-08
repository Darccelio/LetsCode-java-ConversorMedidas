package com.letscode.conversorMedidas.utils;

public class Impressora {

    final static String MENSAGEM_SOLICITACAO_ENTRADA_VALORES = "Por favor, inserir a medida a ser convertida .....: ";


    public static void impressaoMensagemEntrada() {
        System.out.print(MENSAGEM_SOLICITACAO_ENTRADA_VALORES);
    }

    public static void impressaoResultadoConversaoMedidas(float medidaInicial, float resultado) {
        System.out.printf("%.2f Polegadas (pol) equivalem a %.2f centimetros %n", medidaInicial, resultado);
    }

}
