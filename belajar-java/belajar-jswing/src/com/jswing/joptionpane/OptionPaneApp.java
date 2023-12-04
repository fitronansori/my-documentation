package com.jswing.joptionpane;

import javax.swing.*;

public class OptionPaneApp {
    public static void main(String[] args) {
        /*
        * JOptionPane =  class yang digunakan untuk menampilkan dialog box
        * */


        // untuk menampilkan pesan informasi
//        JOptionPane.showMessageDialog(null, "Hello World!", "Message", JOptionPane.INFORMATION_MESSAGE);
        // untuk menampilkan pesan warning
//        JOptionPane.showMessageDialog(null, "Hello World!", "Message", JOptionPane.WARNING_MESSAGE);
        // untuk menampilkan pesan error
//        JOptionPane.showMessageDialog(null, "Hello World!", "Message", JOptionPane.ERROR_MESSAGE);
        // untuk menampilkan pesan question
//        JOptionPane.showMessageDialog(null, "Hello World!", "Message", JOptionPane.QUESTION_MESSAGE);
        // untuk menampilkan pesan tanpa icon
//        JOptionPane.showMessageDialog(null, "Hello World!", "Message", JOptionPane.PLAIN_MESSAGE);

        // Confirm dialog
//        int answer = JOptionPane.showConfirmDialog(null, "Do you even code?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
//
//        if (answer == JOptionPane.YES_OPTION) {
//            System.out.println("Yes, I code!");
//        } else if (answer == JOptionPane.NO_OPTION) {
//            System.out.println("No, I don't code.");
//        } else if (answer == JOptionPane.CANCEL_OPTION || answer == JOptionPane.CLOSED_OPTION) {
//            System.out.println("You canceled the operation or closed the dialog.");
//        }

        // Input dialog
//        String name = JOptionPane.showInputDialog("What is your name? :" );
//        System.out.println(name);

        // Option dialog
        String[] options = {"Mobil", "Motor", "Sepeda"};
        String selection = (String) JOptionPane.showInputDialog(null, "Pilih kendaraan Anda:", "Pilihan", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (selection != null) {
            System.out.println("Anda memilih: " + selection);
        } else {
            System.out.println("Anda membatalkan pilihan.");
        }
    }
}
