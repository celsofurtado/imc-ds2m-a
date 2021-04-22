package br.senai.sp.jandira.imcapp20_a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_imc.setOnClickListener {

            val abrirImc = Intent(this, ImcActivity::class.java)
            startActivity(abrirImc)

        }

    }
}