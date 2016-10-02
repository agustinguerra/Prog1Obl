
package obligatorio; 

import java.util.Scanner;


public class Prueba {


    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de control de procesos.");
        System.out.println("A continuacion se definiran dos actividades y un inspector.");
        Scanner in = new Scanner(System.in);
        
        //ESTE MODULO NO COMPILA, DEJE PEGADO EL TRY CATCH ABAJO CON SUS COMENTARIOS PARA QUE LO ENTIENDAS
        //SIRVE PARA CHEQUEAR QUE EL USUARIO HAYA INGRESADO UN INT DONDE SE LE PIDE O UNA STRING DONDE SE LE PIDE
        
        
        try
        {
            System.out.println("Please input an integer");
        //nextInt will throw InputMismatchException
        //if the next token does not match the Integer
        //regular expression, or is out of range
        int usrInput=in.nextInt();
        }
        catch(InputMismatchException exception)
        {
        //Print "This is not an integer"
        //when user put other than integer
        System.out.println("This is not an integer");
        }
    }
    
}
