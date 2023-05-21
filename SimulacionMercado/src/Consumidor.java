public class Consumidor extends Persona{
  private int tiempoConsumo;
  
  public Consumidor(String parNombre, int parTiempoDesc, int parTiempoConsumo) {
    super(parNombre, parTiempoDesc);
    tiempoConsumo = parTiempoConsumo;
  }
  
  public int returnTiempoConsumo(){
    return tiempoConsumo;
  }
  
  public void setTiempoConsumo(int parTiempoConsumo){
    tiempoConsumo = parTiempoConsumo;
  }
  
  public void consumir(){
    //ToDo
  }
  
  public void run(){
    while(!this.getEstaDescansando()){
      this.consumir();
      try {
        Thread.sleep(5);
      } catch (InterruptedException ex) {
        Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }
  
}
