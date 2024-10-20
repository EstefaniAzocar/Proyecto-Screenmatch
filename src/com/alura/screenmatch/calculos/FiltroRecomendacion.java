package com.alura.screenmatch.calculos;

public class FiltroRecomendacione {

    void filtro(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado");
        }else if (clasificacion.getClasificacion() >= 2){
            System.out.println("popular en el momento");
        }else {
            System.out.println("Colocalo en tu lista para verlo despues");
        }
    }
}
