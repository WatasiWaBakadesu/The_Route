package com.example.theroute;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
    EditText username,email,password;
    TextView message,messagess;
    Button registerbutton;
    ProgressDialog dialog;
    private FirebaseAuth auth;
    private FirebaseDatabase dat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username=findViewById(R.id.username);
        email=findViewById(R.id.textEmail);
        password=findViewById(R.id.password);
        message=findViewById(R.id.messages);
        messagess=findViewById(R.id.messagess);
        registerbutton =findViewById(R.id.regiserbutton);
        auth=FirebaseAuth.getInstance();
        dat=FirebaseDatabase.getInstance();
        dialog =new ProgressDialog(this);
        dialog.setTitle("Authentication");
        dialog.setMessage("Creating User...");
        dialog.setCancelable(false);
        registerbutton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String emailCheck=email.getText().toString();
                String userCheck=username.getText().toString();
                String passwordCheck=password.getText().toString();
                if(emailCheck.isEmpty()||userCheck.isEmpty()||passwordCheck.isEmpty())
                {
                    message.setText("Fields cannot be Empty");
                    message.setTextColor(Color.RED);
                }
                else{
                    dialog.show();
                    createUser(emailCheck,passwordCheck);
                    messagess.setText("We welcome you to Our family\n"+userCheck+"\n Proceed to LogIn?");
                    messagess.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent(RegisterActivity.this,LogInActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }

            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this,LogInActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void createUser(String $email,String $password){
        auth.createUserWithEmailAndPassword($email, $password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    dialog.dismiss();
                    String id=task.getResult().getUser().getUid(); //from firebase we had taken users id.
                    UserModel user=new UserModel(username.getText().toString(),password.getText().toString(),email.getText().toString());
                    dat.getReference().child("Users").child(id).setValue(user);//created a child Users in database.

                } else {
                    dialog.dismiss();
                    Toast.makeText(RegisterActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}