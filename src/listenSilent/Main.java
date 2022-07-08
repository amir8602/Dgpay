package listenSilent;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String source = "abb";
        String target = "aba";
        String chare = "";
        Map<String, Long> mapFirst = new HashMap<String, Long>();
        for (int i = 0; i < source.length(); i++) {
            chare = source.substring(i, i + 1);
            if (mapFirst.containsKey(chare)) {
                Long a = mapFirst.get(chare);
                a++;
                mapFirst.put(chare, a);
            } else {
                mapFirst.put(chare, 1L);
            }
        }


        Map<String ,Long> mapSecond = new HashMap<String,Long>();
        for (int i = 0; i < target.length(); i++) {
            chare = target.substring(i, i + 1);
            if (mapSecond.containsKey(chare)) {
                Long a = mapSecond.get(chare);
                a++;
                mapSecond.put(chare, a);
            } else {
                mapSecond.put(chare, 1L);
            }
        }



        for (int i = 0; i <mapFirst.size() && i<mapSecond.size(); i++) {
            if (!mapFirst.get(i).equals(mapSecond.get(i))){

            }
        }



        System.out.println(mapFirst);


//        Set<String> strings = map.keySet();
//        System.out.println(strings);
//
//
//        Collection<Long> values = map.values();
//        System.out.println(values);

    }
}