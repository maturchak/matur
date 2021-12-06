package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        GUI app = new GUI();
        app.setVisible(true);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[15];

        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);


        }
        for (int i = 0; i < list.length; i++) {

        }

        SelectionSort selectionSort = new SelectionSort();

        selectionSort.sort(list);


    }
}
