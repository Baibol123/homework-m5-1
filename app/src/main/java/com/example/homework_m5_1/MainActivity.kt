package com.example.homework_m5_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homework_m5_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    private var presenter = Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClick()
        presenter.initView(this)
    }

    private fun initClick(){
        with(binding){
            buttonInc.setOnClickListener{
                presenter.inc()
            }
            buttonDec.setOnClickListener{
                presenter.dec()
            }
        }
    }

    override fun showCounter(count: Int) {
        binding.result.text = count.toString()
    }

    override fun upFont(fontSize: Float) {
        binding.result.textSize = fontSize
    }

    override fun setDecrementVisibilityBtn(visible: Int) {
        binding.buttonDec.visibility = visible
    }

    override fun showCongratulationToast(toast: String) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColor(color: Int) {
        binding.result.setTextColor(Color.GREEN)
    }


}