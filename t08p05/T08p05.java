package t08p05;

import dam.java.Alumno;
import dam.java.Animal;
import dam.java.Gato;
import dam.java.Perro;
import java.util.Scanner;

public class T08p05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String dni;
        String nombre;
        String sino;
        String tipo;
        int peso;
        String color;
        
        Alumno[] alumnos=new Alumno[10];
        Alumno a;
        Animal m;
        int numAlumnos=0;
        
        do {
            System.out.print("Introduce DNI del alumno: ");
            dni=sc.nextLine();
            System.out.print("Introduce NOMBRE del alumno: ");
            nombre=sc.nextLine();
            a=new Alumno(dni,nombre);
            System.out.print("¿Este alumno tiene mascota (s/n)? ");
            sino=sc.nextLine();
            if (sino.charAt(0)=='s' || sino.charAt(0)=='S') {
                System.out.print("Introduce NOMBRE de la mascota: ");
                nombre=sc.nextLine();
                System.out.print("¿Es un perro (p) o un gato (g)? ");
                tipo=sc.nextLine();
                if (tipo.charAt(0)=='p' || tipo.charAt(0)=='P') {
                    m=new Perro(nombre);
                    System.out.print("¿Cuál es su peso? ");
                    peso=Integer.valueOf(sc.nextLine());
                    ((Perro)m).setPeso(peso);
                } else {
                    m=new Gato(nombre);
                    System.out.print("¿Cuál es su color? ");
                    color=sc.nextLine();
                    ((Gato)m).setColor(color);
                }
                a.setMascota(m);
            }
            alumnos[numAlumnos++]=a;
            System.out.print("¿Desea introducir un nuevo alumno (s/n)? ");
            sino=sc.nextLine();
        } while (sino.charAt(0)=='s' || sino.charAt(0)=='S');

        System.out.println("");
        
        for (int i=0; i<alumnos.length; i++)
            if (alumnos[i]!=null) {
                System.out.println("");
                System.out.println("El alumno "+alumnos[i].getNombre()+" tiene una mascota:");
                m=alumnos[i].getMascota();
                if (m!=null) {
                    System.out.println("De nombre "+m.getNombre());
                    System.out.println(m.tipoAnimal());
                    System.out.println(m.comunicarse());
                    if (m instanceof Perro)
                        System.out.println("El peso del perro es: "+((Perro)m).getPeso());
                    else
                        System.out.println("El color del gato es: "+((Gato)m).getColor());
                } else {
                    System.out.println("No tiene mascota!");
                }
            }    
    }
    
}
