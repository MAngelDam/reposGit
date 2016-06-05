package dam.java;

public class Perro extends Animal {

    private int peso;
    
    public Perro(String nombre) {
        super(nombre);
        peso=0;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public final String tipoAnimal() {
        return "Es un Perro.";
    }

    @Override
    public final String comunicarse() {
        return "El perro ladra... Guau Guau!";
    }
    
}
