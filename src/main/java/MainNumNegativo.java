public class MainNumNegativo {
    public static void main(String[] args) throws NumeroNegativoExcepcion{
        int num = Integer.parseInt(args[0]);
        if (num < 0){
            throw new NumeroNegativoExcepcion("Numero negativo");
        }else{
            System.out.println("La raiz cuadrada es: " + Math.sqrt(num));
        }
    }
}
