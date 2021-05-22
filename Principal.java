import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        int aleatorio, tipo;
        int fila = 1;
        int posi1, posi2;
        aleatorio = (int)(Math.random()*4)+1;
        int columna = aleatorio;
        if(aleatorio>2){
            fila = 2;
            columna = 2;
        }
        
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
                tipo = (int)(Math.random()*2)+1;
                if(tipo==1){
                    Bichos.bichos[i][j] = new BichoNormal();
                } else {
                    Bichos.bichos[i][j] = new BichoAlien();
                }
            }
            if(aleatorio==3){
                columna = 1;
            }
        }
        Bichos.tablero();
        
        while(!Bichos.termina()){
            System.out.println("Usuario, ingrese a qué casilla atacar");
            posi1 = n.nextInt();
            posi2 = n.nextInt();
            Bichos.bichos[posi1][posi2].disparar();  
            
            if (aleatorio == 3){
                columna = 2;
            }
            for(int i=0;i<fila;i++){
                for(int j=0;j<columna;j++){
                    if(Bichos.bichos[i][j]==null){
                    } else if (Bichos.bichos[i][j].getSalud()==0){
                        Bichos.bichos[i][j] = null;
                    }
                }
                if(aleatorio==3){
                    columna = 1;
                }
            }
            Bichos.tablero();
        }
        System.out.println("Juego finalizado, todos los bichos acabados.");
    }
}