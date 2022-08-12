package com.example.countmvphw51.presenter

import com.example.countmvphw51.helper.Injector
import com.example.countmvphw51.view.CounterView

class Presenter {

    private val model = Injector.getModel()

    lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.updateText(model.count)
        when (model.count) {
            10 -> view.showToast()
            15 -> view.changeColor()
        }
    }

        fun decrement() {
            model.decrement()
            view.updateText(model.count)
        }

        fun attachView(view: CounterView) {
            this.view = view
        }
    }
