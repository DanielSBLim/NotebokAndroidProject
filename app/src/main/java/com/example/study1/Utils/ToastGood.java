package com.example.study1.Utils;

import android.content.Context;
import android.widget.Toast;

public class ToastGood {

    private Context mContext;

    public ToastGood(Context context){
        mContext = context;
    }

    public void showToast(String msg){
        if(mContext != null) {
            Toast.makeText(mContext, msg, Toast.LENGTH_SHORT);
        }
    }
}
