package view;

import controller.Controller1;
import logic.Dictionary;

import javax.swing.*;
import java.awt.*;

public class DictFrame extends JFrame {
    private JTextField field1;
    private JTextField field2;
    public static final String TRANSLATE = "Translate";
    public static final String CLEAR = "Clear";
    private Dictionary dictionary;


    public String getField1() {
        return field1.getText();
    }

    public void setField1(String a) {
        this.field1.setText(a);
    }

    public String getField2() {
        return field2.getText();
    }

    public void setField2(String a) {
        this.field2.setText(a);
    }


    public DictFrame(int width, int height, Dictionary dict) {
        this.dictionary=dict;
        this.setSize(width, height);
        this.setTitle("JDictionary");
        this.setBounds(600, 200, width, height);
        JPanel jPanel = new JPanel(new GridLayout(3, 3));
        jPanel.add(new JLabel("English :"));
        jPanel.add(new JLabel("Ukraine :"));
        field2 = new JTextField();
        field1 = new JTextField();
        jPanel.add(field1);
        jPanel.add(field2);

        JButton translateBut = new JButton(TRANSLATE);
        jPanel.add(translateBut);
        JButton clearBut = new JButton(CLEAR);
        jPanel.add(clearBut);
        translateBut.setName(TRANSLATE);
        clearBut.setName(CLEAR);

        this.add(jPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Controller1 controller=new Controller1(this, dictionary);
        this.setVisible(true);
        translateBut.addActionListener(controller);
        clearBut.addActionListener(controller);
    }

//    public static void main(String[] args) {
//        new DictFrame(300, 400,new Dictionary());
//    }
}
