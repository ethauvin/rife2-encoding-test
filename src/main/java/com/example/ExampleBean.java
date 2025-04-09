package com.example;

import rife.validation.ConstrainedProperty;
import rife.validation.MetaData;

public class ExampleBean extends MetaData {

    private String text;

    @Override
    public void activateMetaData() {
        addConstraint(new ConstrainedProperty("rawText").displayedRaw(true));
    }

    public ExampleBean() {
        // Default constructor
    }

    public ExampleBean(String s) {
        this.text = s;
    }

    public String getRawText() {
        return text;
    }

    public String getText() {
        return text;
    }

    public void setRawText(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
               "text='" + text + '\'' +
               '}';
    }
}