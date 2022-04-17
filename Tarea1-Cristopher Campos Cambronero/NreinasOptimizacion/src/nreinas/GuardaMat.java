
package nreinas;

public class GuardaMat //copia la matriz que genera la solución para no perder sus valores
{
    Matriz mat = new Matriz(); //objeto mat de la clase Matriz  
    private int[][] copiaMat;  // Matriz que va recibir los datos del objeto mat
    
    
    public GuardaMat(int solucion) //metodo constructor de esta clase
    {
        mat.matriz(solucion); //invocación del metodo matriz de la clase Matriz
        this.GuardaMat(mat.tablero.length, mat.tablero.length); //llamada de ejecución al metodo GuardaMat
    }
     
    public void GuardaMat(int fila, int columna) 
    {
        copiaMat = new int[fila][columna]; //inicializa copiaMat
        
        //copia el valor de la matriz original en copiaMat
        for(int f=0; f < mat.tablero.length; f++ )
        {
            for(int c=0; c < mat.tablero.length;c++ )
            {
                copiaMat[f][c] = mat.tablero[f][c];
            }
        }
    }
    
    
}
