package com.mehmetdmr.methodsandclasses;

public class Musicians {


    //attribute
    String name;
    String instrument;
    int age;

    public Musicians(String name, String instrument, int age) {  // constructor tanımı :bir instance(örnek) oluşturulduğunda çağrılacak ilik method

        this.name = name;           //sınıfımızza referans veriyor
        this.instrument = instrument;
        this.age = age;
        System.out.println("constructor  cağırıldı !");
    }
}
