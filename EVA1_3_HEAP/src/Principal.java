
/**
 *
 * @María Fernanda Cázares Herrera 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i =10; //Variables locales van en el stack
        Principal pObjt = new Principal(); //Los objetos se van al heap
        System.out.println(i); // Las funciones se van al stack
        System.out.println(pObjt);
        pObjt =null; //Nos deshacemos de la memoria usada 
    }
    
}
