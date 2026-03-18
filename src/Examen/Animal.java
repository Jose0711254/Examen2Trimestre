package Examen;

public class Animal {

    private String nombre;
    private int edad;
    private String chip;

    public Animal(String nombre, int edad, String chip) {
        this.nombre = nombre;
        this.edad = edad;
        this.chip = chip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;

    }

    public void hacerSonido (){
        System.out.println("El animal emite un sonido genérico");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", chip='" + chip + '\'' +
                '}';
    }

    public static int calculadrEdadHumana (int edadAnimal){
        
    }
}
