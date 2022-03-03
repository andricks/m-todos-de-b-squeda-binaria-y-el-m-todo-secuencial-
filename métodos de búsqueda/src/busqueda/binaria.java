package busqueda;

import java.util.Arrays;
import java.util.Scanner;

public class binaria {
	public static void main(String[] args) {
       
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int cont =0;

        while(cont!=1){
            System.out.println("ingrese uno para iniciar busqueda o dos para salir  ");
            System.out.println("1. Probar métodos de búsqueda");
            System.out.println("2. Salir");
            int s = scanner.nextInt();

            switch(s){
                case 1:
                    System.out.println("\n\n***MÉTODOS DE BÚSQUEDA***\n");
                    System.out.println("BÚSQUEDA BINARIA");
                    System.out.println("ARRAY DE EJEMPLO:\n");
                    
                    int array[]={10,500,602,52,45,78,5,25,32,46,50};
                    System.out.println(Arrays.toString(array)+"\n");
                    Arrays.sort(array);
                    System.out.println("Arreglo Ordenado:");
                    System.out.println(Arrays.toString(array)+"\n");
                    System.out.println("Ingrese el número que desea buscar:\n");
                    int num = scanner.nextInt();
                    int searching = Binario(array, num);

                    if (searching== -1){
                        System.out.println("número no encontrado");
                    }
                    else{

                        System.out.println("El número se encuentra en la posición: "+ searching +"\n\n");

                    }


                    System.out.println("BÚSQUEDA SECUENCIAL");
                    System.out.println("ARRAY DE EJEMPLO:\n");
                    int array2[]={14,20,59,27,13,15,1,5,2,8,7,9};
                    System.out.println(Arrays.toString(array2) + "\n");

                    System.out.println("Ingrese el número que desea buscar:\n");
                    int num2 = scanner.nextInt();


                    int sesearching = Secuential(array2, num2);
                    if (sesearching!= -1) {
                        System.out.println("El número se encuentra en la posición:" +sesearching);
                    } else {
                        System.out.println("El número no se encuentra");

                    }
                    break;


                case 2:
                    cont=1;
                    break;

                default:
                    System.out.println("escoja entre uno o dos ");


            }



        }






    }

    public static int Binario(int array[], int searched){
        int first = 0;
        int last = array.length-1;
        int center, centerv;

        while(first<= last){
            center = (first + last)/2;
            centerv = array[center];

            if(searched == centerv){
                return center;
            }
            else if(searched < centerv){
                last= center-1;
            }
            else{
                first = center +1;
            }
        }
        return -1;
    }

    public static int Secuential(int array2[], int Sesearched) {
        System.out.println("");
        boolean found=false;
        for (int i = 0; i < array2.length  && found==false; i++){
            if(Sesearched == array2[i]) {
                found = true;
                return i;
            }
        }
        return -1;
        
    }
}
