package pizza;

import java.util.Scanner;

/**
 *
 * @author familiachea
 */
public class Pizzita {

    private String nombre;
    private int tamasw;
    private String tamano;
    private String ingredientes[] = new String[8];
    private double valor,precio;
    private int ningre;
    
    Scanner sc = new Scanner(System.in);
    
     private Pizzita(String nombre, String tamano ,String[] ingredientes,double valor) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.ingredientes = ingredientes ;
        this.valor=valor;
    }   
    
    public Pizzita(){
        this.nombre= "";
        this.tamano="";
        this.ingredientes[0]="TOMATE";
        this.ingredientes[1]="QUESO";
        this.valor=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
    

    
    
    
  public void ingresoDatos(){
        
        System.out.println("DIGITE LA OPCION DE LA PIZZA A ELEGIR: ");
        tamasw = sc.nextInt();
        switch (tamasw) {
            case 1: {
                this.valor=5;
                this.setValor(valor);
                System.out.println("Pizza Pequeña: $" + valor);
                this.setTamano("PEQUEÑA");

                break;
            }
            case 2: {
                this.valor=8;
                this.setValor(valor);
                System.out.println("Pizza Mediana: $" + valor);
                this.setTamano("MEDIANA");

                break;
            }
            case 3: {
                this.valor=12;
                this.setValor(valor);
                System.out.println("Pizza Familiar: $" + valor);
                this.setTamano("FAMILIAR");

                break;
            }   
            default:
                    System.out.println("ESCOJA UNA OPCION VALIDA");
                    System.out.println("DIGITE LA OPCION DE LA PIZZA A ELEGIR: ");
                    tamasw = sc.nextInt();
                    this.ingresoDatos();
                break;
        }
      
   }
  public void ingredientes(){
      int nume;
 
      System.out.println("¿DESEA INGREDIENTES ADICIONALES,SI(1)NO(0)?: ");
      nume=sc.nextInt();
      if(nume==1){
       this.ningred();
            
      }else if(nume==0){
          
      }else{
          System.out.println("EL NUMERO QUE INGRESO ESTA INCORRECTO,POR FAVOR INTENTE OTRA VEZ!");
          this.ingredientes();
      }
  }  
    
  public void ningred(){
   
   System.out.println("DIGITE EL NUMERO DE INGREDIENTE");
         ningre=sc.nextInt();
         sc.nextLine();
         if (ningre<=6){
             int i=0,j=2;
            do{
                System.out.print("Ingrediente "+(i+1)+": ");
                this.ingredientes[j]=sc.nextLine();
                j++;
                i++;
            }while(i<ningre);
         }
         else{
          System.out.println("EL NUMERO QUE INGRESO ESTA INCORRECTO,POR FAVOR INTENTE OTRA VEZ!");
          this.ningred(); 
         }
  }
    
  public void Cacular(){
      precio=(this.getValor()+(ningre*1.50));
      System.out.println("EL TOTAL DE LA VENTA ES: "+precio);
  }  
  
  
    private void setValor(double valor) {
        this.valor = valor;
    }

    private double getValor() {
        return valor;
    }
    
    public void MostrarDatos() {
        System.out.println("\nNOMBRE DE LA PIZZA: " + this.getNombre());
        System.out.println("TAMAÑO DE LA PIZZA: "+this.getTamano());
        System.out.println("INGREDIENTES: ");
        for (int i = 0; i < (2+ningre); i++) {
            System.out.println("INGREDIENTE: " + (i + 1) + ": " +ingredientes[i]);
        }
        System.out.println("EL PRECIO DE LA PIZZA: "+ precio);
        
        //System.out.println("PRECIO DE LA PIZZA: " + valor);
       // System.out.println("EL TOTAL DE VENTAS ES: " + String.format("%.2f", total) );
            }
}
