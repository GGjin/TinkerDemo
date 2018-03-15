package com.gg.tinkerdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView2.setOnClickListener {
            Toast.makeText(this, BugClass.bug(), Toast.LENGTH_SHORT).show()
        }
    }
}
