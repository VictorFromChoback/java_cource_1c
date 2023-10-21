package hw6;

import hw6.bean.BeanUtils;
import hw6.classes.FromClass;
import hw6.classes.ToClass;

public class Main {
    public static void main(String[] args) {
        FromClass fromClass = new FromClass("abc", 0, 0);
        ToClass toClass = new ToClass("a", 0, 0);
        BeanUtils.assign(toClass, fromClass);
        System.out.println(toClass);
    }
}
