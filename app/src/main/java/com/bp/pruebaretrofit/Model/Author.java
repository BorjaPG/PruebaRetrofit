package com.bp.pruebaretrofit.Model;

/**
 * Las clases Model se emplean para transformar las respuestas en objetos. Recuperan el resultado de las llamadas.
 */

public class Author {
    private int id;
    private String name;
    private String nickname;

    @Override
    public String toString() {
        return name;
    }
}
