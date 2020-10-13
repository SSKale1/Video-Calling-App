package com.example.videocallingapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.videocallingapp.R;



public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        findViewById(R.id.textSignUp).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), SignUpActivity.class)));
/*
        FirebaseFirestore database = FirebaseFirestore.getInstance();
        HashMap<String, Object> user = new HashMap<>();
        user.put("first_name", "John");
        user.put("last_name", "Doe");
        user.put("email", "johndoe@example.com");
        database.collection("users")
                .add(user)
                .addOnSuccessListener(documentReference -> Toast.makeText(SignInActivity.this, "User Inserted", Toast.LENGTH_SHORT).show())
                .addOnFailureListener(e -> Toast.makeText(SignInActivity.this, "Error Adding User", Toast.LENGTH_SHORT).show());

                */
    }
}