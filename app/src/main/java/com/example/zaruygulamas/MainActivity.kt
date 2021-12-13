package com.example.zaruygulamas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"Başlamak için butona basınız...",Toast.LENGTH_SHORT).show()
        var button : Button=findViewById(R.id.button)
            fun DiceRoll()
            {
                var myDice = Dice(6)
                myDice.roll()
                var diceRoll=myDice.roll()
                var textView:TextView=findViewById(R.id.textView)
                Toast.makeText(this,"Zar Atıldı",Toast.LENGTH_SHORT).show()
                textView.text=diceRoll.toString()
                var imageView:ImageView=findViewById(R.id.imageView)
                if(diceRoll==1)
                {imageView.setImageResource(R.drawable.dice_1)}
                if(diceRoll==2)
                {imageView.setImageResource(R.drawable.dice_2)}
                if(diceRoll==3)
                {imageView.setImageResource(R.drawable.dice_3)}
                if(diceRoll==4)
                {imageView.setImageResource(R.drawable.dice_4)}
                if(diceRoll==5)
                {imageView.setImageResource(R.drawable.dice_5)}
                if(diceRoll==6)
                {imageView.setImageResource(R.drawable.dice_6)}
            }

        button.setOnClickListener(){DiceRoll()}
    }
}
class Dice (var Numsides :Int)
{
    fun roll():Int
    {
        return (1..Numsides).random()
    }
}