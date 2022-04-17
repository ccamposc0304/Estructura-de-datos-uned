
package proyecto2;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class logicClass 
{
    Pelicula peli;
    Pelicula peliV = new Pelicula("prueba", "prueba", 0);
    ListaEnlazada link = new ListaEnlazada();
    public DefaultListModel ls = new DefaultListModel();
    public logicClass()
    {
    }
    public void showDetalle(int pos)//muestra el detalle del objeto en un jOptionPane
    {
        String nombre = link.getPeli(pos).getNombre();
        String genero= link.getPeli(pos).getGenero();
        int duracion= link.getPeli(pos).getDuracion();
        int valor= link.getPeli(pos).getValor();
        if(link.getPeli(pos) == null)
        {
        }else
        {  
            JOptionPane.showMessageDialog(null,String.format
                                ("Detalle de película--> Nombre: %s, Género: %s, Duración: %d minutos, Inversión: %d"
                                        ,nombre,genero,duracion, valor));
        }
    }
    public void add(String nombre, String genero, int duracion)//agrega un nuevo objeto Pelicula
    {
        if( duracion < 60 || duracion >300)
        {
            JOptionPane.showMessageDialog(null, "La duración debe de ser mayor a 60 minutos o menor 300");
        }else
        {
            link.add(peli= new Pelicula(nombre,genero, duracion));
            JOptionPane.showMessageDialog(null,"Su película fue agregada a la lista");
        }
    }
    public void pop(int pos)// elimina un elemento de la listaEnlazada
    {
        String nombre = link.getPeli(pos).getNombre();
        String genero= link.getPeli(pos).getGenero();
        int duracion= link.getPeli(pos).getDuracion();
        if(link.getPeli(pos) == null)
        { 
        }else
        {
            peliV.setMovieName(nombre);
            peliV.setDuracion(duracion);
            peliV.setGenero(genero);
            link.delElement(peliV);
            JOptionPane.showMessageDialog(null,String.format
                                ("Se eliminará la película: %s de %s con una duración de %d minutos",nombre,genero,duracion));
        }
        
    }
    public void borraTodo()//borra todos los elementos de la listaEnlazada
    {
        if(link.estaVacia())
        {
            JOptionPane.showMessageDialog(null,"No hay elementos para eliminar en la lista");
        }else
        {
            link.delList();
            JOptionPane.showMessageDialog(null,"Se estan eliminando todos los elementos de la lista");
        }
    }
    public ListModel modelo()//lista modelo para JList
    {
        if(ls != null)
            ls.removeAllElements();
        for (int i = 0; i <= link.size(); i++) 
        {
            if(link.getPeli(i) != null)
            {
                ls.addElement(link.getPeli(i).getNombre());
            }
        }    
        return ls;
    }
    public int getInversion()//obtine inversión total de la listaEnlazada
    {
        int suma = 0;
        for (int i = 0; i <= link.size(); i++) 
        {
            if(link.getPeli(i) != null)
            {
                suma = suma+ link.getPeli(i).getValor();
            }
        }
        return suma;
    }
    public int size()// obtiene size de la listaEnlazada
    {
        return link.size();
    }
    
}
