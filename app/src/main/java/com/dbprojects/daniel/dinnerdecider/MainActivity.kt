package com.dbprojects.daniel.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*




class MainActivity : AppCompatActivity() {



    val foodlist = arrayListOf("Chinese", "Burgers", "Pizza", "McDonalds")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decidebutton.setOnClickListener{
           val random = Random()
           val randomFood = random.nextInt(foodlist.count())
           selectedFoodText.text = foodlist[randomFood] // select ramdom food item from food list
        }

        addFoodButton.setOnClickListener {
            val newFood = addFoodText.text.toString()// take text from add foodtext button and convert to string
            if(newFood == ""){
                return@setOnClickListener
            } else {
                foodlist.add(newFood) // add new food to food list
                addFoodText.text.clear() // clear text field
                println(foodlist);
            }

        }

    }
}
