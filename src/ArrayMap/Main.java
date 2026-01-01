package ArrayMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayMap.ArrayMap:\n");

        ArrayMap map = new ArrayMap();
        map.put(0, 0);
        map.put(5, 10);
        map.print();
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.get(5));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue(3));
    }
}
