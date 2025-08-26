import java.util.Map;
import java.util.TreeMap;

public class TesteMap {

    public static void main(String[] args) {

        //Testando Map - Chave, valor

        
        Map <String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("e-mail", "maria@gmail.com");
        cookies.put("phone", "990102941");

        cookies.remove("e-mail");
        cookies.put("phone", "990102234");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("All Cookies: ");

        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

        



    }

}
