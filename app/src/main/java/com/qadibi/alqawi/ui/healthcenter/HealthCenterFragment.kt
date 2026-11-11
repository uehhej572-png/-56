package com.qadibi.alqawi.ui.healthcenter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.qadibi.alqawi.R
import com.qadibi.alqawi.databinding.FragmentHealthCenterBinding

class HealthCenterFragment : Fragment(R.layout.fragment_health_center) {
    private var _binding: FragmentHealthCenterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHealthCenterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
