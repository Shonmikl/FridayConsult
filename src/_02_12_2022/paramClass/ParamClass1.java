package _02_12_2022.paramClass;

import lombok.Getter;

import java.lang.constant.Constable;

public class ParamClass1 {
    public static void main(String[] args) {

//        Info<String> info = new Info<>("!!!!!");
//        System.out.println(info);
//        String s = info.getValue();

        Info<Integer> info1 = new Info<>(55);
        System.out.println(info1);
        int a = info1.getValue();
    }
}

@Getter
class Info<T extends Number & Constable> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public void get(T t){
        System.out.println(t);
    }
}

interface FlyAble {
}

interface Writable {
}