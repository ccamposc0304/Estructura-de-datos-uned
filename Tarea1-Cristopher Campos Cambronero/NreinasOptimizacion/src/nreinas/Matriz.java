package nreinas;

public class Matriz
{  
   //parametros para contruir la matriz tablero, columna y fila seran los contadores del metodo recursivo
   private int columna =0;
   private int fila =0;
   public int[][] tablero = new int[8][8];
   
   //contadores para ordenar y ubicar al metodo segun se vaya ejecutando
   private int cursor = 0;
   private int intentos = 0;
   
   //avisa si la posición en la matriz esta libre para colocar una dama segun los metodos de validación
   private boolean aviso;
      Reinas cuenta = new Reinas();
   
   public void matriz (int solucion)
   { // metodo recursivo que crea a nivel logico la matriz y "dibuja" las soluciones al problema
       if(solucion > 0)
       {
           if (fila==0)
           {
               tablero[fila][solucion] = 1;
               fila++;
           } 
        }    
        
       if(fila < tablero.length)
       {
           if(columna < tablero.length)
           {
               
                 
               // anidación de if que va llamando los metodos de validación para asegurarse que las reinas no se intersecten
               this.vdiag45(fila, columna); //primero se valida la diagona superior izq ya que su valor inicial, si la columna o fila es  0 se omite(ver metodo para entender)

               if(aviso == false)
               {
                   this.vfila(fila, columna); //luego se evalua los campos en linea reacta hacia  -n , si la columna es 0 se omite (ver metodo para entender)
                   if(aviso == false)
                       this.vdiag13(fila, columna); /** Por ultimo se valida la diagonal superior derecha, 
                                                    esta se empieza validar a en la columna 0 y hasta la columna 6, la exepción se hace cuando la fila es 0 **/
               }              

               if(aviso ==false) //si el bool aviso es falso quiere decir que la posición es  viable para la colocación de la dama 
               {
                   tablero[fila][columna] = 1;
                   cuenta.next();  // ejecucion de metodo en la clase Reinas
                    while(columna < tablero[fila].length)
                    {
                        columna++;
                    }
               }
               ++columna;
               this.matriz(solucion); //llamada recursiva de este metodo
           }
           if(aviso ==false)
           { //si aviso es false significa que la dama en este punto fue colocada por lo que se puede continuar con la siguiente fila 
               columna = 0;
               ++fila;
               this.matriz(solucion); //llamada recursiva de este metodo
           }else
           {  //si aviso es true significa que la no pudo ser colocada en la fila por lo que ejecuta las siguientes acciónes  
               //ver explicación directamente en el metodo
               this.intentos(fila); 
               this.matriz(solucion);
           }
        }
   }
   
   private void vdiag45(int fila, int col)
   { //metodo para revisión de la matriz en el el sguiente orden: -fila -columna hasta llegar a 0 en alguno de los dos empezando por las fila
       if(fila>0)
       {
           if(col > 0)
           {    --fila;
                --col;
                if(tablero[fila][col] == 1)
                    aviso = true;
                else
                {
                    aviso = false;
                    this.vdiag45(fila, col);
                }
            }
       }else
           aviso = false;
   }
   
   private void vdiag13(int fila, int col)
   {//metodo para revisión de la matriz en el el sguiente orden: -fila +columna hasta llegar a 0 en las fila o a 7 en las columnas, empezando por las filas
       if(fila>0)
       {
           if(col >= 0 && col < 7)
           {    --fila;
                ++col;
                if(tablero[fila][col] == 1)
                    aviso = true;
                else
                {
                    aviso = false;
                    this.vdiag13(fila, col);
                }
            }
       }else
           aviso = false;
   }
   
   private void vfila(int fila, int col)
   {//metodo para revisión de la matriz en el el sguiente orden: -fila hasta llegar a 0 en las fila
       if(fila>0)
       {
            --fila;            
            if(tablero[fila][col] == 1)
                aviso = true;
            else
            {
                aviso = false;
                this.vfila(fila, col);
            }
       }else
           aviso = false;
   }
   private void intentos(int fila)
   {
       fila = cuenta.cuenta; // mueve el contador fila a la ultima fila donde se coloco una dama
       this.otraSol(fila, 0);  // lamada a metodo ( ver metodo para explicación
       columna = cursor; //  le indica a columna desde donde debe empezaar el ciclo
       
       //si la cantida de intentos de colocar una dama excede 7
       intentos++;
       if(intentos > 7)
       {
           //retrocede en las filas resueltas 1 fila mas para buscar una nueva solución desde un punto trasanterior
           cuenta.pushback();
           fila = cuenta.cuenta; // mueve el contador fila a la penultima fila donde se coloco una dama
           this.otraSol(fila, 0);// lamada a metodo ( ver metodo para explicación
           columna = cursor; //  le indica a columna desde donde debe empezaar el ciclo
           intentos = 0; // reinicia variable intentos
       }
       this.fila = fila; // le da al contador fila el paramatro final desde el que iniciará luego de la ejecución de este metodo
       columna++; // El contador columna aumenta en 1 para que no evalue nuevamente la solución corregida y empieze a nueva soluciones
       cursor= 0;
    }
   
   private void otraSol(int fila,int col)
   {
     // recibida una fila, se encarga de recorrerla para borrar cualquier valor 
      if(cursor < 8)
      {
          if(tablero[fila][cursor] == 1 )
          {
              tablero[fila][cursor] = 0;
              ++col;
          }else
          {
              cursor++;
              this.otraSol(fila, cursor); // llamada recursiva a este metodo
          }
        }
    }
}
    
class Reinas
{// da la posición de la ultima dama colocada para poder reconstruir las soluciones en caso de que falten damas por colocar
    public int cuenta = -1; //contador inicia en -1 para que cuando la primera dama sea colocada este contador se sincronize con la fila que se esta recorriendo en ese momento
    
    public void next()
    {// se aumenta si fue posible colocar la dama en una fila
            ++cuenta;
    }
    
    public void pushback()
    {//se retrocede cuando se requiere corrar una solución para buscar mas alternativas
        --cuenta;
    }
}
