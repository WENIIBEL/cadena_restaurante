 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Chef extends Persona {

  private int cantidadCocineros;

  public Chef(int id, String nombre, String apellido, int edad, double salario, int cantidadCocineros) {
    super(id, nombre, apellido, edad, salario);
    this.cantidadCocineros = cantidadCocineros;
  }

  public float getCantidadCocineros() {
    return this.cantidadCocineros;
  }

  public void setCantidadCocineros(int cantidadCocineros) {
    this.cantidadCocineros = cantidadCocineros;
  }

  @Override
  public String toString(){
    return super.toString() + ", cantidad de cocineros: " + cantidadCocineros;
  }
}