package proyecto2;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class ListaEnlazada 
{
    Nodo cabeza;
    Nodo cola;
    
    
    public ListaEnlazada() // constructor
    {
        cabeza = null;
        cola= null;
    } 
    public boolean estaVacia()//comprueba si lista esta vacia
    {
        if(cabeza == null)
        {
            return true;
        }else
        {
            return false;
        }
    }
    public void add(Pelicula peli)// agraga nuevo nodo a la lista segun orden
    {
        Nodo actual = new Nodo(peli, null);
        Nodo avanza2;
        Nodo avanza1;
        
        if(estaVacia())
        {
            cabeza = actual;
            cola = actual;
        }else
        {
            avanza1 = cabeza;
            while(avanza1 != null)
            {
                avanza2 = avanza1.getSig();
                if(actual.getPeli().getDuracion() < avanza1.getPeli().getDuracion())
                {
                    actual.setSig(cabeza);
                    cabeza = actual;
                    break;
                }else
                {
                    if(actual.getPeli().getDuracion() > avanza1.getPeli().getDuracion() && avanza2 == null)
                    {
                        avanza1.setSig(actual);
                        cola = actual;
                        break;
                    }else{
                        if(actual.getPeli().getDuracion() > avanza1.getPeli().getDuracion() && actual.getPeli().getDuracion() <= avanza2.getPeli().getDuracion())
                        {
                            avanza1.setSig(actual);
                            actual.setSig(avanza2);
                            break;
                        }else
                        {
                            avanza1= avanza1.getSig();
                        }
                    }
                }
            }
        
        }
    }
    public Pelicula getPeli(int pos)// obtiene el nodo deseado segun su posición en la lista
    {
        Nodo avanza1= cabeza;
        Nodo returned= cabeza;
        if(estaVacia())
        {
            
        }else
        {
            
            for(int i=0; i < pos; i++)
            {
                returned = avanza1;
                avanza1 = avanza1.getSig();
            }
        }
        if(avanza1 !=null)
        {
             return avanza1.getPeli();       
        }else
        {
            return null;
        }
    }
    public void delElement(Pelicula peli) // elimina de la lista el nodo con la pelicula indicada
    {
        Nodo avanza1;
        Nodo avanza2;
        if(this.estaVacia())
        {
            JOptionPane.showMessageDialog(null, "Lista Vacia");
        }else{
            avanza1 = cabeza;
            
            while(avanza1 != null)
            {
                avanza2 = avanza1.getSig();
                if(cabeza.getPeli().getNombre() == peli.getNombre() && cabeza.getPeli().getDuracion()== peli.getDuracion())
                {
                    cabeza= avanza2;
                    break;
                }else
                {
                    if(avanza2.getPeli().getNombre() == peli.getNombre() && avanza2.getPeli().getDuracion()== peli.getDuracion() )
                    {
                        avanza1.setSig(avanza2.getSig());
                        break;
                    }
                    else
                    {
                        avanza1 = avanza1.getSig();
                    }
                }
                
            }
        }
    }
    public void delList() // borra toda la lista
    {
        Nodo avanza1;
        Nodo avanza2;
        if(this.estaVacia())
        {
            JOptionPane.showMessageDialog(null, "Lista Vacia");
        }else
        {
            avanza1 = cabeza;
            
            while(avanza1 != null)
            {   
                avanza2 = avanza1.getSig();
                
                if(avanza1 == cabeza)
                {
                    cabeza = null;
                }
                if(avanza1 == cola)
                {
                    cola = null;
                }
                avanza1 = null;
                
                if(avanza2 != null)
                {
                    avanza1 = avanza2;
                }
            }
            
        }
        
    }
    public int size() // da el tamaño de la lista
    {
        int cuenta = -1;
                
        if(estaVacia())
        {
            return -1;
        }else
        {
            Nodo avanza1;
            avanza1 = cabeza;
            while(avanza1 != null)
            {
                cuenta++;
                avanza1 = avanza1.getSig();
            }
        }
        return cuenta;
    }
}

class Nodo // clase Nodo
{
    private Pelicula peli;
    private Nodo sig;
    
    public Nodo(Pelicula peli, Nodo sig ) 
    {// constructor con el nodo siguiente en sus paramentros para que sea mas facil identificar el apuntador
        this.sig = sig ;
        this.peli = peli;
    }
    
    //Getters y Setters del objeto Nodo
    public Pelicula getPeli() 
    {
        return peli;
    }
    public Nodo getSig() 
    {
        return sig;
    }
    public void setPeli(Pelicula peli) 
    {
        this.peli = peli;
    }
    public void setSig(Nodo sig) 
    {
        this.sig = sig;
    }
}
