package dam.java;

public abstract class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract String tipoAnimal();
    public abstract String comunicarse();
    
}
