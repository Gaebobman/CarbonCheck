package kr.co.carboncheck.android.carboncheckapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.co.carboncheck.android.carboncheckapp.R
import kr.co.carboncheck.android.carboncheckapp.databinding.FragmentDetailedUsageBinding
import kr.co.carboncheck.android.carboncheckapp.databinding.FragmentTotalUsageBinding

class TotalUsageFragment : Fragment() {
    private var _binding: FragmentTotalUsageBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTotalUsageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}