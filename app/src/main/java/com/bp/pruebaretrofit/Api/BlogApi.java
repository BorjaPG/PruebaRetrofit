package com.bp.pruebaretrofit.Api;

import com.bp.pruebaretrofit.Model.RecentPosts;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Las interfaces contienen todas las peticiones soportadas por la API.
 */

public interface BlogApi {

    /* A la URL base "http://www.tutos-android.com/" se le concatena "/?json=get_recent_posts"
    * y de esta forma la petición obtiene en este caso los post más recientes. */
    @GET("?json=get_recent_posts") //Dirección donde se hará la petición.

    /* getRecentPosts devuelve como resultado Call<RecentPosts>, que se corresponde con un
    * objeto que agrupa la petición enviada.*/
    Call<RecentPosts> getRecentPosts();



    /* Usando @Query. Cuando se llame a obtenerPosts se concatenará a la URL lo que le pasemos
    * como parámetro. Se utiliza cuando los parámetros son dinámicos. */
    //@GET("/")
    //Call<RecentPosts> obtenerPosts(@Query("get_recent_posts") String ultimosPosts);


    /* Usando @QueryMap. Se usa cuando se desea agregar muchos parámetros al método.
     Se pasa un Map con las claves y los valores.*/
    //@GET("/?json=get_recent_posts")
    //Call<RecentPosts> obtenerPostSelectivos(@QueryMap Map<String, String> filtros);

    //Se construye un mapa con las claves y valores.
    //Map<String, String> filtros = new HashMap<String,String>;
    //filtros.put("activo", "1");
    //filtros.put("display","full");
    //adaptador.obtenerPostSelectivos(filtros);

    //Se obtendría la dirección: /get_recent_posts?activo=1&display=full

}
