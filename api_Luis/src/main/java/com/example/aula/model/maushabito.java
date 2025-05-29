package com.example.aula.model;

public enum maushabito {
    FUMAR("Fumar"),
    BEBER_ALCOOL("Beber alcool"),
    USAR_DROGAS("Usar drogas"),
    ALIMENTACAO_INADEQUADA("Alimentação inadequada"),
    SEDENTARISMO("Sedentarismo"),
    OUTROS("Outros");


    private String mausHabito;


    maushabito(String mausHabito) {
        this.mausHabito = mausHabito;
    }


    public String getMausHabito() {
        return mausHabito;
    }
}
