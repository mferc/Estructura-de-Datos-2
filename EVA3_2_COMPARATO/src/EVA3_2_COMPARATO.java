
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;


/**
 *
 * @María Fernanda Cázares Herrera
 */
public class EVA3_2_COMPARATO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> lista =new LinkedList<Integer>();
        for (int i = 0; i < 13; i++) {
            int numero=(int)(Math.random()*100);
            lista.add(numero);
            
        }
       /* lista.add(2);
        lista.add(3);
        lista.add(9);
        lista.add(10);
        lista.add(5);
        lista.add(18);
        lista.add(22);
        lista.add(1);
        lista.add(88);
        lista.add(43);*/
        System.out.println(lista);
        
        Comparator c= new Comparator(){ //clase anonima 
            @Override
            public int compare(Object o1, Object o2) {
                int resu;
                //cero =
                //positivo , mayor
                //negativo, menor
                Integer val1,val2;
                val1=(Integer)o1;
                val2=(Integer)o2; //convertir en entero
                resu=val1-val2; //menor a mayor, si quiere ordenarse de mayor a menor, cambiar por val2-val1
                
                return resu;
            }
        
        };
       
        lista.sort(c);
        System.out.println(lista);
        
        //Ordenar una lista de string
        
        LinkedList<String> list =new LinkedList<String>();
        list.add("ejejei");
        list.add("pero");
        list.add("q");
        list.add("pasa");
        list.add("chabales");
        
        Comparator ordena =new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                String cade1 =(String)o1;
                String cade2 =(String)o2;
                char c1 = cade1.charAt(0);
                char c2 =cade2.charAt(0);
                return c1-c2;
            }
            
        };
        System.out.println(list);
        list.sort(ordena);
        System.out.println(list);
        
        
    }
  
    
}
