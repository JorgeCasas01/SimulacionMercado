  public class Persona extends Thread{
  private String nombre;
  private boolean estaDescansando = false;
  private int tiempoDescanso;

  public Persona(String parNombre, int parTiempoDesc){
    nombre = parNombre;
    tiempoDescanso = parTiempoDesc;
  }

  public void setNombre(String parNombre){
    nombre = parNombre;
  }

  public void setTiempoDescanso(int parTiempoDesc){
    tiempoDescanso = parTiempoDesc;
  }

  public String getNombre(){
    return nombre;
  }

  public int getTiempoDescanso(){
    return tiempoDescanso;
  }

  public boolean getEstaDescansando(){
    return estaDescansando;
  }

  public void descansar(){
   estaDescansando = true; 
  }
}
