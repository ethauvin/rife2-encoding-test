package com.example;

import rife.engine.*;

public class EncodingTestSite extends Site {
    public void setup() {
        var hello = get("/hello", c -> {
            var smiley = "\uD83D\uDE04";
            var t = c.template("hello");
            var b = new ExampleBean(smiley);
            t.setBean(b); // text and rawText

            t.setValue("smiley", smiley); // smiley

            t.setValue("title", "Encoding Test"); // title

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