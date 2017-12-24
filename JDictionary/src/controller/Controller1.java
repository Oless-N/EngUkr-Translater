package controller;

import logic.Dictionary;
import view.DictFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller1 implements ActionListener {
    private DictFrame frame;
    private Dictionary dictionary;

    public Controller1(DictFrame frame, Dictionary dictiona) {
        this.frame = frame;
        this.dictionary = dictiona;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().getClass() == JButton.class) {
            JButton button = (JButton) actionEvent.getSource();
            if (button.getName().equals(DictFrame.TRANSLATE)) {
                String w = frame.getField1();
                String tw = dictionary.translateUkr(w);
                frame.setField2(tw);
                System.out.println("Translate");
            }
            if (button.getName().equals(DictFrame.CLEAR))
            {
                String cl="";
                System.out.println("Clear");
                frame.setField1(cl);
                frame.setField2(cl);
            }

        }
    }
}
