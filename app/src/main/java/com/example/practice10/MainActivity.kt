package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.practice10.R

class MainActivity : AppCompatActivity() {

    private var currentLayout: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener {
            button1.visibility = View.INVISIBLE
            button2.visibility = View.VISIBLE
        }

        button2.setOnClickListener {
            button2.visibility = View.INVISIBLE
            button1.visibility = View.VISIBLE
        }


        switchToLinearLayout()
    }

    private fun switchToLinearLayout() {
        setContentView(R.layout.linear_layout)

        val buttonOrient = findViewById<Button>(R.id.buttonOrient)
        val buttonGravity = findViewById<Button>(R.id.buttonGravity)

        buttonOrient.setOnClickListener {
            Toast.makeText(this, "Горизонтальная", Toast.LENGTH_SHORT).show()

        }

        buttonGravity.setOnClickListener {
            Toast.makeText(this, "По центру", Toast.LENGTH_SHORT).show()

        }


        switchToTableLayout()
    }

    private fun switchToTableLayout() {
        setContentView(R.layout.table_layout)


        for (i in 1..8) {
            val buttonId = resources.getIdentifier("button$i", "id", packageName)
            val button = findViewById<Button>(buttonId)

            button.setOnClickListener {
                Toast.makeText(this, "Нажата кнопка $i", Toast.LENGTH_SHORT).show()
            }
        }
    }
}