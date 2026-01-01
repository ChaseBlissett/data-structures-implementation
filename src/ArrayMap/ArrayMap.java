package ArrayMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Node {
    int key;
    int value;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

}

public class ArrayMap {
    ArrayList<Node> array;

    ArrayMap() {
        array = new ArrayList<>();
    }

    public void print() {
        // Use String Builder to build and format
        // a String that resembles a HashMap for the
        // ArrayMap.ArrayMap object.

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.size(); i++) {
            Node keyValue = array.get(i);
            sb.append("{");
            sb.append(keyValue.key);
            sb.append("=");
            sb.append(keyValue.value);
            sb.append('}');


            if (i < array.size() - 1) sb.append(" , ");
            /* It is best to add a comma between each node or key value
             * for formatting purposes, but there needs to be logic in place
             * to check if the current keyValue is the last one. If this wasn't
             * in place, it would look something like:
             *
             * [{0, 0} , {1, 5} , ]*/
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public void put(int key, int value) {
        this.remove(key);
        this.array.add(new Node(key, value));
    }

    public int get(int key) {
        for (Node node : this.array) {
            if (node.key == key) return node.value;
        }
        System.out.println(("The specified key does not exist"));
        return -1;
    }

    public int remove(int key) {
        for (int i = 0; i < this.array.size(); i++) {
            if (array.get(i).key == key) {
                int value = array.get(i).value;
                array.remove(i);
                return value;
            }
        }
        return -1;
    }

    public void clear() {
        array.clear();
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public boolean containsKey(int key) {
        if (this.isEmpty()) return false;
        for (Node node : this.array) {
            if (node.key == key) return true;
        }
        return false;
    }

    public boolean containsValue(int value) {
        if (this.isEmpty()) return false;
        for (Node node : this.array) {
            if (node.value == value) return true;
        }
        return false;
    }

    public List<Integer> values() {
        List<Integer> values = new ArrayList<>();
        for (Node node : this.array) {
            values.add(node.value);
        }
        return values;
    }

    public Set<Integer> keySet() {
        Set<Integer> keys = new HashSet<>();
        for (Node node : this.array) {
            keys.add(node.key);
        }
        return keys;
    }

    public int size() {
        return this.array.size();
    }



}