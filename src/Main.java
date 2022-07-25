import com.sun.source.tree.WhileLoopTree;

public class Main {
    public static void main(String[] args) {
        int numeroIf = -5;

        Signodeentero(numeroIf);
        bucles();

    }

    public static void Signodeentero(int a){

        if(a>0) {

            System.out.println("Es Positivo");
        } else if (a<0) {
            System.out.println("Es Negativo");
        } else {
            System.out.println("Es Cero");
        }
    }
    public static void bucles(){
    System.out.println("Bucle while");
        int numeroWhile= 0;
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("Bucle Do while");
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile<3);
        System.out.println("Bucle For");
        int numeroFor;
        for(numeroFor = 0;numeroFor<=3;numeroFor++ ){
            System.out.println(numeroFor);
        }
        String estacion = "Verano";
        switch (estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default: System.out.println("No es una estacion");
        }
    }

}