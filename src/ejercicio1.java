
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Javier
 */
public class ejercicio1 {
 private static Scanner scanner = new Scanner(System.in);
  public static BufferedReader entrada =new BufferedReader(new InputStreamReader(System.in));
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int [] enteros;
        
        enteros=crear_array();
        System.out.println("posicion en el array");
         int posicion=scanner.nextInt();
         System.out.println("valor en el array");
         int valor=scanner.nextInt();
        posicionar_array(posicion,valor,enteros);
        maximominimo(enteros);
        valormedio(enteros); 

         
        
    }

   
   
  private static  int [] crear_array() throws IOException{
        int i=0;
        int cantidad=0;
         System.out.println("introduzca el numero de elementos que tendra el array");
        cantidad=leerInt();
        int [] enteros =new int[cantidad];
        for (i=0;i<cantidad;i++)
        {
         enteros[i]=(int) (Math.random() * 100);
         System.out.println(enteros[i]);
        }
     return (enteros);
    }
      
    static  void posicionar_array(int posicion,int valor, int [] enteros){
        enteros[posicion]=valor;
         for (int i=0;i<enteros.length;i++)
         System.out.println("array"+ enteros[i]);
    }
 
   private static void maximominimo(int [] enteros){
       int maximo;
       int minimo;
       int i=0;
       
       maximo=enteros[0];
      for(i=1;i<=enteros.length;i++)
       {if(maximo<enteros[i])
           maximo=enteros[i];
       }
      minimo=enteros[0];
      for(i=1;i<=enteros.length;i++)
          {if(minimo>enteros[i])
           minimo=enteros[i];
       }
      System.out.println("valor maximo:"+maximo);
      System.out.println("valor minimo:"+minimo);
   }

   static void valormedio(int [] enteros){
       int i=0;
       int total=0;
       float valormedio=0;
       for(i=0;i<=enteros.length;i++)
           total=total+enteros[i];
 
       valormedio=total/enteros.length;
        System.out.println("valor medio es:"+ valormedio);
       for(i=0;i<=enteros.length;i++)
           if(valormedio<enteros[i])
               System.out.println(enteros[i]);
   }
  static int[] solicitarAlUsuario() {
        int n = 0, i=0, j=0;
        int [] array = null;
        System.out.println("Numeros enteros: ");
        n = scanner.nextInt();
        if (n > 0) {
            array = new int[n];
            for (i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
            }
                System.out.println("La posicion : ");
                int posicion = scanner.nextInt();
                if ((posicion > 0) || (posicion < array[i])) {
                    System.out.println(" Valor: ");
                    int valor = scanner.nextInt();
                    for (j = 0; j < array.length; j++) {
                        array[posicion] = valor;
                        System.out.println(" " + array[j]);
                        
                    }
                }/* else {
                    System.out.println(" No se puede pedir el valor");
                }*/
                
            
                  
        } else {
            System.out.println("el numero tiene que ser interos:  ");
        }

        return array;
    }
             
 static int leerInt(){
    
       boolean error=false;
       int numero=0;
       do{
        try{
            error=false;
       
        numero= Integer.valueOf(entrada.readLine()).intValue();}
        catch( NumberFormatException  ex){
            System.out.println("valor incorrecto"+ex);
            error=true;
        } catch(IOException e)
        {
            System.out.println("Error de E/S"+e);
        }
      }while(error);
       return(numero);
 }




}


