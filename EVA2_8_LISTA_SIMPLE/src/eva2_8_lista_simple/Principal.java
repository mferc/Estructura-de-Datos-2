package eva2_8_lista_simple;

/**
 *
 * @María Fernanda Cázares Herrera
 */
public class Principal {

    public static void main(String[] args) {
        Lista miLista = new Lista();
        
       miLista.add(new Nodo(4)); //1
       miLista.add(new Nodo(6)); //2
       miLista.add(new Nodo(10)); //3
       miLista.add(new Nodo(3)); //4
       miLista.add(new Nodo(8)); //5
       miLista.add(new Nodo(5)); //6
       miLista.add(new Nodo(2)); //7
       miLista.addBegin(new Nodo(9999));
       boolean vacia = miLista.isEmpty();
       if(vacia)
            System.out.println("ESTÁ VACÍA");
       else 
            System.out.println("LISTA CON NODOS");
       
       //miLista.print();
       //int[] millon= new int[1000000];
        //for (int i = 0; i < millon.length; i++) {
           // millon[i]= (int)(Math.random()*1000);
            
       // }

       // for (int i = 0; i < 1000000; i++) {
        //    miLista.add(new Nodo((int) (Math.random() * 1000)));

      //  }
        

    }

}
