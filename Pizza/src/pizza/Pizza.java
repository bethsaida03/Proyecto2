/*
Se necesita un pequeño programa que permita ingresar y calcular el precio de las
pizzas ofrecidas por una pizzería. Una pizza tiene como características un nombre,
tamaño (que puede ser pequeña, mediana, familiar) y un precio que inicialmente es
de $5 para pizzas pequeñas, $8 para pizzas medianas y $12 para pizzas familiares.
Considere que el máximo de ingredientes que puede tener una pizza en nuestra 
pizzería es de 8 (utilice un arreglo para los ingredientes de una pizza) y que 
inicialmente una pizza cuenta con dos ingredientes que son pasta de tomate y queso.
Cada ingrediente adicional que se agregue a la pizza tiene un valor de $1.50. 
Realice métodos constructores (por defecto y parametrizado), encapsule los 
atributos de la clase Pizza y agregue métodos get y set, un método para mostrar 
todos los datos de la pizza, y para calcular el precio de la pizza. Puede agregar 
otros métodos si lo considera necesario. Para probar su programa, haga un lazo que
permita a los usuarios ingresar nuevas pizzas, calcular su precio y mostrar todos 
sus datos mientras lo requiera.
 */
package pizza;

import java.util.Scanner;

/**
 *
 * @author familiachea
 */
public class Pizza {

    public static void main(String[] args) {
        String nombre,vuelta;
        
        Scanner sc = new Scanner(System.in);
        
        
        
        Pizzita pz1=new Pizzita();
        do {
        System.out.println("DIGITE EL NOMBRE DE LA PIZZA: ");
        nombre = sc.nextLine();
        pz1.setNombre(nombre);
        System.out.println("MENU DE TAMAÑOS DE PIZZA: ");
        System.out.println("1-Pizza Pequeña ");
        System.out.println("2-Pizza Mediana ");
        System.out.println("3-Pizza Familiar ");
        pz1.ingresoDatos();
        pz1.ingredientes();
        pz1.Cacular();
        pz1.MostrarDatos();
        
        System.out.print("QUIERE OTRA PIZZA SI(caracter) O NO(0): ");
        vuelta= sc.nextLine();
        } while(!"0".equals(vuelta));
             
    }
    
}
