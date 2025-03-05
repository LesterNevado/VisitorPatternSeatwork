import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallOffer{

    private static Map<String, String> unliMap = new HashMap<>();

    static{
        unliMap.put("Smart", "Do not offer any free calls or texts, and you will be charged per use.");
        unliMap.put("Globe", "Comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.");
        unliMap.put("Ditto", "includes unlimited calls and texts to all networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return unliMap.get(telcoName);
    }
    
}
