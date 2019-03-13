package com.example.a16670016

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val putarButton: Button=findViewById(R.id.btn_putar)
        putarButton.setOnClickListener {
            kocokDadu()
        }
        diceImage=findViewById(R.id.dice_image)
    }

    private fun kocokDadu() {
        val randomInt=Random.nextInt(6)+1
        val drawableResource=when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        dice_image.setImageResource(drawableResource)
    }
}
