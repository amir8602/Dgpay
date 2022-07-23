//package function;
//import javax.naming.InsufficientResourcesException;
//import java.util.*;
//
//public class Main20 {
//    public static void main(String[] args) {
//
//        List<String> stringList = new ArrayList<String>();
//        stringList.add("Amir");
//        stringList.add("Hatef");
//        stringList.add("Mehran");
//        stringList.add("Mojtaba");
//        stringList.add("Mohammad");
//        stringList.add("Ali");
//        stringList.add("Davood");
//        stringList.add("Reza");
//        stringList.add("Mohsen");
//        Map<Integer , List<String>> stringListToMap = new HashMap<>();
//
//        for (int i = 0; i <stringList.size(); i++) {
//           if(stringListToMap.containsKey(stringList.get(i).length())){
//               List<String> stringList1 = stringListToMap.get(stringList.get(i).length());
//                stringList1.add(stringList.get(i));
//               stringListToMap.put(stringList.get(i).length(),stringList1);
//           }else{
//               List<String> stringList1 = new ArrayList<String>();
//               stringList1.add(stringList.get(i));
//               stringListToMap.put(stringList.get(i).length(),stringList1);
//           }
//        }
//        System.out.println(stringListToMap);
//
//
//        Collection<List<String>> values = stringListToMap.values();
//
//        Map<Integer , Map<Integer , List<String>>> mapIntegerIntegerList = new HashMap<>();
//
//        for (Integer integer : stringListToMap.keySet()) {
//            mapIntegerIntegerList.put(integer,)
//        }
//
//        System.out.println(values);
//
//
//
//
//
//    }
//}
