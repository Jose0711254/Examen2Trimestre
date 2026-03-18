package Examen;

import java.util.ArrayList;

public class Refugio {
    ArrayList<String> animal = new ArrayList<>();
    int CAPACIDAD_MAXIMA = 5;

    public Refugio(ArrayList<String> animal, int CAPACIDAD_MAXIMA) {
        this.animal = animal;
        this.CAPACIDAD_MAXIMA = CAPACIDAD_MAXIMA;
    }

    public void admitirAnimal(Animal a) {
        if (animal.size() <= CAPACIDAD_MAXIMA) {
            System.out.println("El refugio tiene espacio.");
            System.out.println("\n");
            animal.add(a.toString());
            System.out.println("¡El animal ha sido admitido.");
        }else {
            System.out.println("Capacidad agotada: No se puede admitir a " + a.getNombre());
        }
    }

    public void mostrarAnimales(ArrayList<Animal> a) {
        for (Animal a1 : a) {
            System.out.println(a1.toString());
        }
        for (Animal a2 : a) {
            System.out.println(a2.toString());
        }
        for (Animal a3 : a) {
            System.out.println(a3.toString());
        }
        for (Animal a4 : a) {
            System.out.println(a4.toString());
        }
        for (Animal a5 : a) {
            System.out.println(a5.toString());
        }
    }

    public void hacerConcierto(ArrayList<Animal> animales) {
        for (Animal a : animales) {
            animal.hacerSonido();
        }
    }

    public void buscarPorEspecies(Animal animalReferencia) {
        if (animal instanceof ArrayList<String>){
            System.out.println(animalReferencia.toString());
        }
    }
}
