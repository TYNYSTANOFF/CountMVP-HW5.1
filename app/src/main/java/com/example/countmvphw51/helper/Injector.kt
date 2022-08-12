package com.example.countmvphw51.helper

import com.example.countmvphw51.model.CounterModel
import com.example.countmvphw51.presenter.Presenter

class Injector {

    companion object{
        fun getPresenter() : Presenter{
            return Presenter()
        }
        fun getModel(): CounterModel{
            return CounterModel()
        }
    }
}