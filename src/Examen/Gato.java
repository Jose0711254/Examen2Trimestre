package Examen;

public class Gato extends Animal {
    private boolean esCazador;

    public Gato(String nombre, int edad, String chip, boolean esCazador) {
        super(nombre, edad, chip);
        this.esCazador = esCazador;
    }

    public void hacerSonido() {
        System.out.println("Miau Miau");
    }
}
