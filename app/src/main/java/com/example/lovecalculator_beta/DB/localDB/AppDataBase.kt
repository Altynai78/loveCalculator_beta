package com.example.lovecalculator_beta.DB.localDB


@Database(entities = [Love::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun loveDao(): LoveDao
}