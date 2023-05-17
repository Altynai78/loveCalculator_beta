package com.example.lovecalculator_beta.DB.localDB

class DaoViewModelDaoViewModel {
    @Inject constructor(private val repository: Repository): ViewModel() {
        fun insertLove(love: Love) { repository.callDaoInsert(love) }

        fun updateLove(love: Love)  { repository.callDaoUpdate(love) }

        fun getAllLove(): List<Love> {
            return repository.callDaoGetAll()
        }
    }
}