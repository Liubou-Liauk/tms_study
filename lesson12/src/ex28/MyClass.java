package ex28;

import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {
        AllTypeofData<Number> arr = new AllTypeofData<>();

        arr.setArrIndex(new Number[5]);

        arr.getArrIndex()[0]= -127;
        arr.getArrIndex()[1]= -12.3;
        arr.getArrIndex()[2]= 99999;
        arr.getArrIndex()[3]= 0;
        arr.getArrIndex()[4]= 987;
        System.out.println(arr.getArrIndex(3));
    }
}

