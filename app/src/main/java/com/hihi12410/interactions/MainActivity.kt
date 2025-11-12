package com.hihi12410.interactions

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var showToast : Button
    lateinit var showSnackBar : Button
    lateinit var layout : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        showToast = findViewById<Button>(R.id.button)
        showSnackBar = findViewById<Button>(R.id.worse)
        layout = findViewById<ConstraintLayout>(R.id.main)


        showSnackBar.setOnClickListener {
            Snackbar.make(layout, "I love halal food", Snackbar.LENGTH_SHORT)
                .setAction("Kill me", View.OnClickListener {

                }).show()
        }
        showToast.setOnClickListener {
            Toast.makeText(applicationContext, "I hate otp bank", Toast.LENGTH_SHORT).show()
        }

    }
}