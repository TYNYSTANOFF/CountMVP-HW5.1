package com.example.countmvphw51.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.countmvphw51.databinding.ActivityMainBinding
import com.example.countmvphw51.helper.Injector
import com.example.countmvphw51.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {

    lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()

    }

    private fun initClicker() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.increment()
            }
            decrementBtn.setOnClickListener {
                presenter.decrement()
            }
        }

    }

    override fun updateText(count: Int) {
        binding.countTV.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляем!", Toast.LENGTH_SHORT).show()
    }

    override fun changeColor() {
        binding.countTV.setTextColor(Color.BLUE)
    }
}