public class Consumidor extends Persona {
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
    if(!this.getEstaDescansando()){
      //ToDo
    }
  }
}
