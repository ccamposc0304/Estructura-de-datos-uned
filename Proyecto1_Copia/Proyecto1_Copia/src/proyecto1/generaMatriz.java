
package proyecto1;


import java.util.ArrayList;

public class generaMatriz 
{
    
    int tamanio = 2000;
    public int[] numeros;
    metodosOrdenado ordena =new metodosOrdenado();
   
    
    double marcaInicio, marcaFinal, marcaTotal = 0;

    public generaMatriz() {
        this.numeros = new int[tamanio];
        
    }
    
    
    public void generaAleatorios()
    {
        for(int count=0; count < 2000; count++)
        {
            int numeroGenerado = this.random();
            numeros[count] = numeroGenerado;
        }
        this.setGuardarOrg();
       
    }
    
    public void showMatriz()
    {
         System.out.println("Matriz:");
        for(int count=0; count < 2000; count++)
        {
            System.out.println(numeros[count] );
            
           
        }
        System.out.println(marcaInicio);
    }
    
    private int random()
    {
        int numeroAleatorio = (int) (Math.random()*9999 + 1);
        
        return numeroAleatorio;
        
    }
   
    public void setOrdenación()
    {
        ordena.getVector(numeros);
    }
    public void setGuardarOrg()
    {
        ordena.getVecOrg(numeros);
    }
    
    public void getOrdenada()
    {
        for(int count=0; count < 2000; count++)
        {
            numeros[count] = ordena.setVectorMod()[count];
        }
            
    }
     public void getOriginal()
    {
        for(int count=0; count < 2000; count++)
        {
            numeros[count] = ordena.setVectorOrig()[count];
        }
            
    }
    public void opcionOrdena(int opc)
    {
        
        this.setOrdenación();
       
        if(opc == 0){
            marcaInicio = System.currentTimeMillis();
            ordena.metodoBurbuja();
            marcaFinal = System.currentTimeMillis();
        }
           
        if(opc == 1){
            marcaInicio = System.currentTimeMillis();
            ordena.metodoShell();
            marcaFinal = System.currentTimeMillis();
        }
        if(opc == 2){
            marcaInicio = System.currentTimeMillis();
            ordena.metodoQuickSort(ordena.matrizOrdenada, 0, numeros.length-1);
            marcaFinal = System.currentTimeMillis();
        }    
            
       
        marcaTotal = (marcaFinal - marcaInicio)/1000;
    }
}
