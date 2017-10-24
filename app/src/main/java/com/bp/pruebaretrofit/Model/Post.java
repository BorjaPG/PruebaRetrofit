package com.bp.pruebaretrofit.Model;

import java.util.List;

/**
 * Las clases Model se emplean para transformar las respuestas en objetos. Recuperan el resultado de las llamadas.
 */

public class Post {
    private int id;
    private String url;
    private String title;
    private String content;
    private String excerpt;
    private List<Tag> tags;
    private Author author;
    private String thumbnail;

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public Author getAuthor() {
        return author;
    }

    public String getThumbnail() {
        return thumbnail;
    }
}
