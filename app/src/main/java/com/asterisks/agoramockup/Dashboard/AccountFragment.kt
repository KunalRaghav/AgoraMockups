package com.asterisks.agoramockup.Dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.asterisks.agoramockup.R
import com.asterisks.agoramockup.databinding.FragmentAccountBinding

class AccountFragment : Fragment(){

    private lateinit var accountBinding: FragmentAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        accountBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_account, container, false)
        return accountBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}