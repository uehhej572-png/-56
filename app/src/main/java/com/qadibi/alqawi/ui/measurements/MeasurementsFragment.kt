package com.qadibi.alqawi.ui.measurements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.qadibi.alqawi.R
import com.qadibi.alqawi.databinding.FragmentMeasurementsBinding

class MeasurementsFragment : Fragment(R.layout.fragment_measurements) {
    private var _binding: FragmentMeasurementsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMeasurementsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
