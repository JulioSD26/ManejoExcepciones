import java.util.Scanner;

public class Main {

    // 1. Escriba una clase que contenga método auxiliar
    // de nombre "caracterEn" en java que realice la sig. acción:
    // Recibe como parámetro una cadena y un entero
    // si el entero esta entre 0 y la longitud de la cadena
    // devuelve el cáracter en la posición correspondiente

    public static char caracterEn(String cadena, int entero) throws Exception{
            if(entero > 0 && entero < cadena.length()){
                return cadena.charAt(entero);
            }else{
                throw new Exception();
            }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String lectTeclado = teclado.nextLine();
        teclado.close();
        try {
            System.out.println(caracterEn(lectTeclado, 7));
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posicion de la cadena de caracteres que no existe");
        }
    }


}
