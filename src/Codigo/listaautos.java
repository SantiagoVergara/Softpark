/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Codigo;

/**
 *
 * @author Santiago Vergara
 */
public class listaautos {
    public static final autos[] datos = new autos[9];
    public static Object[] autos;
    
    public static boolean addautos(autos p){
        for (int i=0; i<datos.length;i++){
            if (datos[i]==null){
                datos[i]=p;
                return true;
            }     
        }
        return false;
    }
    
    public static autos[] getLista(){
        return datos;
    }
    
    
}
    

