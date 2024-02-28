package com.mehmetdmr.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testMethod();

        System.out.println(math(12,12));
        System.out.println(newMethod("Mehmet"));

        makeMusicians();

        makeSimpsons();
    }

    public void makeSimpsons(){
        Simpsons homer = new Simpsons("Hommer",30,"Nucleer");

        System.out.println(homer.getName());

        homer.setName("Hommer simpson");
        System.out.println(homer.getName());
    }

    public void makeMusicians(){
    Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.instrument);
    }

    public String newMethod(String string){


    return string + " new method ";
    }
    public void testMethod(){
        int x=4+4;
        System.out.println("value of x "+x);
    }

    public int math(int a, int b){   //a ve b girdisini dışarıdan alır


        return a+b;         //alınan girdileri toplayarak geri veriyor (döndürüyor)
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
}


