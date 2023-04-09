package com.hilmi.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorHistory {

    private final Editor editor;
    private final Deque<Editor.Snapshot> history = new ArrayDeque<>();

    public EditorHistory(Editor editor) {
        this.editor = editor;
    }

    public void saveState() {
        history.addFirst(editor.save());
    }

    public void undo() {
        editor.restore(history.removeFirst());
    }
}
