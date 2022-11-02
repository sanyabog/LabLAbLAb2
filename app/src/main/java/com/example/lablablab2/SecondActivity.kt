package com.example.lablablab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lablablab2.databinding.ActivitySecondBinding
import net.objecthunter.exp4j.ExpressionBuilder

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val result = intent.extras?.getString("RESULT")
        try {
            binding.resultTextView.text = ExpressionBuilder(result).build().evaluate().toString()
        } catch (e: Exception) {
            binding.resultTextView.text = "Неможливо порахувати!"
        }


    }
}