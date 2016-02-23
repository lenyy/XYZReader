package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            //The first url didn't work so i had to create a new repository on my git profile
            //url = new URL("https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json" );
            url = new URL("https://raw.githubusercontent.com/lenyy/xyzreader_data/master/data.json");
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
        }

        BASE_URL = url;
    }
}
