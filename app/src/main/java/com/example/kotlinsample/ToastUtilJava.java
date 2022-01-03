package com.example.kotlinsample;

import android.widget.Toast;

public class ToastUtilJava {
    public static void toastShort(String message){
        Toast.makeText(MainApplication.getAppContext(),message,Toast.LENGTH_SHORT).show();
    }
    public static void toastLong(String message){
        Toast.makeText(MainApplication.getAppContext(),message,Toast.LENGTH_LONG).show();
    }
}
// ToastUtilJava.toastShort("message~~") 이런 식으로 쓰면 됨.