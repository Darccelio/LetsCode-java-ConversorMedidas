package com.letscode.conversorMedidas.services;

public class Conversor {

   private static final float FATOR_CONVERSAO_POL_CEN = 2.54f;

    public static float converterPolegadasCentimetros( float polegadas) {
        return polegadas * FATOR_CONVERSAO_POL_CEN;
    }
}
