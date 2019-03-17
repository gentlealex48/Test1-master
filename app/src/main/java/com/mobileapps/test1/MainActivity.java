package com.mobileapps.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {


    }

    public String Reverse(String str){

        char c;
        int ic;
        int a = (int) 'a';
        int z = (int) 'z';
        String result = "";

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            ic = (int) c;
            result = result + CharacterValueOf(z - (ic - a));
        }

        return result;
    }

    public String[] AlphResults(String str){

        String[] result;

        char c;
        int ic;
        int a = (int) 'a';

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            ic = (int) c;
            result[ic - a] = result[ic - a] + 1;
        }

        return result;
    }

    public void jungle(){

    }

}
