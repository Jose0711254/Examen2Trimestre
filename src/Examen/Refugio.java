package Examen;

import java.util.ArrayList;

public class Refugio {
    ArrayList<String> animal;
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
        for (Animal animal1 : a) {
            System.out.println(animal1.toString());
        }
        for (Animal animal2 : a) {
            System.out.println(animal2.toString());
        }
        for (Animal animal3 : a) {
            System.out.println(animal3.toString());
        }
        for (Animal animal4 : a) {
            System.out.println(animal4.toString());
        }
        for (Animal animal5 : a) {
            System.out.println(animal5.toString());
        }
    }

    public void hacerConcierto(ArrayList<Animal> animales) {
        for (Animal animal : animales) {
            Perro.hacerSonido();
            Gato.hacerSonido();
        }
    }

    public void buscarPorEspecies(Animal animalReferencia) {
        if (animal instanceof ArrayList<String>){
            System.out.println(animalReferencia.toString());
        }
    }
}
