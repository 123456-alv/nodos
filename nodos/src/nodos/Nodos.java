
package nodos;
import java.util.Scanner;

public class Nodos {
int nodo;
Nodos siguiente; 
    public static void main(String[] args) {
       Scanner Teclado = new Scanner(System.in);
       int A = 0;
       nodoss n=new nodoss();
       do{
           System.out.println("1.-agregar");
           System.out.println("2.-mostrar");
           System.out.println("3.-eliminar");
           System.out.println("4.-1salir");
           A=Teclado.nextInt();
         switch(A){
             case 1:
                 n.insertar();
                break;
             case 2:
                 n.mostrar();
                 break;
             case 3:
                 n.eliminar();
                 break;
         }
             
       }while(A!=4);
    
    
}
    int dato;
       }
