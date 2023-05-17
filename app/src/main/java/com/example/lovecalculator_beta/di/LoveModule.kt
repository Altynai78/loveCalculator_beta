package com.example.lovecalculator_beta.di

import android.content.Context
import com.example.lovecalculator_beta.DB.localDB.AppDatabase
import com.example.lovecalculator_beta.DB.remote.LoveApi


    @Module
    @InstallIn(SingletonComponent::class)
    class AppModule {

        @Provides
        fun provideApi(): LoveApi {
            return Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com/")
                .addConverterFactory(GsonConverterFactory.create()).build().create(LoveApi::class.java)
        }

        @Singleton
        @Provides
        fun providePref(@ApplicationContext context: Context): Pref {
            return Pref(context)
        }

        @Provides
        fun provideRoomDB(@ApplicationContext applicationContext: Context): AppDatabase {
            return Room.databaseBuilder(
                applicationContext,
                AppDatabase::class.java, "database-name"
            ).allowMainThreadQueries().build()
        }
    }
