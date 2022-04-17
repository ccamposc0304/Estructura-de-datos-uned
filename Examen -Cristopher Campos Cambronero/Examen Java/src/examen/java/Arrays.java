package examen.java;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Arrays 
{
    Ordenamiento ordena = new Ordenamiento();
    public static ArrayList<String> palabras;
    DefaultListModel df1 = new DefaultListModel();
    DefaultListModel df2 = new DefaultListModel();
    
    public String palabra;
    
    public Arrays()
    {
        palabras = new ArrayList<>();
    }
    
    public void setMatriz()
    {
        ordena.getArreglo(palabras);
    }
    
    public void ingreso()
    {
       palabras.add(palabra);
       df1.addElement(palabra);
    }
    public void cuentaLetras()
    {
        
        int cantidad = 0 ;
        for (int i = 0; i < ordena.palabrasOrdenado.size(); i++) 
        {
            cantidad = ordena.palabrasOrdenado.get(i).length();
            System.out.println(String.format("La palabra %-9s tiene %02d letras ", ordena.palabrasOrdenado.get(i) , cantidad));
        }
    }

    public void modeloLista2()
        {
            if(df2.isEmpty() == false)
                df2.removeAllElements();
            for (int i = 0; i < ordena.palabrasOrdenado.size(); i++) 
            {
                df2.addElement(ordena.palabrasOrdenado.get(i));
            }
        }
}
