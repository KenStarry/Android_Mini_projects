package com.example.circularcheckbox.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
class Notes(

    @ColumnInfo(name = "note_title") val noteTitle: String?,
    @ColumnInfo(name = "note_description") val noteDescription: String?,
    @ColumnInfo(name = "note_checked") val noteChecked: Boolean

) {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
        get() = field
        set(value) {
            field = value
        }
}