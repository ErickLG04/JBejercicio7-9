import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


public class Main {

    public static void main(String[] args) {

        String palabra = "Hola Mundo";
        String alReves = "";
        for (int i =palabra.length() - 1 ; i >= 0 ; i--) {
            alReves += palabra.charAt(i);
        }
        System.out.println("palabra invertida " + alReves);

        String[] apellidos = {"Litano", "Gonzales", "Fernandez"};

        for (String apellido : apellidos) {
            System.out.println("apellidos: " + apellido);
        }

        int[] numeros = {2,5,8,9,4 };

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Numeros: " + numeros[i] + " Posicion: " + i);
        }

        Vector<String> vector = new Vector(50);
        vector.add("Erick");
        vector.add("Javier");
        vector.add("Arelis");
        vector.add("Lanner");
        vector.add("Gillsom");


        vector.remove(2 );
        vector.remove(2 );
        System.out.println("Vector 2 y 3  eliminado: " + vector);

        ArrayList<String> elementos = new ArrayList<String>();
        elementos.add("elemento 1");
        elementos.add("elemento 2");
        elementos.add("elemento 3");
        elementos.add("elemento 4");

        LinkedList<String> linkedList = new LinkedList<String>(elementos);

        System.out.println("elementos de Array List:");
        for (String elemnto: elementos){
            System.out.println(elemnto);
        }

        System.out.println("elementos de Linked List:");
        for (String elemnto: linkedList){
            System.out.println(elemnto);
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i =arrayList.size(); i<10; i++) {
            arrayList.add(i);

        }

        for (int i =arrayList.size() - 1; i > 0; i--){
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
            }
        }

        for (int num : arrayList){
            System.out.println(num);

        }

        try {
            Divide(7,2);

        } catch (Exception e) {
            System.out.println("Esto no puedo hacerse");
        }
    }
    public static int Divide(int A , int B ) throws ArithmeticException, IOException{
        int result = 0;

        try {
            result = A / B;
        } catch (ArithmeticException e) {
            throw new IOException();
        }

        return result;

    }
}
