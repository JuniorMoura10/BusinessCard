package com.moura.junior.businesscard

import android.app.Application
import com.moura.junior.businesscard.data.AppDatabase
import com.moura.junior.businesscard.data.BusinessCardRepository

class App: Application() {

    val database by lazy{AppDatabase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}