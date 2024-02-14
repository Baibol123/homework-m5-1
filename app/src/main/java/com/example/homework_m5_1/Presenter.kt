package com.example.homework_m5_1

import android.graphics.Color
import android.view.View

class Presenter {
    private var model = Injector.getModel()
    private lateinit var view: CounterView

    fun inc(){
        model.increment()
        view.showCounter(model.count)
        setTextSizeByCondition()
        setDecrementVisibilityBtn()
        showCongratulationToast()
        changeTextColor()
    }
    fun dec(){
        model.decrement()
        view.showCounter(model.count)
        setTextSizeByCondition()
        setDecrementVisibilityBtn()
        showCongratulationToast()
        changeTextColor()
    }

    private fun setTextSizeByCondition(){
        if (model.count == 5){
            view.upFont(100f)
        }else{
            view.upFont(40f)
        }
    }

    private fun setDecrementVisibilityBtn(){
        if (model.count %2 == 0){
            view.setDecrementVisibilityBtn(View.GONE)
        }else{
            view.setDecrementVisibilityBtn(View.VISIBLE)
        }
    }
    private fun showCongratulationToast(){
        if (model.count == 10) {
            view.showCongratulationToast("Поздравляем!")
        }
    }
    private fun changeTextColor(){
        if (model.count == 15) {
            view.changeTextColor(Color.GREEN)
        }
    }
    fun initView(view: CounterView){
        this.view = view
    }
}