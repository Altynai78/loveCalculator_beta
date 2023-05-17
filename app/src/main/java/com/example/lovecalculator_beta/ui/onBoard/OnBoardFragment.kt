package com.example.lovecalculator_beta.ui.onBoard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lovecalculator_beta.R
import com.example.lovecalculator_beta.ui.onBoard.adapter.OnBoardAdapter
import com.example.lovecalculator_beta.preference.Pref

@AndroidEntryPoint
@WithFragmentBindings
class OnBoardFragment : Fragment() {
    @Inject
    lateinit var prefH: Pref
    private lateinit var binding: FragmentOnBoardBinding
    private val adapter = OnBoardAdapter(this::onStartClick)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewPager.adapter = adapter
    }

    private fun onStartClick() {
        prefH.saveSeen()
        findNavController().navigate(R.id.calculatorFragment)
    }
}