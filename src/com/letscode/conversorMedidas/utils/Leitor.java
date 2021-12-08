package com.letscode.conversorMedidas.utils;

import java.util.Scanner;

public class Leitor {

    private static Scanner sc = new Scanner(System.in);

    public static float escnaerEntradaMedidas() {
        Impressora.impressaoMensagemEntrada();
        return sc.nextFloat();
    }

}
