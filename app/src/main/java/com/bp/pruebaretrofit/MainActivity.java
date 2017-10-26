package com.bp.pruebaretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.bp.pruebaretrofit.Api.BlogApi;
import com.bp.pruebaretrofit.Api.RetrofitApi;
import com.bp.pruebaretrofit.Model.Post;
import com.bp.pruebaretrofit.Model.RecentPosts;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlogApi blogApi = RetrofitApi.getInstance();
        Call<RecentPosts> call = blogApi.getRecentPosts();

        /*El método enqueue permite realizar llamadas asincronas y recuperar su resultado
        en un Callback. */
        call.enqueue(new Callback<RecentPosts>() {
            /* Si no se produce ningún fallo de conexión. */
            @Override
            public void onResponse(Call<RecentPosts> call, Response<RecentPosts> response) {
                Log.e("MainActivity", "onResponse = " + response.toString());
                RecentPosts recentPosts = response.body();
                if (recentPosts != null) {
                    for (Post post : recentPosts.getPosts()) {
                        Log.e("MainActivity", "post title = " + post.getTitle());
                        //Log.e("MainActivity", "post content = " + post.getContent());
                        Log.e("MainActivity", "post author = " + post.getAuthor());
                    }
                }
            }
            /* Si se produce algún fallo de conexión. */
            @Override
            public void onFailure(Call<RecentPosts> call, Throwable t) {
                Log.e("MainActivity", "onFailure = " + t.getMessage());
            }
        });
    }
}
