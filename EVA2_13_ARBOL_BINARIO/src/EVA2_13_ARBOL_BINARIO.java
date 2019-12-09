
/**
 *
 * @María Fernanda Cázares Herrera
 */
public class EVA2_13_ARBOL_BINARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol nodo = new Arbol();
        nodo.agregarNodo(new Nodo(13));
        nodo.agregarNodo(new Nodo(10));
        nodo.agregarNodo(new Nodo(18));
        nodo.agregarNodo(new Nodo(2));
        nodo.agregarNodo(new Nodo(11));
        nodo.agregarNodo(new Nodo(17));
        nodo.agregarNodo(new Nodo(20));
        nodo.imprimirPostOrder();
        nodo.imprimirPreOrder();
        nodo.imprimirInOrder();
    }
    
}
