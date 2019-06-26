package com.it;

public class NewEmail {
    public String to;
    public String theme;
    public String text;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public NewEmail(String to, String theme, String text) {
        this.to = to;
        this.theme = theme;
        this.text = text;
    }
}
