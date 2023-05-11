package com.acrdev.acrlist.projections;

public interface GameMinProjection {

    //precisa colocar métodos get para cada dado que a consulta retornar
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();


}
