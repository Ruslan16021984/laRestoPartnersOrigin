package com.example.larestopartnersorigin.data.datastore

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore


private const val APP_DATASTORE = "app"

class AppDataStoreManager(val context: Application) : AppDataStore {
    private val Context.datastore: DataStore<Preferences> by preferencesDataStore(APP_DATASTORE)
    override suspend fun setValue(key: String, value: String) {
        context.datastore.edit {
            it[stringPreferencesKey(key)] = value
        }
    }


    override suspend fun readValue(key: String): String {
//        val flow = context.datastore.data
//        return context.datastore.data.first()[stringPreferencesKey(key)]
        return ""
    }

}