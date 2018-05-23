package SorteOpgaver.ch11.aske1208_a_11_16;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class sixteen
{
    public boolean is1to1(Map<String, String> map)
    {
        Map<String, String> copyMap = map;


        try {
            for (Map.Entry<String, String> m : map.entrySet()) {
                map.remove(m.getKey());
                if (map.containsValue(m.getValue()) == true) {
                    return false;
                }
            }

        }catch (ConcurrentModificationException CMe)
        {

        }
        return true;
    }
}
