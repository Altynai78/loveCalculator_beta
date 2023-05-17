package com.example.lovecalculator_beta.model

@Entity
                data class Love (
@PrimaryKey(autoGenerate = true)
var id: Int? = null,
var firstName: String?= null,
var secondName: String?= null,
var percentage: String?= null
): java.io.Serializable
