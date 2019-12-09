/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Arbol {
    private Nodo root;

    public Arbol() {
        root =null;
    }
    public void agregarNodo(Nodo nuevo){ //funcion de punto de arranque
        agregarNodoRecursiva(root,nuevo);
    }
    private void agregarNodoRecursiva(Nodo actual, Nodo nuevo){
        if(root==null){
            root = nuevo; //agregando el nodo
        }else{
            if(nuevo.getValor()>actual.getValor()){ //MAYOR--DERECHA
                if(actual.getDer()==null){ 
                    actual.setDer(nuevo);
                }else{ //Ups, ya hay un nodo OMG
                    agregarNodoRecursiva(actual.getDer(),nuevo);
                }
            }else if(nuevo.getValor()<actual.getValor()){//MENOR--IZQUIERDA
                if(actual.getIzq()==null){ 
                    actual.setIzq(nuevo);
                }else{ //Ups, ya hay un nodo OMG
                    agregarNodoRecursiva(actual.getIzq(),nuevo);
                }
                
            }else{ //EL VALOR YA EXISTE...
                System.out.println("Oyes... ya existe el valor, inserta otro grax :)");
            }
        }
    }
    
    public void imprimirPostOrder(){
        postOrder(root); 
       
        
    }
    public void imprimirPreOrder(){
        preOrder(root); 
       
        
    }
    public void imprimirInOrder(){
        inOrder(root); 
       
        
    }
    
    private void postOrder(Nodo actual){ //Metodo recursivo
        if(actual!=null){
        //Leer a la izquierda
        postOrder(actual.getIzq());
        //Leer a la derecha
        postOrder(actual.getDer());
        //Imprimir
        System.out.print(actual.getValor()+"-");
            System.out.println("");
    }}
    private void preOrder(Nodo actual){
        if(actual!=null){
        //Imprimir 
         
        System.out.print(actual.getValor()+"-");
        //Leer a la izquierda
        preOrder(actual.getIzq());
        //Leer a la derecha
        preOrder(actual.getDer());
            System.out.println("");
        
        
    }}
    
    private void inOrder(Nodo actual){
       if(actual!=null){
     
        //Leer a la izquierda
        inOrder(actual.getIzq());
        //Imprimir 
        System.out.print(actual.getValor()+"-");
        //Leer a la derecha
        inOrder(actual.getDer());
           System.out.println("");
        
        
    }
    
    }
    }


