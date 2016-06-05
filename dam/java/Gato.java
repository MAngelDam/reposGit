package dam.java;

public class Gato extends Animal {

    private String color;
    
    public Gato(String nombre) {
        super(nombre);
        color="";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public final String tipoAnimal() {
        return "Es un Gato.";
    }

    @Override
    public final String comunicarse() {
        return "El gato maulla... Miau Miau!";
    }
    
}
