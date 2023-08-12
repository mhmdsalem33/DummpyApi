package com.alexon.dummpyapi.presentation.ui.main_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.alexon.domain.entity.LoginRequest
import com.alexon.domain.entity.LoginResponse
import com.alexon.dummpyapi.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val mainMvvm : MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        mainMvvm.getDummyProducts()
        mainMvvm.login(LoginRequest("kminchelle" , "0lelplR"))


        mainMvvm.saveUser(LoginResponse( username = "mhmd" , id = 1  ))
        Log.d("testApp" , mainMvvm.getUser()?.username ?: "empty")

    }
}