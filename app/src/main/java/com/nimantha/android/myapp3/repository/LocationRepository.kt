package com.nimantha.android.myapp3.repository

import androidx.lifecycle.LiveData
import com.nimantha.android.myapp3.dao.LocationDao
import com.nimantha.android.myapp3.data.Location

class LocationRepository(private val locationDao: LocationDao) {

    val readAllData:LiveData<List<Location>> = locationDao.readAllData()

    suspend fun addLocation(location: Location){
        locationDao.addLocation(location)
    }
}