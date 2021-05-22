public class Bichos {
    public static Bichos[][] bichos = new Bichos[2][2];
    protected int salud;
    protected String tipo;
    
    public Bichos(int salud, String tipo){
        this.salud = salud;
        this.tipo = tipo;
    }
    
    public void disparar(){
        this.salud -= 5;
    }
    public int getSalud(){
        return this.salud;
    }    
    public String toString(){
        return this.tipo+"-"+this.salud;
    }

    public static void tablero() {
        String tablero = "-------------" + "\n" + "|" + mostrarCasilla(bichos[0][0]) + "|"
                + mostrarCasilla(bichos[0][1]) + "|" + "\n" + "-------------" + "\n" + "|"
                + mostrarCasilla(bichos[1][0]) + "|" + mostrarCasilla(bichos[1][1]) + "|" + "\n" + "-------------"
                + "\n";

        System.out.print(tablero);
    }

    public static String mostrarCasilla(Bichos b) {
        if (b == null) {
            return "     ";
        } else {
            return b.toString();
        }
    }

    public static boolean termina(){
        boolean acabado = true;
        int contador = 0;
        for(int i=0;i<bichos.length;i++){
            for(int j=0;j<bichos.length;j++){
                if(bichos[i][j] == null){
                    contador += 1;
                }
            }
        }
        return contador == 4;
    }
}