package com.choupies.fdj.fdjback.model.enums;

public enum TypeLoterie {
    LOTO("Loto" ,2.2),
    EUROMILLION("Euromillion", 2.5);

    public final String label;
    public final Double coutSansOption;

    private TypeLoterie(String label, Double coutSansOption) {
        this.label = label;
        this.coutSansOption = coutSansOption;
    }

}