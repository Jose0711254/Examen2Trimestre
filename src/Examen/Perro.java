package Examen;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, int edad, String chip, String raza) {
        super(nombre, edad, chip);
        this.raza = raza;
    }

    public static void hacerSonido() {
        System.out.println("Guau Guau");
    }
}
