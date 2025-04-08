package com.example;

import rife.engine.*;

public class EncodingTestSite extends Site {
    public void setup() {
        var hello = get("/hello", c -> {
            var t = c.template("hello");
            var b = new ExampleBean("\uD83D\uDE04", "\uD83D\uDE04");
            t.setBean(b);
            c.print(t);
        });
        get("/", c -> c.redirect(hello));
    }

    public static void main(String[] args) {
        new Server()
            .staticResourceBase("src/main/webapp")
            .start(new EncodingTestSite());
    }
}