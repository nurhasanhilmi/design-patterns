package com.hilmi.behavioral.memento;

public class Runner {

    public static void run() {
        var editor = new Editor();
        var history = new EditorHistory(editor);

        editor.setContent("a");
        System.out.println(editor);

        history.saveState();
        editor.setContent("b");
        System.out.println(editor);

        history.undo();
        System.out.println(editor);
    }
}
