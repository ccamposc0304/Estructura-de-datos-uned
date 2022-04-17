
package nreinas;

//importación de librerias necesario para graficar GUI
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ventana extends JFrame
{
    muestraMat showSig = new muestraMat();
    Tablero tbl;
    
    public Ventana()  //contructor de clase Ventana
    {
        
        setSize(1500,1000); // tamaño de Ventana
        
        // Etiquetas de texto lbl1 y lbl2
        JLabel lbl1 = new JLabel();
        lbl1.setFont(new Font("Serif", Font.BOLD, 40)); 
        Dimension size = null;
        lbl1.setText("Esta aplicación muestra 5 de las 92 posibles soluciones al reto de las 8 reinas");
        add(lbl1);
        
        JLabel lbl2 = new JLabel();
        lbl2.setFont(new Font("Serif", Font.BOLD, 90)); 
        lbl2.setText("#" +(showSig.showSol +1));
        add(lbl2);
        
        //Da parametros al objeto tbl y lo agrega al Jframe Ventana
        tbl = new Tablero();
        tbl.setPreferredSize(new Dimension(650,650));
        tbl.Tablero(0, 0);
        add(tbl);
        
        //parametriza y agrega boton "Siguiente"
        JButton boton = new JButton();
        boton.addActionListener((ActionEvent e) -> {
            
            //Acciones a ejecutar cada vez que se clikea el boton
            showSig.showSol ++; // aumenta contador showSol de la clase MuestraMat() en 1 
            
            //etiqueta que orienta al usuario en el # de solución que esta observando
            lbl1.removeAll(); 
            lbl2.setText("#" +(showSig.showSol+1));
            lbl2.updateUI();
            
           //actualiza el la interfaz grafica para mostrar la siguiente solución en pantalla
            tbl.removeAll();
            tbl.Tablero(0, 0);
            tbl.updateUI();
            
            //le indica a showSol que cuando su contador llegue 5 se reinicie en 0
            if(showSig.showSol == 4)
                showSig.showSol =-1;
            
        });
        boton.setText("SIGUIENTE SOLUCIÖN");
        boton.setPreferredSize(new Dimension(200,75));
        add(boton);
        
        //parametros de visualización y navegación del JFrame Ventana
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.RIGHT,75,10));
        this.setTitle("Muestra reto 8 Reinas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
       
    }
}
    
class Tablero extends JPanel
{ //construción del tablero de ajedrez y ordenación de las damas segun las soluciones almacenadas
    private static int columnas = 8;
    private static int filas = 8;
    private final String[][] Casillas = new String[columnas][filas];
    muestraMat paintSol = new muestraMat(); //objeto paintSol de la clase muestraMat que le indica a Tablero donde colocar las reinas para n solución almacenada
   
    public Tablero() //metodo constructor de esta clase
    {
      setLayout(new GridLayout(8,8));
      setVisible(true);
    }
    
    public void Tablero(int c , int f)
    { //metodo recursivo para creación del tablero
        if(f < 8)
        {
            if(c <8)
            {
             
                final JButton casilla = new JButton(Casillas[c][f]);
                Imagen img = new Imagen();
                add(casilla);
            
                if((c+f+1)%2==0)
                { 
                    casilla.setBackground(Color.GRAY);
                    }
                else
                {    
                    casilla.setBackground(Color.WHITE);
                }
                
                //si el objeto paintSol encuentra el valor 1 en la matriz segun la fila y columna recorrida, Tablero agregara la dama en esa posición
                if(paintSol.vAlmacen(c,f, paintSol.showSol) == 1){
                    casilla.add(img);
                }
                ++c;                      
                Tablero(c,f);
            }else
            { 
                c=0;
                ++f;
                Tablero(c,f); //llamada recursiva
            }
        }
    }
}

class Imagen extends javax.swing.JPanel
{// clase que da la ruta donde se almacena el icono de la dama en indica como se mostrará
   
    public Imagen() 
    {
        this.setSize(300, 400);
    }
    
    public void paint(Graphics grafico) 
    {
        Dimension height = getSize();
        ImageIcon Img = new ImageIcon(getClass().getResource("/Iconos/dama_negra.png")); 
        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(grafico);
    }
} 
    
class muestraMat
{// esta clase crea una lista de los arreglos con las 5 soluciones generadas 
    public static int showSol = 0;
    int sol =0;
    GuardaMat[] mat= new GuardaMat[5];
    
    public muestraMat() //metodo constructor de esta clase
    {
        this.almacenaSol(); // ejecución del metodo que almacena las soluciones
    }
   
    public void almacenaSol()
    {// guarda la matriz en la lista de arreglos segun el contador le indique sea su numero en la lista, cuando llega a 5 sale
        if(sol < 5)
        {
            mat[sol] = new GuardaMat(sol);
            sol++;
            this.almacenaSol(); // llamada recursiva
        }  
    }
    public int vAlmacen(int fila, int columna, int sol)
    {//busqueda de los espacios reservados para las damas en n solución
                 
        return mat[this.showSol].mat.tablero[fila][columna];
    }        
}
 
    
    

