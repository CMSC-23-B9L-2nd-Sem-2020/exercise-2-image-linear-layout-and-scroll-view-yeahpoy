package com.example.exer2_lorente_b9l

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var pokemonImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomButton: Button = findViewById(R.id.random_button)
        randomButton.setOnClickListener { randomizeImage() }
        pokemonImageView = findViewById(R.id.pokemon)

        val retryButton: Button = findViewById(R.id.retry_button)
        retryButton.setOnClickListener{ reset()}
    }

    private fun randomizeImage() {
        val randomInt: Int = (1..10).random()

        val pokemonImage: ImageView = findViewById(R.id.pokemon)

        var drawableResource = when (randomInt) {
            1 -> R.drawable.bulbasaur
            2 -> R.drawable.charmander
            3 -> R.drawable.squirtle
            4 -> R.drawable.cyndaquil
            5 -> R.drawable.chikorita
            6 -> R.drawable.totodile
            7 -> R.drawable.treecko
            8 -> R.drawable.pipplup
            9 -> R.drawable.popplio
            10 -> R.drawable.torchic
            else -> R.drawable.pokeball
        }

        val pokemonString: TextView = findViewById(R.id.des)

        var stringResource = when (randomInt) {
            1 -> R.string.bulbasaur_des
            2 -> R.string.charmander_des
            3 -> R.string.squirtle_des
            4 -> R.string.cyndaquil_des
            5 -> R.string.chikorita_des
            6 -> R.string.totodile_des
            7 -> R.string.treecko_des
            8 -> R.string.piplup_des
            9 -> R.string.popplio_des
            10 -> R.string.torchic_des
            else -> R.string.none
        }

        pokemonImage.setImageResource(drawableResource)
        pokemonString.setText(stringResource)

    }

    private fun reset() {
        val resetImage: ImageView = findViewById(R.id.pokemon)
        val resetString: TextView = findViewById(R.id.des)

        var imageResource = R.drawable.pokeball
        var stringResource = R.string.none

        resetString.setText(stringResource)
        resetImage.setImageResource(imageResource)


    }


}
