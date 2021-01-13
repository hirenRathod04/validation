package com.royalsoftsolutions.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name,email,password,confirmpassword;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        name = findViewById ( R.id.edittext_name );
        email = findViewById ( R.id.edittext_email );
        password = findViewById ( R.id.edittext_password );
        confirmpassword = findViewById ( R.id.edittext_conmirmpassword );
        button = findViewById ( R.id.enter );

        button.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {



                String emaill = email.getText().toString().trim();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                String regexStr = "^[0-9]$";
                String number=password.getText().toString();

                /*if ( ! emaill.matches( emailPattern ) )
                {
                    Toast.makeText ( MainActivity.this, "Invalid email address", Toast.LENGTH_LONG ).show ( );
                    //or
                    *//*  textView.setText ( "invalid email" );*//*
                }*/
                /*else */ /*if(!  number.matches( regexStr ) )*/
               if( TextUtils.isEmpty ( number ))

                {
                    Toast.makeText ( MainActivity.this, " Please Enter Moblie number", Toast.LENGTH_SHORT ).show ( );
                    // am_checked=0;
                }

               else if(number.length()<10 || number.length()>10 /*|| !number.matches(regexStr)==false */ )
                    {
                        Toast.makeText ( MainActivity.this, "Invalid number", Toast.LENGTH_SHORT ).show ( );
                        // am_checked=0;
                    }
                    else
                    {
                        Toast.makeText ( MainActivity.this, " number", Toast.LENGTH_SHORT ).show ( );
                        // am_checked=0;
                    }

               /* {
                    Toast.makeText ( MainActivity.this, "email address register", Toast.LENGTH_LONG ).show ( );
                }*/

                /*email.addTextChangedListener(new TextWatcher () {
                    public void afterTextChanged(Editable s) {

                        if ( ! emaill.matches( emailPattern ) ) {
                            Toast.makeText ( getApplicationContext ( ), "Invalid email address", Toast.LENGTH_SHORT ).show ( );
                            //or
                          *//*  textView.setText ( "invalid email" );*//*
                        } else {
                            if ( s.length ( ) > 0 ) {
                                Toast.makeText ( getApplicationContext ( ), "valid email address", Toast.LENGTH_SHORT ).show ( );
                                // or
                               *//* textView.setText ( "valid email" );*//*
                            } else {
                                Toast.makeText ( getApplicationContext ( ), "Invalid email address", Toast.LENGTH_SHORT ).show ( );
                                //or
                             *//*   textView.setText ( "invalid email" );*//*
                            }
                        }
                    }
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                        // other stuffs
                    }
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        // other stuffs
                    }
                });*/


            }
        } );




    }
}