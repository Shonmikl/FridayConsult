package _02_12_2022.paramClass;

import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class ParamClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("@@@@", 222);
        System.out.println(pair.getValue1() + " : " + pair.getValue2());
    }
}
@Getter
class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

//    public V1 get(List<? extends V2> list) {
//        return list;
//    }
}