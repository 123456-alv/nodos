
package nodos;
import java.util.Scanner;
public class nodoss {
    Scanner Teclado= new Scanner(System.in);
    Nodos primero = new Nodos();
    Nodos ultimo = new Nodos();
    
    public nodoss(){
        primero = null;
        ultimo = null;
    }
    public void insertar(){
       Nodos nuevo = new Nodos();
       System.out.println("ingresa el nodo");
       nuevo.dato =Teclado.nextInt();
       if(primero==null);
       primero=nuevo;
       primero.siguiente=null;
       ultimo=null;
    }
    public void mostrar(){
        Nodos actual= new Nodos();
        actual=primero;
        if(primero!=null){
         System.out.println("los nodos son");
        
        }
        
    }
    public void eliminar(){
        Nodos actual= new Nodos();
        actual=primero;
        Nodos anterior=new Nodos();
        anterior= null;
        boolean encontrado=false;
        System.out.println("eliminar nodo");
        int burcar=Teclado.nextInt();
        if(primero!=null){
            while(actual!=null&&encontrado!=true){
                if(actual==primero){
                    primero=primero.siguiente;
                   
                }else{
                    anterior.siguiente=actual.siguiente;
                }
                System.out.println("nodo eliminado:"+actual.dato);
                encontrado=true;
            }
            if(!encontrado){
                System.out.println("no existe");
            }
        }else{
           
        }
    }
            
}
