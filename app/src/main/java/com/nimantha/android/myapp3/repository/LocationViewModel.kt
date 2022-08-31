package com.nimantha.android.myapp3.repository

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.nimantha.android.myapp3.data.Location
import com.nimantha.android.myapp3.database.LocationDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class LocationViewModel(application: Application) : AndroidViewModel(application) {

    private val readAllData: LiveData<List<Location>>
    private val repository : LocationRepository

    init {
        val locationDao  = LocationDatabase.getDatabase(application).locationDao()
        repository = LocationRepository(locationDao)
        readAllData = repository.readAllData
    }

    fun addLocation(location:Location){
         viewModelScope.launch(Dispatchers.IO) {
             repository.addLocation(location)


         }

        }
    }

