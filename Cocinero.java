/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RONALD
 */
public class Cocinero extends Persona {
     private String tipo_comida;  

    public Cocinero(String tipo_comida, int id, String nombre, String apellido, int edad, double salario) {
        super(id, nombre, apellido, edad, salario);
        this.tipo_comida = tipo_comida;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    @Override
    public String toString() {
        return super.toString() + "tipo_comida=" + tipo_comida + '}';
    }
}
