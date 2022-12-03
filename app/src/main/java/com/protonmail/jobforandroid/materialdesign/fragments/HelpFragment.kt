package com.protonmail.jobforandroid.materialdesign.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.protonmail.jobforandroid.materialdesign.R
import com.protonmail.jobforandroid.materialdesign.databinding.FragmentHelpBinding

class HelpFragment : Fragment() {
    private var _binding : FragmentHelpBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_help, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = HelpFragment()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}