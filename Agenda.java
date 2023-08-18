import java.util.ArrayList;
import java.util.Iterator;
public class Agenda
{
    private ArrayList<Nota> lista;

    public Agenda()
    {
        lista=new ArrayList<Nota>();
    }
    
    public void addNota(Nota nota){
        lista.add(nota);
    }
    
    public void borrarNota(int id){
        if(id>=0&&id<lista.size()){
            lista.remove(id);
        }else{
            System.out.println("La nota Nº: "+id+" no existe");
        }
    }
    
    public void listarNotas(){
        Iterator<Nota> it=lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public void contarNota(){
        int indice=0;
        while(indice<lista.size()){
            System.out.println(lista.get(indice));
            indice++;
        }
    }
}