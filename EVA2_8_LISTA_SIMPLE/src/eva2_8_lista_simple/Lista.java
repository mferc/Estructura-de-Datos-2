/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_lista_simple;

/**
 *
 * @author invitado
 */
public class Lista {
    private Nodo inicio; //Necesitamos un nodo inicial
    private Nodo fin;
    public Lista(){
        this.inicio =null; // Aseguramos que la lista esté vacía con un constructor
        this.fin =null;
    }
    //Devolver true si la lista está  vacía
    public boolean isEmpty(){
        if(inicio==null)
            return true;
        else
            return false;
    }
    
    //AGREGAR UN NODO AL FINAL DE LA LISTA
    public void add(Nodo nuevo){
        //Primero verificar si lalista está vacía
        if(isEmpty()){
            inicio = nuevo; 
            fin = nuevo;
        }else{
            /*
            Nodo temp = inicio;
            while(temp.getSiguiente() != null){
            temp = temp.getSiguiente();
        }
            temp.setSiguiente(nuevo);*/
            fin.setSiguiente(nuevo);
            fin = nuevo; //mover el nodo al final
        }
    }
    
    //metodo para imprimir la lista
    public void print(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print(temp.getValor()+"-");
            temp = temp.getSiguiente();
        }
    }
    public int size(){
        int iCont = 0;
        Nodo temp = inicio;
        while(temp != null){
            iCont++;
            temp = temp.getSiguiente();
            
        }
        return iCont;
    }
    public void addBegin(Nodo nuevo){
         if(isEmpty()){
            inicio = nuevo; 
            fin = nuevo;
         }else{
             inicio= nuevo;
             nuevo.setSiguiente(inicio);
             
         }
    }
    public void insertAt(int pos, Nodo nuevo) throws Exception{
        int iTama = size();
        if((pos<0) || (pos>= iTama)){
            throw new Exception("La posición es invalida");
        }else{
            if(pos==0){
                addBegin(nuevo);
            }else{
                int iCont =0;
                Nodo temp= inicio;
                while(iCont<(pos-1)){
                    temp=temp.getSiguiente();
                    iCont++;
                }
            }
        }
        
    }
    public void clear(){ //limpiar la lista
        //Ambos nodos se deben desconectar
        inicio = null;
        fin = null;
    }
    
    public void deleteAt(int pos) throws Exception{
        //borrar la primera
        if(isEmpty())//si la posicion es la primera          
                throw new Exception("La lista está vacía");
        int iTama =size();
        if((pos<0)||(pos>=iTama))
                throw new Exception("Posición invalida");
        if(iTama==1){
            clear();
        }else{//muchos nodos
            if(pos==0){//borrar el primer nodo
                inicio = inicio.getSiguiente();
            }else{
                int iCont =0;
                Nodo temp= inicio;
                while(iCont<(pos-1)){
                    temp=temp.getSiguiente();
                    iCont++;
            }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if(pos==(iTama-1))
                    fin =temp;
        }
        //un solo nodo
        
        //borrar la ultima
    
}
    }
    public int getAt(int pos){
        //VERIFICAR
        int iCont =0;
                Nodo temp= inicio;
                while(iCont<(pos-1)){
                    temp=temp.getSiguiente();
                    iCont++;
                }
                return temp.getValor();
    }
}