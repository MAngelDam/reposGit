package dam.java;

public class Alumno {

    private String dni;
    private String nombre;
    private Animal mascota;

    public Alumno(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.mascota = null;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal getMascota() {
        return mascota;
    }

    public void setMascota(Animal mascota) {
        this.mascota = mascota;
    }
    
}
