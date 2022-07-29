package me.dio.businesscard

import android.app.Application
import me.dio.businesscard.data.AppDataBase
import me.dio.businesscard.data.BusinessCardRepository

class App : Application(){
    private val database by lazy{AppDataBase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}