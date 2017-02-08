package com.garcestechnology.pauljosephdarsantos.midtermprojecta2;

/**
 * Created by pauljosephdarsantos on 2/8/17.
 */

public class Articles {
    private String author;
    private String link_url;
    private String img_url;
    private String title;
    private String desc;
    private String pub_at;

    public Articles() {
    }

    public Articles(String author, String title, String desc, String link_url, String img_url, String pub_at) {
        this.author = author;
        this.title = title;
        this.desc = desc;
        this.link_url = link_url;
        this.img_url = img_url;
        this.pub_at = pub_at;
    }

    public String get_Author() {
        return author;
    }

    public void set_Author(String author) {
        this.author = author;
    }

    public String get_Title() {
        return title;
    }

    public void set_Title(String title) {
        this.title = title;
    }

    public String get_desc() {
        return desc;
    }

    public void set_desc(String desc) {
        this.desc = desc;
    }

    public String get_link_url() {
        return link_url;
    }

    public void set_link_url(String link_url) {
        this.link_url = link_url;
    }

    public String get_img_url() {
        return img_url;
    }

    public void set_img_url(String img_url) {
        this.img_url = img_url;
    }

    public String get_pub_at() {
        return pub_at;
    }

    public void set_pub_at(String pub_at) {
        this.pub_at = pub_at;
    }
}
