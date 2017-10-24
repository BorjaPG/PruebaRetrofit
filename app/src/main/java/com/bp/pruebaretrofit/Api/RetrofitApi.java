package com.bp.pruebaretrofit.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Contiene el builder que crea y configura las instancias de Retrofit y da acceso a todos los
 * métodos de su API.
 */

public class RetrofitApi {

    private static BlogApi blogApiInstance;

    public static BlogApi getInstance() {
        if (blogApiInstance == null) {
            synchronized (BlogApi.class) {
                createApiBuilder(); //Se crea la instancia.
            }
        }
        return blogApiInstance;
    }

    /* Crea la instancia. */
    private static void createApiBuilder() {
        Retrofit retrofit = new Retrofit.Builder()
                //URL base de todas sus peticiones. Las demás URL se concatenarán a esta.
                .baseUrl("http://www.tutos-android.com/")
                //Sirve para transformar sus respuestas en objetos de la aplicación (JSON).
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        blogApiInstance = retrofit.create(BlogApi.class);
    }

}
