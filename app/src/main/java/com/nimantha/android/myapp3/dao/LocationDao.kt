package com.nimantha.android.myapp3.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.nimantha.android.myapp3.data.Location

@Dao
interface LocationDao {

    @Insert( onConflict = OnConflictStrategy.IGNORE)
    suspend fun addLocation(location: Location)

    @Query("SELECT * FROM lacations ORDER BY id ASC")
    fun readAllData():LiveData<List<Location>>


}