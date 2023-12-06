package com.cashcue.di

import android.content.Context
import com.cashcue.data.local.pref.user.UserPreference
import com.cashcue.data.local.pref.user.UserRepository
import com.cashcue.data.local.pref.user.dataStore

object Injection {

    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return UserRepository.getInstance(pref)
    }

}