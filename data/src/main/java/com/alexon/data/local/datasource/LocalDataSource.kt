package com.alexon.data.local.datasource

import android.content.Context
import androidx.security.crypto.EncryptedFile
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.alexon.domain.entity.LoginResponse
import com.google.gson.Gson
import java.io.File
import javax.inject.Inject

class LocalDataSource @Inject constructor (context: Context) {

    // Create a master key using MasterKey.Builder
    private val masterKey = MasterKey.Builder(context)
        .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
        .build()

    // Use the master key to create EncryptedSharedPreferences
    private val sharedPreferences = EncryptedSharedPreferences.create(
        context,
        "MyEncryptedPrefs",
        masterKey,
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
    )
    private val gson  : Gson = Gson()

    fun saveUser( user : LoginResponse ) {
        val json = gson.toJson(user)
        sharedPreferences.edit().putString("user", json).apply()
    }

    fun getUser(): LoginResponse? {
        val json = sharedPreferences.getString("user", null )
        return gson.fromJson( json, LoginResponse::class.java )
    }

    fun clearUserData() =   sharedPreferences.edit().remove("user").apply()
    fun clearAllData()  =   sharedPreferences.edit().clear().apply()


    // Use the master key to create EncryptedFile
    val encryptedFile = EncryptedFile.Builder(
        context,
        File("path/to/encrypted/file"),
        masterKey,
        EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB
    ).build()

}
