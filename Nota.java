public class Nota
{
    private int id;
    private String hora;
    private String descripcion;

    public Nota(int id, String hora, String descripcion)
    {
        this.id=id;
        this.hora=hora;
        this.descripcion=descripcion;
    }
    
    public int getId(){
        return id;
    }
    
    public String getHora(){
        return hora;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public void setHora(String hora){
        this.hora=hora;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public void mostrar(){
        System.out.println("ID: "+id+"Hora: "+hora+"Descripción: "+descripcion);
    }
}
