package com.bp.pruebaretrofit.Model;

import java.util.List;

/**
 * Las clases Model se emplean para transformar las respuestas en objetos. Recuperan el resultado de las llamadas.
 */

public class RecentPosts {
    private String status;
    private int count;
    private int countTotal;
    private int pages;
    private List<Post> posts;

    public String getStatus() {
        return status;
    }

    public int getCount() {
        return count;
    }

    public int getCountTotal() {
        return countTotal;
    }

    public int getPages() {
        return pages;
    }

    public List<Post> getPosts() {
        return posts;
    }
}
