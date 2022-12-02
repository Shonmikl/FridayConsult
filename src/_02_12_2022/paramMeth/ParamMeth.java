package _02_12_2022.paramMeth;

import java.util.ArrayList;

public class ParamMeth {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("101");
        list.add("102");
        //System.out.println(GenMeth.getSecondEl(list));
    }
}

class GenMeth {
    public static <T extends Number> T getSecondEl(ArrayList<T> list) {
        return list.get(1);
    }
}