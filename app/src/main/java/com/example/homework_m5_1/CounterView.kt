package com.example.homework_m5_1


interface CounterView {

    fun showCounter(count : Int)
    fun upFont(fontSize: Float)
    fun setDecrementVisibilityBtn(visible: Int)
    fun showCongratulationToast(toast: String)
    fun changeTextColor(color: Int)
}