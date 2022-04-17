package proyecto2;

public class Pelicula 
{
    private  String movieName; //Nombre de pelicula
    private  String genero; //Comedia, Drama, Terror, Infantiles y Acción
    private  int duracion; //duracion de pelicula
    private int valor;

    //getters y setters de esta clase
    public Pelicula(String movieName,String genero, int duracion)
    {
        this.movieName = movieName;
        this.genero = genero;
        this.duracion = duracion;
        this.setValor();
    }
    public void setValor() // setea el valor de las peliculas
    {
        if(duracion <= 75)
        {
            valor = 2000;
        }else
        {
            if(duracion > 75 && duracion <=90)
                {
                    valor = 2500;
                }else
                {
                    if(duracion > 90 && duracion <=180)
                    {
                        valor=3000;
                    }else
                    {
                        if(duracion > 180 && duracion <=240)
                        {
                            valor=3500;
                        }else
                        {
                            valor=4000;
                        }
                    }
                }
        }
            
    }
    public void setMovieName(String movieName) 
    {
        this.movieName = movieName;
    }
    public void setGenero(String genero) 
    {
        this.genero = genero;
    }
    public void setDuracion(int duracion) 
    {
        this.duracion = duracion;
    }
    public int getDuracion()
    {
        return duracion;
    }
    public String getNombre()
    {
        return movieName;
    }
    public String getGenero()
    {
        return genero;
    }
    public int getValor() 
    {
        return valor;
    }
}
