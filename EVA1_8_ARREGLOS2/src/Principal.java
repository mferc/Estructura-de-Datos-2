
/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[];
        int aCopia[];
        arreglo = new int[10];
        aCopia =new int[10];
            for(int i =0; i < arreglo.length;i++){
                arreglo[i]= (int)(Math.random()*10)+1;
            }
            for(int i=0; i < arreglo.length;i++){ //copiar datos
                aCopia[i] =arreglo[i];
                
            }
            imprimirArreglo(arreglo);
            imprimirArreglo(aCopia);
            
    }
        public static void imprimirArreglo(int[] args){
            System.out.println("");
            for(int i=0; i< args.length;i++){
                    System.out.print("["+ args +"]");
        }
           
        }
    
    
}
