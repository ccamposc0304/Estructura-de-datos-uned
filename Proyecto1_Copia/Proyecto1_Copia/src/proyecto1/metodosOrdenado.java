/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author ccampos
 */
public class metodosOrdenado 
{
     
    private int actualInt;
    private int proximoInt;
    private int auxiliar;
    private boolean ordenado = false;
    public int[] matrizOrdenada = new int[2000];
    public int[] matrizOriginal = new int[2000];
    boolean cambios;
    
    public void getVector(int[] vector)
    {
        for(count =0; count < 1999; count++ )
            {
                matrizOrdenada[count] = vector[count];
            }
    }
    public void getVecOrg(int[] vector)
    {
        for(count =0; count < 1999; count++ )
            {
                matrizOriginal[count] = vector[count];
            }
    }
    public int[] setVectorMod()
    {
        return matrizOrdenada;
    }
    public int[] setVectorOrig()
    {
        return matrizOriginal;
    }
    
    int count=0;
    public void metodoBurbuja( )
    {   
        while(ordenado == false)
        {            
            ordenado = true;
            for(count =0; count < 1999; count++ )
            {
                actualInt = matrizOrdenada[count];
                proximoInt = matrizOrdenada[count + 1];

                if(actualInt > proximoInt)
                {
                    auxiliar = actualInt;
                    actualInt = proximoInt;
                    proximoInt=auxiliar;
                    ordenado= false;
                    matrizOrdenada[count] = actualInt;
                    matrizOrdenada[count+1] = proximoInt;
                }
                
            }
        } 
        ordenado = false;
    }

    public void metodoShell() 
    {
        int salto;

        for (salto = matrizOrdenada.length  / 2; salto != 0; salto /= 2) 
        {
            cambios = true;
            while (cambios) 
            {                                       
                cambios = false;
                for (count = salto; count < matrizOrdenada.length; count++)
                {
                    if (matrizOrdenada[count - salto] > matrizOrdenada[count]) 
                    {     
                        auxiliar = matrizOrdenada[count];                 
                        matrizOrdenada[count] = matrizOrdenada[count - salto];
                        matrizOrdenada[count - salto] = auxiliar;
                        cambios = true;                                      
                    }
                }
            }
        }
        ordenado = false;
    }    
    
    public void metodoQuickSort(int[] vect, int izquierda , int derecha)
    {
        int pivote = vect[izquierda];
        int izq = izquierda;
        int der = derecha;
        
        while(izq < der)
        {
            while(vect[izq] <= pivote && izq < der)
                izq++;
            while(vect[der] > pivote )
                der--;
            
            if(izq < der )
            {
                auxiliar = vect[izq];
                vect[izq]= vect[der];
                vect[der] = auxiliar;
            }
        }
        
        vect[izquierda] = vect[der];
        vect[der] = pivote;
        
        if(izquierda < der-1)
            metodoQuickSort(vect,izquierda,der-1);          // ordenamos subarray izquierdo
        if(der+1 < derecha)
            metodoQuickSort(vect,der+1,derecha);          // ordenamos subarray derecho
    }
      
}
