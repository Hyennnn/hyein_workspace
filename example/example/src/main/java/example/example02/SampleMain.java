package example.example02;

import java.util.Arrays;

public class SampleMain {
    public static void main(String[] args) {
        Sample<String> sample = new Sample<>();
        sample.addElement("This is string" , 5);
        sample.getElement(5);
        System.out.println(sample.getElement(5));
    }
}