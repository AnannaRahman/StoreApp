package com.ananna.sharppay;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CustomDialogClass extends Dialog implements
        android.view.View.OnClickListener {


    public Activity c;
    public Dialog d;
    public Button yes, no;
    private ImageView btn_cross;

    public CustomDialogClass(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);


    }

    @Override
    public void onClick(View v) {

        Toast.makeText(getContext(), "This is slider " , Toast.LENGTH_SHORT).show();

    }
}