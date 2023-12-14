/**
 * clase Singleton
 * @author Cristian Regueiro Martínez
 * @version 1.0
 */

public class Singleton {

    /**
     * el numero a adivinar
     */
   private int num_adivinar;
    /**
     * el nuemro escogido para adivinar el numero
     */
   private int num_escogido;
    /**
     * el numero de aciertos que llevamos
     */
   private int num_aciertos;
    /**
     * el numero de fallos que llevamos
     */
   private int num_fallos;
    /**
     * la ronda actual de la partida
     */
   private int ronda_actual;
    /**
     * la cantidad de rondas que llevamos
     */
   private int ronda_partida;
    /**
     * el numero máximo de intentos que tenemos para acertar el numero
     */
   private final int NUM_MAX_INTENTOS=2;

    /**
     * nuestro atributo estatico para hacer el singleton
     */
   private static Singleton instance=null;

    /**
     * contructor privado por defecto
     */
    private Singleton(){

    }

    /**
     * constructor parametrizado privado
     * @param num_adivinar el numero a adivinar
     * @param num_escogido el numero escogido
     * @param num_aciertos el numero de aciertos
     * @param num_fallos el numero de fallos
     * @param ronda_actual la ronda actual
     * @param ronda_partida el numero de rondas que llevamos en la partida
     */

 private  Singleton(int num_adivinar, int num_escogido, int num_aciertos, int num_fallos, int ronda_actual, int ronda_partida) {
        this.num_adivinar = num_adivinar;
        this.num_escogido = num_escogido;
        this.num_aciertos = num_aciertos;
        this.num_fallos = num_fallos;
        this.ronda_actual = ronda_actual;
        this.ronda_partida = ronda_partida;
    }

    /**
     * los getter y setter
     * @return los atributos correspondientes
     */
    public int getNum_adivinar() {
        return num_adivinar;
    }

    public void setNum_adivinar(int num_adivinar) {
        this.num_adivinar = num_adivinar;
    }

    public int getNum_escogido() {
        return num_escogido;
    }

    public void setNum_escogido(int num_escogido) {
        this.num_escogido = num_escogido;
    }

    public int getNum_aciertos() {
        return num_aciertos;
    }

    public void setNum_aciertos(int num_aciertos) {
        this.num_aciertos = num_aciertos;
    }

    public int getNum_fallos() {
        return num_fallos;
    }

    public void setNum_fallos(int num_fallos) {
        this.num_fallos = num_fallos;
    }

    public int getRonda_actual() {
        return ronda_actual;
    }

    public void setRonda_actual(int ronda_actual) {
        this.ronda_actual = ronda_actual;
    }

    public int getRonda_partida() {
        return ronda_partida;
    }

    public void setRonda_partida(int ronda_partida) {
        this.ronda_partida = ronda_partida;
    }

    public int getNUM_MAX_INTENTOS() {
        return NUM_MAX_INTENTOS;
    }

    /**
     * metodo para devolver el objeto y unico creado
     * @return objeto
     */
    public static Singleton getInstance(){

       if(instance==null){

          instance=new Singleton();
       }


        return instance;
    }

}
