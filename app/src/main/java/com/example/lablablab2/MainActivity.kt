package com.example.lablablab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lablablab2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var result = ""

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.plusButton.setOnClickListener {
            if (binding.editText.text.isNotEmpty()) {
                val sign = "+"
                val number = binding.editText.text.toString().toFloat()
                result += "$number$sign"
                binding.resultTextView.text = "${binding.resultTextView.text} $number $sign"
            } else {
                Toast.makeText(this@MainActivity, "Напишіть число!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.minusButton.setOnClickListener {
            if (binding.editText.text.isNotEmpty()) {
                val sign = "-"
                val number = binding.editText.text.toString().toFloat()
                result += "$number$sign"
                binding.resultTextView.text = "${binding.resultTextView.text} $number $sign"
            } else {
                Toast.makeText(this@MainActivity, "Напишіть число!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.multiplyButton.setOnClickListener {
            if (binding.editText.text.isNotEmpty()) {
                val sign = "*"
                val number = binding.editText.text.toString().toFloat()
                result += "$number$sign"
                binding.resultTextView.text = "${binding.resultTextView.text} $number $sign"
            } else {
                Toast.makeText(this@MainActivity, "Напишіть число!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.divideButton.setOnClickListener {
            if (binding.editText.text.isNotEmpty()) {
                val sign = "-"
                val number = binding.editText.text.toString().toFloat()
                result += "$number$sign"
                binding.resultTextView.text = "${binding.resultTextView.text} $number $sign"
            } else {
                Toast.makeText(this@MainActivity, "Напишіть число!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.clearButton.setOnClickListener {
            result = ""
            binding.resultTextView.text = ""
        }

        binding.calculateButton.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)

            if (binding.editText.text.isNotEmpty()) {
                val lastNumber = binding.editText.text.toString().toFloat()

                result += "$lastNumber"

                intent.putExtra("RESULT", result)
                startActivity(intent)
            } else {
                Toast.makeText(this@MainActivity, "Напишіть останнє число!", Toast.LENGTH_SHORT).show()
            }
        }

    }

}