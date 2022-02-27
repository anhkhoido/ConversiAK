package com.anhkhoido.conversiak.ui.usdclosing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.anhkhoido.conversiak.databinding.FragmentUsdclosingBinding

class UsdClosingFragment : Fragment() {

    private lateinit var usdClosingViewModel: UsdClosingViewModel
    private var _binding: FragmentUsdclosingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        usdClosingViewModel =
            ViewModelProvider(this).get(UsdClosingViewModel::class.java)

        _binding = FragmentUsdclosingBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        usdClosingViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}