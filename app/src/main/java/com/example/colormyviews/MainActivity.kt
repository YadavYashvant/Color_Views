package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setlisteners()
    }

     private fun setlisteners(){
         val box_one_text = findViewById<TextView>(R.id.box_one_text)
         val box_two_text = findViewById<TextView>(R.id.box_two_text)
         val box_three_text = findViewById<TextView>(R.id.box_three_text)
         val box_four_text = findViewById<TextView>(R.id.box_four_text)
         val box_five_text = findViewById<TextView>(R.id.box_five_text)
         val constraint_layout = findViewById<ConstraintLayout>(R.id.constraint_layout)
        val clickableViews: List<View> = listOf(box_one_text, box_two_text, box_three_text,
            box_four_text, box_five_text, constraint_layout)

        for(item in clickableViews) {
            item.setOnClickListener{makeColoured(it)}
        }
    }

    private
    fun makeColoured(view: View) {
        when (view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)

        }
    }
}