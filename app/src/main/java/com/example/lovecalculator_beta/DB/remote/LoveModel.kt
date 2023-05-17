package com.example.lovecalculator_beta.DB.remote

data class LoveModel(
@SerializedName("fname")
var firstName: String,
@SerializedName("sname")
var secondName: String,
var percentage: String,
var result: String?= null
)
