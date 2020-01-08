package com.odgage.delos.presentation.main.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.odgage.delos.R
import com.odgage.delos.databinding.FragmentAlertBinding
import com.odgage.delos.presentation.base.BaseFragment

class AlertFragment : BaseFragment<FragmentAlertBinding>(){
    override val resourceId: Int = R.layout.fragment_alert

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}