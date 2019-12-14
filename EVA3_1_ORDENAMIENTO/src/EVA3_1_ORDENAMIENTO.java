
import java.util.Scanner;

/**
 *
 * @María Fernanda Cázares Herrera
 */
public class EVA3_1_ORDENAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArray = new int[20];
        llenar(iArray);
        selectionSort(iArray);
        /* long ini,fin;
        System.out.println("SELECTION SORT");
        ini =System.nanoTime();
        selectionSort(iArray);
        fin =System.nanoTime();
        imprimir(iArray);
        System.out.println("");
        System.out.println("Tiempo= "+(fin-ini));
        System.out.println("INSERTION SORT");
        llenar(iArray);
        ini =System.nanoTime();
        insertionSort(iArray);
        fin =System.nanoTime();
        System.out.println("");
        System.out.println("Tiempo= "+ (fin-ini));
        System.out.println("BUBBLE SORT");
        llenar(iArray);
        ini=System.nanoTime();
        bubbleSort(iArray);
        fin=System.nanoTime();
        System.out.println("");
        System.out.println("Tiempo= "+(fin-ini));*/

        Scanner introduce = new Scanner(System.in);
        System.out.println("Dame un número");
        int iVal = introduce.nextInt();
        System.out.println("Posicion: " + busquedaBin(iArray, iVal));

    }

    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
    }

    public static void selectionSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int iMin = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[iMin]) { //si lo que está en la posición j es menor a lo que está en la posición i
                    //arreglo[iMin]=arreglo[j];     //se pone lo que está en j en la posicion i
                    //arreglo[j]=arreglo[i]; //por lo que lo que estaba en la posicion i se va a la posicion j
                    //arreglo[i]=arreglo[iMin]; //dudas, ya no se q hice 
                    iMin = j;
                }
            }
            //INTERCAMBIO(fuera del for)
            int iTemp = arreglo[i];
            arreglo[i] = arreglo[iMin];
            arreglo[iMin] = iTemp;

        }
    }

    public static void insertionSort(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int iTemp = arreglo[i];
            int insP;
            for (insP = i; insP > 0; insP--) {
                int iPrev = insP - 1;
                if (arreglo[iPrev] > iTemp) {
                    arreglo[insP] = arreglo[iPrev];
                } else {
                    break;
                }

            }
            arreglo[insP] = iTemp;

        }
        imprimir(arreglo);
    }

    public static void bubbleSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < (arreglo.length) - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int iTemp = arreglo[j];
                    arreglo[i] = arreglo[j + 1];
                    arreglo[j + 1] = iTemp;
                }
            }
        }
        imprimir(arreglo);

    }

    public static void quickSort(int[] arreglo) {

    }

    public static int busquedaBin(int[] arreglo, int val) {
        return busquedaBinRec(arreglo, val, 0, arreglo.length - 1);
    }

    private static int busquedaBinRec(int[] arreglo, int valor, int ini, int fin) {
        if (ini <= fin) {
            int mid = ini + ((fin - ini) / 2);

            if (valor == arreglo[mid]) {
                return mid;
            } else if (valor < arreglo[mid]) {
                return busquedaBinRec(arreglo, valor, ini, mid - 1);

            } else {
                return busquedaBinRec(arreglo, valor, mid + 1, fin);

            }
        } else {
            return -1;
        }

    }

}
