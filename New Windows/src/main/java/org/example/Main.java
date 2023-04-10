package org.example;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.io.File;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main {

    static JFrame window = new JFrame("Demo Telemetry - New Windows");

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            System.out.println(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            System.out.println("OS Not Detected");
        };

        window.setLayout(new BorderLayout());
        // size the window

        int width = 200;
        int height = 200;
        Dimension size = new Dimension(width, height);
        window.setSize(size);
        Dimension resolution144p = new Dimension(192, 144);
        window.setMinimumSize(resolution144p);
        window.setLocationRelativeTo(null);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);



        window.setVisible(true);
    }
}