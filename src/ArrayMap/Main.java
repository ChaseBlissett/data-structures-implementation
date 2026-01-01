package ArrayMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nArrayMap:");

        ArrayMap map = new ArrayMap();
        map.put(0, 0);
        map.put(5, 10);
        map.put(11, 23);
        map.print();

        System.out.println("\nValues: " + map.values());
        System.out.println("Key set: " + map.keySet());
        System.out.println("Value of 5: " + map.get(5));
        System.out.println("Map contains key -> 11: " + map.containsKey(11));
        System.out.println("Map contains key -> 15: " + map.containsKey(15));
        System.out.println("Map contains value -> 23: " + map.containsValue(23));
        System.out.println("Map contains value -> 25: " + map.containsValue(25));
    }
}
