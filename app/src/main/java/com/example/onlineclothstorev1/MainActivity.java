package com.example.onlineclothstorev1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLogin(View v){


//        EditText username=(EditText)findViewById(R.id.Username);
//        EditText password=(EditText)findViewById(R.id.password);
//
//        String uname=username.getText().toString();
//        String pw1=password.getText().toString();
//
//        List<User> userList= User.ListAll(User.class);
//        boolean flag=false;
//
//        for(User u : userList) {
//            if (u.getUsername().equals(uname) && u.password.equals(pw1)) {
//                flag = true;
//                SharedPreferences.Editor edit = getSharedPreferences("userdetails", MODE_PRIVATE).edit();
//                edit.putString("uname", u.getUsername());
//                edit.commit();
//                Intent intent = new Intent(MainActivity.this, Navigationbar.class);
//                MainActivity.this.startActivity(intent);
//                finish();
//
//            }
//        }
//
//        if(flag==false){
//            AlertDialog.Builder alert= new AlertDialog.Builder(this);
//            alert.setMessage("Check the inputs");
//            alert.setTitle("Error");
//            alert.setPositiveButton("OK",null);
//            alert.setCancelable(true);
//            alert.create().show();
//
//            username.setText("");
//            password.setText("");
//        }
//
//    }
//    public void onClickRegister(View v){
//        Intent intent = new Intent(MainActivity.this,Register.class);
//        MainActivity.this.startActivity(intent);
//        finish();
//    }
}
