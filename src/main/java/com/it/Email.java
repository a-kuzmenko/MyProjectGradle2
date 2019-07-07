package com.it;

import java.util.Objects;

public class Email {
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

    public Email(String to, String theme, String text) {
        this.to = to;
        this.theme = theme;
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(to, email.to) &&
                Objects.equals(theme, email.theme) &&
                Objects.equals(text, email.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, theme, text);
    }

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", theme='" + theme + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    //public Email() { }
}
