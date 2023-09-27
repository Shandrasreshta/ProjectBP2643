package com.example.projectbp2643

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        //intent explicit
        //instance
        val btnLogin:Button = findViewById(R.id.button_login)
        val txtusername:EditText = findViewById(R.id.textusername)
        val txtpasswoord:EditText = findViewById(R.id.textpasswoord)

        //event btn Login click
        btnLogin.setOnClickListener {
            //validate
            if(txtusername.text.toString().equals("sreshta")&&
                        txtpasswoord.text.toString().equals("uii")){
                //call home activity
                val intentHome = Intent(this,HomeActivity::class.java)
                startActivity(intentHome)
            }else{
                Toast.makeText(this,"Usename/Passwoord salah!!!", Toast.LENGTH_SHORT).show()
            }
        }


    }
}