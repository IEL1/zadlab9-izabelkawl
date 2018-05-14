/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tlumacz {
    public static void Tlumacz() {
        Map<String, String> words = new HashMap<>();
        words.put("tak", "yes");
        words.put("nie", "no");
        words.put("to", "it");
        words.put("jest", "is");
        words.put("mieć", "have");
        words.put("jeść", "eat");
        words.put("pić", "drink");
        words.put("grać", "play");
        words.put("owoce", "fruits");
        words.put("warzywa", "vegetables");
        words.put("spać", "sleep");
        words.put("sklep", "shop");
        words.put("proszę", "please");
        words.put("dziękuję", "thank you");
        words.put("oczywiście", "of course");
        words.put("imię", "name");
        words.put("nazwisko", "surname");
        words.put("człowiek", "human");
        words.put("mężczyzna", "man");
        words.put("kobieta", "woman");
        words.put("koniec","Koniec programu");

        Scanner s = new Scanner(System.in);
        String slowo;
        System.out.println("Słowa które możesz przetłumaczyć: tak,nie,to,jest,mieć,jeść,pić,grać,owoce,warzywa,spać,sklep,proszę,dziekuję,oczywiście,imię,nazwisko,człowiek,mężczyzna,kobieta");
        

        do {
            slowo = s.nextLine();
            System.out.println(slowo +" - "+ words.get(slowo));

        }while(!"koniec".equals(slowo));
        Main.main(new String[0]);
    }
}