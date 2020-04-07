package com.example.listviewpersonalizado;

import java.util.HashMap;

public class PaisController {
    public Pais [] PAIS ={  ARGENTINA,BRASIL,URUGUAI,PARAGUAY };

    public HashMap<String, Pais> PAIS_MAP = new HashMap<>();

    public PaisController() {
        for (Pais pais: PAIS){
            PAIS_MAP.put(String.valueOf(pais.getNome()),pais);
        }
    }

    public  static final Pais ARGENTINA =new Pais("Argentina",44000000,R.drawable.argentina);
    public  static final Pais BRASIL =new Pais("Brasil",207000000,R.drawable.brasil);
    public  static final Pais URUGUAI =new Pais("Uruguai",3400000,R.drawable.uruguai);
    public  static final Pais PARAGUAY =new Pais("Argentina",7100000,R.drawable.paraguay);


}
