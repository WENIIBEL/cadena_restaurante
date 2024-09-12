/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RONALD
 */
public class Persona {
      //Atributos persona
    
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public Persona(int id, String nombre, String apellido, int edad, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
    // metodos para poner y ver atributos, setters & getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // metodo para mostrar variables, to string

    @Override
    public String toString() {
        return "persona{" + " id= " + this.id + ", nombre=" + this.nombre + ", apellido=" + this.apellido + ", edad="
                + this.edad
                + ", salario=" + this.salario + '}';
    }

}
