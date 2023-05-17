package com.example.lovecalculator_beta.DB.localDB

@Dao
interface LoveDao {

    @Insert
    fun insert(love: Love)

    @Query("SELECT * FROM Love ORDER BY firstName ASC")
    fun getAll(): List<Love>

    @Update
    fun update(love: Love)
}