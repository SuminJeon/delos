package com.odgage.delos.presentation.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<T: ViewDataBinding> : AppCompatActivity(){

    abstract val resourceId:Int

    abstract val statusBarColor:Int

    protected val binding: T by lazy{ DataBindingUtil.setContentView<T>(this, resourceId)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = statusBarColor
        binding
    }
}