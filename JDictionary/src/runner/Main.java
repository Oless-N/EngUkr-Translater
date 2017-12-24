package runner;

import logic.Dictionary;
import view.DictFrame;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Dictionary dict=Dictionary.getInstance();
        dict.addEngUkrWord("wake", "прокидатися");
        dict.addEngUkrWord("waylay", "підстерегти");
        dict.addEngUkrWord("wear", "одягати");
        dict.addEngUkrWord("weave", "ткати");
        dict.addEngUkrWord("wed", "одружуватися");
        dict.addEngUkrWord("weep", "плакати");
        dict.addEngUkrWord("wet", "вимочувати");
        dict.addEngUkrWord("win", "вигравати");
        dict.addEngUkrWord("wind", "вертіти");
        dict.addEngUkrWord("withdraw", "виводити");
        dict.addEngUkrWord("withhold", "утримувати");
        dict.addEngUkrWord("withstand", "протистояти");
        dict.addEngUkrWord("wring", "вичавлювати");
        dict.addEngUkrWord("write", "писати");

        dict.loadFromFile("EngUkr.txt", ";");
        DictFrame frame=new DictFrame(400,300,dict);
       // System.out.println(dict.toString());

        String command="";
        Scanner sc = new Scanner(System.in);
        while (!command.equals("!exit")) {
            System.out.println("for out press to '!exit'");
            System.out.println("Enter your word");
            command = sc.next();
            if(!command.equals("!exit")){
                System.out.println(dict.translateUkr(command));}

        }
        System.out.println("clossed the programm");}
    }
