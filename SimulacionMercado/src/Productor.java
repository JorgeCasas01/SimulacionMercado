public class Productor extends Persona{
    int tiempoProduccion;
  
  public Productor(String parNombre, int parTiempoDesc, int parTiempoProduccion) {
    super(parNombre, parTiempoDesc);
    tiempoProduccion = parTiempoProduccion;
  }
 
  public int returnTiempoProduccion(){
    return tiempoProduccion;
  }
  
  public void setTiempoProduccion(int parTiempoProduccion){
    tiempoProduccion = parTiempoProduccion;
  }
  
  public void producir(){
    if(!this.getEstaDescansando()){
      //ToDo
    }
  }

}
