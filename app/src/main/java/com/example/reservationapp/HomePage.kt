package com.example.reservationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val jackgrill:TextView = findViewById(R.id.jack_grill)
        jackgrill.setOnClickListener{
            startActivity(Intent(this,JackTablePage::class.java))
        }
        val tratoria:TextView = findViewById(R.id.tratoria)
        tratoria.setOnClickListener{
            startActivity(Intent(this,TratoriaTablePage::class.java))
        }
        val furusatojapanese:TextView = findViewById(R.id.furusatojapanese)
        furusatojapanese.setOnClickListener{
            startActivity(Intent(this,FurusatoTablePage::class.java))
        }
        val ankole:TextView = findViewById(R.id.ankolegrill)
        ankole.setOnClickListener{
            startActivity(Intent(this,AnkoleTablePage::class.java))
        }
        val tatu:TextView = findViewById(R.id.taturestaurant)
        tatu.setOnClickListener{
            startActivity(Intent(this,TatuTablePage::class.java))
        }
        val mawimbi:TextView = findViewById(R.id.mawimbiseafood)
        mawimbi.setOnClickListener{
            startActivity(Intent(this,MawimbiTablePage::class.java))
        }
        val maghreb:TextView = findViewById(R.id.cafemaghreb)
        maghreb.setOnClickListener{
            startActivity(Intent(this,MaghrebTablePage::class.java))
        }
        val haandi:TextView = findViewById(R.id.haandi)
        haandi.setOnClickListener{
            startActivity(Intent(this,HaandiTablePage::class.java))
        }
        val thai:TextView = findViewById(R.id.thaichi)
        thai.setOnClickListener{
            startActivity(Intent(this,ThaiChiTablePage::class.java))
        }
        val mercado:TextView = findViewById(R.id.mercado)
        mercado.setOnClickListener{
            startActivity(Intent(this,MercadoTablePage::class.java))
        }

    }

}
