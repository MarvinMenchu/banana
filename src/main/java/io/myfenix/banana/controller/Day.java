package io.myfenix.banana.controller;

public enum Day {
    SUNDAY("DOMINGO"),
    MONDAY("LUNES");
    /*TUESDAY("MARTES");
    WEDNESDAY("MIERCOLES");
    THURSDAY("JUEVES");
    FRIDAY("VIERNES");
    SATURDA("SABADO");*/

    private String spanish;

    private Day(String s) {
        spanish = s;
    }

    public String getSpanish(){
        return spanish;
    }
}
