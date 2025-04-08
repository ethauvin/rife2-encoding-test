package com.example;

import rife.validation.ConstrainedProperty;
import rife.validation.MetaData;

public class ExampleBean extends MetaData {

    private String rawText;
    private String text;

    @Override
    public void activateMetaData() {
        addConstraint(new ConstrainedProperty("rawText").displayedRaw(true));
    }

    public ExampleBean() {
        // Default constructor
    }

    public ExampleBean(String rawText, String text) {
        this.rawText = rawText;
        this.text = text;
    }

    public String getRawText() {
        return rawText;
    }

    public void setRawText(String rawText) {
        this.rawText = rawText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
               "rawText='" + rawText + '\'' +
               ", text='" + text + '\'' +
               '}';
    }
}