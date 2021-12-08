package com.letscode.conversorMedidas;

import com.letscode.conversorMedidas.services.Conversor;
import com.letscode.conversorMedidas.utils.Impressora;
import com.letscode.conversorMedidas.utils.Leitor;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float polegadas = Leitor.escnaerEntradaMedidas();

        float centimentos = Conversor.converterPolegadasCentimetros(polegadas);

        Impressora.impressaoResultadoConversaoMedidas(polegadas, centimentos);
    }
}
