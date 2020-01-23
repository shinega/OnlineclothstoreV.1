package com.example.onlineclothstorev1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void onClickRegister(View v) {

        EditText username = (EditText) findViewById(R.id.usernameReg);
        EditText email = (EditText) findViewById(R.id.emailReg);
        EditText pass1 = (EditText) findViewById(R.id.passReg);
        EditText pass2 = (EditText) findViewById(R.id.conPass);

        String uname = username.getText().toString();
        String e_mail = email.getText().toString();
        String pw1 = pass1.getText().toString();
        String pw2 = pass2.getText().toString();

        if (pw1.equals(pw2)) {
            User user = new User(uname, e_mail, pw1);
//            user.save();
            Intent intent = new Intent(Register.this, MainActivity.class);
            Register.this.startActivity(intent);
            finish();

        } else {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setMessage("Check the inputs");
            alert.setTitle("Error");
            alert.setPositiveButton("OK", null);
            alert.setCancelable(true);
            alert.create().show();

        }

    }
}

