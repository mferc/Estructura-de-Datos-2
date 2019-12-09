
import java.util.LinkedList;


/**
 *
 * @María Fernanda Cázares Herrera
 */
public class EVA2_14_COLLECTIONS {

   
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> lListaEnla =new LinkedList<String>(); //<String> indicaque debe almacenar solo String
        lListaEnla.add("ejejei ");
        lListaEnla.add("pero ");
        lListaEnla.add("q ");
        lListaEnla.add("pasa ");
        lListaEnla.add("chabales ");
        lListaEnla.addFirst(":D");
        System.out.println(lListaEnla);
        for (String string : lListaEnla) {
            System.out.print(string+" ");
        }
        System.out.println("Hay "+lListaEnla.size()+" elemento/s");
        lListaEnla.remove(3);
    }
    
    
}
