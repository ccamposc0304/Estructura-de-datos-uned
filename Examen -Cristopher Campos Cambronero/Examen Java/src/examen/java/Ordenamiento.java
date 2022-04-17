package examen.java;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Ordenamiento
{
    public static ArrayList<String> palabrasOrdenado;
    
    boolean intercambio= false;
    String auxiliar; 
    public boolean step = false;
    
    static int i;
    
    public Ordenamiento()
    {
        palabrasOrdenado = new ArrayList<>();
    }
    
    public void getArreglo(ArrayList<String> arr)
    {
        palabrasOrdenado.removeAll(palabrasOrdenado);
        palabrasOrdenado.addAll(arr);
    }
    
    public void metodoBurbuja(int opcion)
    {
        intercambio = false;
        while(!intercambio)
        {
            intercambio = true ;

            switch(opcion) // dos opciones; 1- ordenamiento completo, 2-Ordenar siguiente paso
            {
                case 1:
                    for(i=i;i < palabrasOrdenado.size()-1;i++) 
                    {
                         if(palabrasOrdenado.get(i).compareToIgnoreCase(palabrasOrdenado.get(i+1)) > 0)
                         {
                             auxiliar = palabrasOrdenado.get(i);
                             palabrasOrdenado.set(i,palabrasOrdenado.get(i+1));
                             palabrasOrdenado.set(i+1,auxiliar);
                             intercambio = false;
                         }  
                    }
                        

                case 2:
                    for(i=i;i < palabrasOrdenado.size()-1 && intercambio== true;i++)
                    {
                        if(palabrasOrdenado.get(i).compareToIgnoreCase(palabrasOrdenado.get(i+1)) > 0)
                        {
                            auxiliar = palabrasOrdenado.get(i);
                            palabrasOrdenado.set(i,palabrasOrdenado.get(i+1));
                            palabrasOrdenado.set(i+1,auxiliar);
                            intercambio = false;
                            
                        }
                    }
                    
                    
                default:
                    if(i >= palabrasOrdenado.size()-1)
                    {
                        i=0;
                    }
            }
        
            if(!intercambio && opcion == 2)
            {
                break;
            }
        }
        
        if(this.prueba())
        {
            JOptionPane.showMessageDialog(null,"Ya no hay más movimientos");
        }
        
    }
    public boolean prueba()
    {
        
        intercambio = true;
        for(int i=0;i < palabrasOrdenado.size()-1 && intercambio== true;i++)
        {
            if(palabrasOrdenado.get(i).compareToIgnoreCase(palabrasOrdenado.get(i+1)) > 0)
            {
                intercambio = false;
            }
        }
        
        return intercambio;
                        
    }
}
