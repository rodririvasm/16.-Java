import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class List_string {
    public static void main(String[] args) {
        
        Map diccionario=new  HashMap();
        diccionario.put(1,"rodrigo rivas");
        diccionario.put(2,"karla");

        System.out.println(diccionario.get(1));
        System.out.println(diccionario.get(2));

        for(Map.Entry(String, String).Entry:diccionario.EntrySet()){
            System.out.println(Entry.getKey()+":"+Entry.getValue());
        }

    }
}
