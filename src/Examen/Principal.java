package Examen;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Refugio refugio = new Refugio(null, 5);

        Animal perro1 = new Perro("Tobi", 6, "ultra", "labrador");
        Animal perro2 = new Perro("Dasha", 2, "xp3", "chiguagua");
        Animal perro3 = new Perro("Mia", 4, "gs5", "husky");

        Animal gato1 = new Gato("Styla", 3, "rt4", false);
        Animal gato2 = new Gato("Rita", 1, "pt8", false);
        Animal gato3 = new Gato("Rookie", 7, "ng6", true);

        // refugio.hacerConcierto(null); //pongo null porque sino me daba error, y no se como hacer que no me de
        // refugio.mostrarAnimales(null); //pongo null porque sino me daba error, y no se como hacer que no me de
        System.out.println(gato2.calcularEdadHumana(1));
        System.out.println("\n" + perro1);
        System.out.println(perro2);
        System.out.println(perro3);
        System.out.println(gato1);
        System.out.println(gato2);
        System.out.println(gato3);
    }
}
