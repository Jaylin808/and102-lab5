package com.codepath.campgrounds

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "campground_table")
data class CampgroundEntity(
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "description") val description: String?,
    @ColumnInfo(name = "latLong") val latLong: String?,
    @ColumnInfo(name = "imageUrl") val imageUrl: String
) {
    @PrimaryKey(autoGenerate = true) var id: Long = 0L
}