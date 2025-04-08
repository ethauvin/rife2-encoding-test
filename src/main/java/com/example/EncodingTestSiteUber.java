package com.example;

import rife.engine.Server;

public class EncodingTestSiteUber extends EncodingTestSite {
    public static void main(String[] args) {
        new Server()
            .staticUberJarResourceBase("webapp")
            .start(new EncodingTestSiteUber());
    }
}