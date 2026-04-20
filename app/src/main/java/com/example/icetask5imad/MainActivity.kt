package com.example.icetask5imad

import android.icu.util.Output
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView


fun average(numbers: Array<Int>): Double { // the double makes decimals possible I think

    var sum = 0

    for (num in numbers) { sum += num
    }

    return sum.toDouble() / numbers.size  //the total amount is divided by how big the array is

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) // sets content view to main activity

        val startButton = findViewById<Button>(R.id.button)
        val outputText = findViewById<TextView>(R.id.textView)
        // connecting buttons to respective views

        val marks = arrayOf(78,45,62,90,33,55,81,40,67,29)



        startButton.setOnClickListener {

            var text = "MARKS:\n"
            var pass = 0
            var fail = 0
            val averageMarks = average(marks) //calls the average function
            val highestMark = marks.max() //finds highest number of array
            val lowestMark = marks.min() // finds min number of array

            for (mark in marks ) { // for every number in the array this will happen

                text += "$mark"+", " // displays each mark by themselves

                if (mark >= 50){ pass = pass + 1 }
                else { fail = fail + 1}


            }

            text += "\n Passed= $pass. Failed=$fail.\n Highest mark = $highestMark. Lowest mark = $lowestMark \n Average = $averageMarks"


            outputText.text = text
        }



    }
}