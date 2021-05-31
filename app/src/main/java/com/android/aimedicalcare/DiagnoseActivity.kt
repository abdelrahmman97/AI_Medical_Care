package com.android.aimedicalcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DiagnoseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnose)

        val btnDone = findViewById<View>(R.id.done_diagnose_btn) as Button
        val btnCncl = findViewById<View>(R.id.cancel_diagnose_btn) as Button

        btnCncl.setOnClickListener {
            onBackPressed()
        }

        btnDone.setOnClickListener {
            val intent = Intent(this, DiagnoseResultActivity::class.java)
            startActivity(intent)
        }
    }
}