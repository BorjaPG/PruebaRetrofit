package com.bp.pruebaretrofit.Api;

import com.bp.pruebaretrofit.Model.RecentPosts;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Las interfaces contienen todas las peticiones soportadas por la API.
 */

public interface BlogApi {

    /* En este caso sólo contiene una petición. Sólo tiene un método GET. */
    @GET("/?json=get_recent_posts") //Path API correspondiente a la petición.
    /* getRecentPosts devuelve como resultado Call<RecentPosts>, que se corresponde con un
    * objeto que agrupa la petición enviada.*/
    Call<RecentPosts> getRecentPosts();

    /* Existen otros métodos básicos de las API rest:
    *   @POST
    *   @DELETE
    *   @UPDATE */
}
