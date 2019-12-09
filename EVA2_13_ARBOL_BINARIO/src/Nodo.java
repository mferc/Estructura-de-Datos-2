


/**
 *
 * @María Fernanda Cázares Herrera
 */
public class Nodo {
    private int valor;
    private Nodo izq;
    private Nodo der;

    public Nodo() {
        this.izq = null;
        this.der =null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.izq =null;
        this.der=null;
    }
    
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo siguiente) {
        this.izq= siguiente;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
    
}
