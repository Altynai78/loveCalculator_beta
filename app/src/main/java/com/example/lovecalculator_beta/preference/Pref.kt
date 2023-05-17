package com.example.lovecalculator_beta.preference

import android.content.Context

class Pref (context: Context) {
    private var pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    fun isUserSeen(): Boolean {
        return pref!!.getBoolean(BOOLEAN_KEY, false)
    }

    fun saveSeen() {
        pref.edit().putBoolean(BOOLEAN_KEY, true).apply()
    }

    companion object{
        const val PREF_NAME="Салю"
        const val BOOLEAN_KEY="ключ"
    }
}

