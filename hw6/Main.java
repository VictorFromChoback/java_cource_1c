package hw6;

import hw6.bean.BeanUtils;
import hw6.classes.FromClass;
import hw6.classes.ToClass;

public class Main {
    public static void main(String[] args) {
        FromClass fromClass = new FromClass("fromString", 1, 2);
        ToClass toClass = new ToClass("toString", 3, 4);
        BeanUtils.assign(toClass, fromClass);
        System.out.println(toClass);
    }
}
