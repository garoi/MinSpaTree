package MinSpaTree;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marc Garcia Roig
 */
public class DriverMinSpaTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el numero de nodos que tendra el grafo");
        int numeroNodos = sc.nextInt();
        float[][] grafo = new float[numeroNodos][numeroNodos];
        String[] nombres = new String[numeroNodos];
        String nombreNodo;
        for (int i = 0; i < numeroNodos; ++i) {
            System.out.println("Entra el nombre del nodo " + (i+1));
            nombreNodo = sc.next();
            nombres[i] = nombreNodo;
            System.out.println("Ahora las distancias de los nodos, respector a los otros [0....inf]");
            for (int j = 0; j < numeroNodos; ++j) {
                grafo[i][j] = sc.nextInt();
            }
        }
        MinSpaTree msp = new MinSpaTree();
        msp.setGrafo(grafo);
        msp.setNombres(nombres);
        ArrayList< ArrayList<Pair> > minspantree = new ArrayList<>();
        minspantree = msp.MST();
        
        for (int i = 0; i < minspantree.size(); ++i) {
            System.out.println("EL INDICE ES: " + i + " Y su tamaño es " + minspantree.get(i).size());
            for (int j = 0; j < minspantree.get(i).size(); ++j) {
                System.out.println(minspantree.get(i).get(j).first() + " " + minspantree.get(i).get(j).second());
            }
        }
    }
}
