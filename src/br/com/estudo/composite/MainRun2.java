package br.com.estudo.composite;

import java.time.Clock;

public class MainRun2 {

    public static void main (String[] args) {
        String esperado = "<ul>\n" +
        "   <li>Coffee</li>\n" +
        "   <li>Tea</li>\n" +
        "   <li>Milk</li>\n" +
        "</ul>";

        System.out.println("**************** E S P E R A D O ******************************");
        System.out.println(esperado);

        System.out.println("**************** R E S U L T A D O ******************************");

        LiLeafTag liLeafTag = new LiLeafTag();
        liLeafTag.texto("Coffee");
        String resultado = liLeafTag.toHtml();
        System.out.println(resultado);

        LiLeafTag liLeafTag1 = new LiLeafTag();
        liLeafTag1.texto("Tea");
        String resultado2 = liLeafTag1.toHtml();
        System.out.println(resultado2);

        LiLeafTag liLeafTag2 = new LiLeafTag();
        liLeafTag2.texto("Milk");
        String resultado3 = liLeafTag2.toHtml();
        System.out.println(resultado3);


        UlCompositeTag ulCompositeTag = new UlCompositeTag();
        ulCompositeTag.addTag(liLeafTag);
        ulCompositeTag.addTag(liLeafTag1);
        ulCompositeTag.addTag(liLeafTag2);
        System.out.println(ulCompositeTag.toHtml());
    }

}
