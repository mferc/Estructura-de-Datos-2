
/**
 *
 * @María Fernanda Cázares Herrera
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nodo hola1, hola2, hola3; //3 objeto de tipo Nodo
        hola1= new Nodo(32); 
        hola2 =new Nodo(17);
        hola3 = new Nodo(5);
        
        //encadenarlos
        hola1.setSiguiente(hola2);//te pide el nodo siguiente que es hola2
        hola2.setSiguiente(hola3); 
        
        Nodo hola = hola1; //Nodo extra que se mueve entre los nodos, para utilizar el while
        while(hola != null){
            System.out.print(hola.getValor()+"-");
            hola = hola.getSiguiente();
        }
        System.out.println("");
    }
    
}
class Nodo{
    private int valor;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente =null;
    }
    
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}