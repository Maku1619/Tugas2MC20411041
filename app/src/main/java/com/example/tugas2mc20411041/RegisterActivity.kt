package com.example.tugas2mc20411041

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_16)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
            // Setelah proses pendaftaran selesai

        }
    }

    private fun moveToMainActivity() {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish() // Opsional: Jika Anda ingin menutup RegisterActivity setelah memindahkan pengguna

        var button:Button = findViewById(R.id.buttonRegister)


    }

}



