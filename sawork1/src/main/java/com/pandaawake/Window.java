package com.pandaawake;

import java.util.function.Consumer;

import javax.swing.JFrame;

import asciiPanel.AsciiPanel;

public class Window extends JFrame {

    private AsciiPanel terminal;
    private Consumer<AsciiPanel> paintFunc;

    public Window(AsciiPanel terminal, Consumer<AsciiPanel> paintFunc) {
        super();
        this.terminal = terminal;
        this.paintFunc = paintFunc;
        add(terminal);
        pack();
        repaint();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void repaint() {
        terminal.clear();
        if (paintFunc != null) {
            paintFunc.accept(terminal); // Callback Function
        }
        super.repaint();
    }
    
}
