/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @María Fernanda Cázares Herrera
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal pObjt =new Principal();
        System.out.println(pObjt);
        foo(pObjt);
    }
    public static void foo(Principal param){
        System.out.println(param);
    }
}
