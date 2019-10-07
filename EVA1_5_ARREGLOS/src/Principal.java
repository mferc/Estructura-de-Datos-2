//Los arrelos son objetos 

/**
 *
 * @María Fernanda Cázares Herrera 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de arreglos 
        int aiDatos[] = new int[10];
        //N --> NUMERO DE ELEMENTOS
        //0-->1ER ELEMENTO
        //N-1 --> ULTIMO ELEMENTO
        System.out.println(aiDatos);
        for(int i = 0;i < aiDatos.length; i++){ //length regres la cantidad de elementos
            aiDatos [i]= (int)(Math.random()*100)+1;
        }
        for(int i=0;i <aiDatos.length;i++){
            System.out.println(aiDatos[i]);
        }
        System.out.println("FOR EACH");
        //FOR-EACH
        for (int aiDato : aiDatos) { //lee elemento por elemento
            System.out.println(aiDato);
            
        }
            
        }
        
        
    }
    
}
