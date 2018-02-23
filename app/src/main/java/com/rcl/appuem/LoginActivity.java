package com.rcl.appuem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    protected TextView mSignUpTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //getActionBar().hide();
        getSupportActionBar().hide();

        /* OTRA FORMA DE ASIGNAR FUNCIONALIDAD A UN BOTÓN
        mSignUpTextView = (TextView)findViewById(R.id.SignUpText);
        mSignUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
        */

    }


    public void mostrarVentana(View view){
        Intent i=new Intent(this, SignUpActivity.class);
        startActivity(i);
    }
}
