package com.pandaawake;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import asciiPanel.AsciiPanel;

public class Main {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        AsciiPanel asciiPanel = context.getBean("asciiPanel", AsciiPanel.class);
        App app = new App();
        new Window(asciiPanel, (AsciiPanel panel) -> {
            app.paint(panel);
        });
    }

}
