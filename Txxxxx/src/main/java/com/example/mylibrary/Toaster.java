package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void s(Context c, String msg){
        Toast.makeText(c,msg,Toast.LENGTH_SHORT).show();
    }
}

