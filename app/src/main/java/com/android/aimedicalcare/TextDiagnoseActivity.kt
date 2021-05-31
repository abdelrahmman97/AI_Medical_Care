package com.android.aimedicalcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TextDiagnoseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_diagnose)

        val cnclBtn = findViewById<View>(R.id.cancel_diagnose)
        val doneBtn = findViewById<View>(R.id.done_diagnose)

        cnclBtn.setOnClickListener {
            onBackPressed()
        }

        doneBtn.setOnClickListener {
            val intent = Intent(this, DiagnoseResultActivity::class.java)
            startActivity(intent)
        }
    }
}