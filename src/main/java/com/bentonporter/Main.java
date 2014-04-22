package com.bentonporter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {
        print(new Generator().generateKey());
    }

    private static void print(Key key) {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        System.out.println(gson.toJson(key));
    }
}
