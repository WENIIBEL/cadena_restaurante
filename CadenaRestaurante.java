
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RONALD y Wendy
 */
public class CadenaRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Chef> chefs = new ArrayList<>();
        ArrayList<Cocinero> n_cocinero = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int ingresarChef = 1;
        int edad, id;
        int ingresar_cocinero = 1;
        int cantidadCocineros;
        int opc; // variable menu chef
        int opcion1;
        String nombre, apellido, tip_comida;
        double salario;

        do {
            System.out.println("\n---CADENA RESTAURANTE---");
            System.out.println("1. INGRESAR AL MENU CHEF");
            System.out.println("2. INGRESAR AL MENU COCINERO");
            System.out.println("3. Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    do {
                        System.out.println("---BolivarCardona---");
                        System.out.println("1. INGRESAR NUEVO CHEF");
                        System.out.println("2. MOSTRAR TODOS LOS CHEF DEL RESTAURANTE");
                        System.out.println("3. CHEF DE MAYOR EDAD");
                        System.out.println("4. CHEF CON MENOR SALARIO");
                        System.out.println("5. COCINEROS A CARGO DE ESTE CHEF");
                        System.out.println("6. SALIR");
                        opcion1 = sc.nextInt();
                        switch (opcion1) {
                            case 1:
                                System.out.println("\nINGRESE LA IDENTIFICAICÓN");
                                id = sc.nextInt();

                                // Verificar si el id ya existe
                                while (verificarIdChef(chefs, id)) {
                                    System.out.println("LA IDENTIFICAIÓN YA EXISTE, INGRESE UN A NUEVA");
                                    id = sc.nextInt();
                                }

                                System.out.println("\nINGRESE EL NOMBRE DEL CHEF");
                                nombre = sc.next();
                                System.out.println("\nINGRESE EL APELLIDO DEL CHEF");
                                apellido = sc.next();
                                System.out.println("\nINGRESE LA EDAD DEL CHEF");
                                edad = sc.nextInt();
                                System.out.println("\nINGRESE EL SALARIO");
                                salario = sc.nextDouble();
                                System.out.println("\nINGRESE CUANTOS COCINEROS TIENE A CARGO ESTE CHEF");
                                cantidadCocineros = sc.nextInt();
                                Chef chef = new Chef(id, nombre, apellido, edad, salario, cantidadCocineros);
                                chefs.add(chef);

                                System.out.println("¿DESEA INGRESAR OTRO CHEF \n 1. SI \n 2. NO");
                                ingresarChef = sc.nextInt();
                                break;

                            case 2:
                                for (Chef Chef1 : chefs) {
                                    System.out.println(Chef1 + " ");
                                    System.out.println(" ");
                                }
                                break;

                            case 3:
                                Chef mayor = chefs.get(0);

                                for (Chef Chef1 : chefs) {
                                    if ( Chef1.getEdad()  > mayor.getEdad()) {
                                        mayor = Chef1;
                                    }
                                }
                                System.out.println("El CHEF CON MAYOR EDAD ES:  " + mayor.getNombre() + " "
                                        + mayor.getApellido() + " " + mayor.getEdad());
                                break;

                            case 4:
                                Chef menor = chefs.get(0);

                                for (Chef Chef1 : chefs) {
                                    if (Chef1.getSalario() < menor.getSalario()) {
                                        menor = Chef1;
                                    }
                                }

                                System.out.println("El CHEF CON MENOR SALARIO ES:  " + menor.getNombre() + " "
                                        + menor.getApellido() + " " + menor.getSalario());
                                break;
                                // Implementar cantidad menor de cocineros a cargo de este chef
                            case 5:
                              Chef menorChef = chefs.get(0);
                              for (Chef Chef1 : chefs) {
                                    if (menorChef.getCantidadCocineros() > Chef1.getCantidadCocineros()) {
                                        menorChef = Chef1;
                                        
                                    } 
                                }
                                     System.out.println("El CHEF CON MENOR COCINEROS A CARGO:  " + menorChef.getNombre() + " "
                                    + menorChef.getApellido() + " " + menorChef.getCantidadCocineros() + "COCINEROS");
                                    
                                    
                                    Chef mayorChef = chefs.get(0);
                                    for (Chef Chef1 : chefs) {
                                      if (mayorChef.getCantidadCocineros() < Chef1.getCantidadCocineros()) {
                                        mayorChef = Chef1;

                                       }  
                                    }
                                     System.out.println("El CHEF CON MAYOR COCINEROS A CARGO:  " + mayorChef.getNombre() + " "
                                         + mayorChef.getApellido() + " " + mayorChef.getCantidadCocineros() + "COCINEROS");
                                        
                                   
                                   break;
                                
                            default:
                            System.out.println("ESTE CHEF NO TIENE COCINEROS A CARGO ");
                                break;
                        }
                    } while (opcion1 != 6);
                    break;

                case 2:
                    int opc2; // variable para el menú cocinero
                    do {
                        System.out.println("---BolivarCardona---");
                        System.out.println("1. INGRESAR NUEVO COCINERO");
                        System.out.println("2. MOSTRAR TODOS LOS COCINEROS DEL RESTAURANTE");
                        System.out.println("3. COCINERO DE MAYOR EDAD");
                        System.out.println("4. COCINERO CON MENOR SALARIO");
                        System.out.println("5. TIPO DE COMIDA Y COCINERO");
                        System.out.println("6. SALIR");
                        opc2 = sc.nextInt();

                        switch (opc2) {
                            case 1:
                                while (ingresar_cocinero == 1) {
                                    System.out.println("---INGRESA LA IDENTIFICACIÓN DEL COCINERO---");
                                    id = sc.nextInt();

                                    // Verificar si el id ya existe
                                    while (verificar_id(n_cocinero, id)) {
                                        System.out.println("LA IDENTIFICAIÓN YA EXISTE, INTENETE CON UNA NUEVA");
                                        id = sc.nextInt();
                                    }

                                    System.out.println("---INGRESA EL NOMBRE DEL COCINERO---");
                                    nombre = sc.next();
                                    System.out.println("---INGRESA EL APELLIDO DEL COCINERO---");
                                    apellido = sc.next();
                                    System.out.println("---INGRESA LA EDAD DEL COCINERO---");
                                    edad = sc.nextInt();
                                    System.out.println("---INGRESA EL TIPO DE COMIDA QUE EL COCINERO PREPARA---");
                                    tip_comida = sc.next();
                                    System.out.println("---INGRESA EL SALARIO DEL COCINERO---");
                                    salario = sc.nextDouble();

                                    // Crear el cocinero
                                    Cocinero cocinero1 = new Cocinero(tip_comida, id, nombre, apellido, edad, salario);
                                    n_cocinero.add(cocinero1);

                                    System.out.println("¿Desea agregar otro cocinero? \n 1. SI \n 2. NO");
                                    ingresar_cocinero = sc.nextInt();
                                }
                                break;

                            case 2:
                                System.out.println("---COCINEROS DEL RESTAURANTE---");

                                for (Cocinero cocinero1 : n_cocinero) {
                                    System.out.println(cocinero1 + " ");
                                    System.out.println(" ");
                                }
                                break;

                            case 3:
                                System.out.println("---NUESTRO COCINERO MAYOR---");
                                Cocinero mayor = n_cocinero.get(0);

                                for (Cocinero cocinero1 : n_cocinero) {
                                    if (cocinero1.getEdad() > mayor.getEdad()) {
                                        mayor = cocinero1;
                                    }
                                }
                                System.out.println("EL COCINERO MAYOR ES: " + mayor.getNombre() + " "
                                        + mayor.getApellido() + " " + mayor.getEdad() + " años");
                                break;

                            case 4:
                                System.out.println("---COCINERO CON MENOR SALARIO---");
                                Cocinero menor = n_cocinero.get(0);

                                for (Cocinero cocinero1 : n_cocinero) {
                                    if (cocinero1.getSalario() < menor.getSalario()) {
                                        menor = cocinero1;
                                    }
                                }

                                System.out.println("El COCINERO CON MENOR SALARIO ES:  " + menor.getNombre() + " "
                                        + menor.getApellido() + " " + menor.getSalario());
                                break;

                            case 5:
                             System.out.println("---TIPO DE COMIDA Y COCINEROS A CARGO---");
                             System.out.println(" ");
                              for (int i = 0; i < n_cocinero.size(); i++) {    //.size nos trae el numero de elementos del arreglo dinamico, como .length con los arreglos estaticos
                              String tipo_c = n_cocinero.get(i).getTipo_comida();
                              int contador_c = 0;
     
                              // Contar la cantidad de cocineros para este tipo de comida
                              for (int j = 0; j < n_cocinero.size(); j++) {
                                if (n_cocinero.get(j).getTipo_comida().equals(tipo_c)) {
                                    contador_c++;
                                }
                            }
     
                              // Mostrar el tipo de comida y la cantidad de cocineros 
                              boolean mostrado = false;
                              for (int k = 0; k < i; k++) {
                                if (n_cocinero.get(k).getTipo_comida().equals(tipo_c)) {
                                    mostrado = true;
                                    break;
                                }
                            }
     
                            if (!mostrado) {    //asegura que cada tipo de comida se procese y muestre solo una vez.
                                System.out.println("TIPO DE COMIDA: " + tipo_c + " -  COCINEROS A CARGO DE ESTE TIPO DE COMIDA: " + contador_c);
                                System.out.println(" ");
                            }
                        }


                        case 6:

                                System.out.println("6. SALIR");
                                break;
                        }
                    } while (opc2 != 6);
                    break;

                default:
                    break;
            }
        } while (opc != 3);
    }

    public static boolean verificar_id(ArrayList<Cocinero> n_cocinero, int id) {
        for (Cocinero coci : n_cocinero) {
            if (coci.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificarIdChef(ArrayList<Chef> chefs, int id) {
        for (Chef chef : chefs) {
            if (chef.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
