package com.protonmail.jobforandroid.materialdesign.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.protonmail.jobforandroid.materialdesign.R
import com.protonmail.jobforandroid.materialdesign.databinding.FragmentSettingBinding


class SettingFragment : Fragment() {
    private var _binding : FragmentSettingBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = SettingFragment()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}