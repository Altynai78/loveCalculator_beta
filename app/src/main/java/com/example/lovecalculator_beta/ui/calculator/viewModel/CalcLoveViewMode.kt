package com.example.lovecalculator_beta.ui.calculator.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lovecalculator_beta.DB.remote.LoveModel

@HiltViewModel
class CalcLoveViewModel @Inject constructor(private val repository: Repository): ViewModel() {

    fun liveLove(fName: String, sName: String): LiveData<LoveModel> {
        return repository.getLove(fName, sName)
    }
}