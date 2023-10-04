package com.example.projectbp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.projectbp2643.FableFragment
import com.example.projectbp2643.FairyFragment
import com.example.projectbp2643.R
import com.example.projectbp2643.ScienceFragment

class BookKidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

        //instance
        val btnFairy:Button = findViewById(R.id.buttonFairy)
        val btnFable:Button = findViewById(R.id.buttonFable)
        val btnScience:Button = findViewById(R.id.buttonScience)

        //event button fairy
        btnFairy.setOnClickListener{
            replacefragment(FairyFragment())
        }
        //event button Fable
        btnFable.setOnClickListener{
            replacefragment(FableFragment())
        }
        //event button Fable
        btnScience.setOnClickListener{
            replacefragment(ScienceFragment())
        }

    }
    //create method replace fragment
    private fun  replacefragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }
}