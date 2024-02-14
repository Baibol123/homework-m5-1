package com.example.homework_m5_1

class Injector {
    companion object{
        fun getPresenter() = Presenter()
        fun getModel() = CounterModel()
    }
}