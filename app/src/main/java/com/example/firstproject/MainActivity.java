package com.example.firstproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
//    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
        textView = findViewById(R.id.text3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(getApplicationContext(), "Ok Button Clicked", Toast.LENGTH_LONG).show();

                //  or

//                Toast toast = Toast.makeText(getApplicationContext(),
//                        "This is a message displayed in a Toast",
//                        Toast.LENGTH_SHORT);
//
//                toast.show();
//
//
//
//
//                showDialogMessage();

            }
        });
    }
}

//    private void showDialogMessage() {
//        //Now create alert Dialog
//
//        AlertDialog.Builder alertDialog=new AlertDialog.Builder( this);
//        alertDialog.setTitle("Delete")
//                .setMessage ("Do you want to delete text?")
//                .setNegativeButton("No", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                        dialogInterface.cancel();
//                    }
//                })
//                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                    }
//                }).show();
//        alertDialog.create();
//        }
//
//    }











