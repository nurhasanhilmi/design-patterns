package com.hilmi.behavioral.memento;

public class Editor {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Snapshot save() {
        return new Snapshot(content);
    }

    public void restore(Snapshot snapshot) {
        content = snapshot.content;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "content='" + content + '\'' +
                '}';
    }

    public record Snapshot(String content) {
    }
}
