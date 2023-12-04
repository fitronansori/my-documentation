package com.jswing.textfield;

import javax.swing.*;

public class TextFieldApp {
    public static void main(String[] args) {
                JFrame frame = new JFrame("Contoh JEditorPane");
                frame.setSize(300, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Membuat JEditorPane
                JEditorPane editorPane = new JEditorPane();

                // Menambahkan JEditorPane ke dalam frame
                frame.add(editorPane);

                frame.setVisible(true);

    }
}
