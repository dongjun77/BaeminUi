package com.example.edj07.baemin.app.search;

/**
 * Created by edj07 on 2018-01-05.
 */

public class SearchItem {

    private String address;
    private String link;

    public SearchItem(String address, String link) {
        this.address = address;
        this.link = link;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
