package com.example.extstudent.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String firstName = "";
    private String lastName = "";

    private TextView firstNameTextView = null;
    private TextView lastNameTextView = null;
    private Button submitButton = null;

    private TextView resultTextView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set set variables
        this.firstNameTextView = (TextView)findViewById(R.id.editTextFirstName);
        this.lastNameTextView = (TextView)findViewById(R.id.editTextLastName);
        this.resultTextView = (TextView)findViewById(R.id.resultTextView);

        this.submitButton = (Button)findViewById(R.id.submitButton);
        this.submitButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setUserInfo();
                showResults();
                Log.d("First Name:", firstName);
                Log.d("Last Name:", lastName);

            }
        } );

    }

    private void setUserInfo(){
        this.firstName = this.firstNameTextView.getText().toString();
        this.lastName = this.lastNameTextView.getText().toString();
    }

    private void showResults(){
        String resultSTR = "Hi, nice to meet you " + firstName + " " + lastName;

        this.resultTextView.setText(resultSTR);
    }
}
