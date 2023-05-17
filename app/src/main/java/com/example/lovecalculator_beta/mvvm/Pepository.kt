package com.example.lovecalculator_beta.mvvm

import android.content.pm.LauncherApps
import android.telecom.Call
import androidx.lifecycle.MutableLiveData
import com.android.volley.Response
import com.example.lovecalculator_beta.DB.localDB.AppDatabase
import com.example.lovecalculator_beta.DB.remote.LoveApi
import com.example.lovecalculator_beta.DB.remote.LoveModel
import com.example.lovecalculator_beta.model.Love

class Pepository {
    @Inject constructor(private val api: LoveApi, private val dao: AppDatabase) {
        fun getLove(fName:String, sName:String): MutableLiveData<LoveModel> {
            val liveLove = MutableLiveData<LoveModel>()

            api.percentageName(fName, sName).enqueue(object : LauncherApps.Callback<LoveModel> {
                override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                    if(response.isSuccessful){
                        liveLove.postValue(response.body())
                    }
                }
                override fun onFailure(call: Call<LoveModel>, t: Throwable) {

                }
            })
            return liveLove
        }

        fun callDaoInsert(love: Love) {
            dao.loveDao().insert(love)
        }
        fun callDaoGetAll(): List<Love> {
            return dao.loveDao().getAll()
        }
        fun callDaoUpdate(love: Love) {
            dao.loveDao().update(love)
        }
    }
}