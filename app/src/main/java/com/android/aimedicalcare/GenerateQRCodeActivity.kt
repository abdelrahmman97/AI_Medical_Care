package com.android.aimedicalcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.NavDeepLinkBuilder
import com.android.aimedicalcare.ui.patient.PatientFragment

class GenerateQRCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generate_qrcode)

        val cancelGenerate = findViewById<View>(R.id.cancel_generate) as Button

        cancelGenerate.setOnClickListener {
            onBackPressed()
        }

//        val actionbar = supportActionBar
//        actionbar!!.title = "QR Code"
//
//        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}