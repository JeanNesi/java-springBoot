package com.satc.satcloja.model;

public class MargemLucroException extends Exception{
    public MargemLucroException(){
        super("A margem de lucro deve ser sempre maior ou igual a 20%!");
    }
}
