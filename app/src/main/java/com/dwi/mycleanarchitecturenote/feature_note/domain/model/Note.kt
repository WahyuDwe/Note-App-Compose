package com.dwi.mycleanarchitecturenote.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dwi.mycleanarchitecturenote.ui.theme.BabyBlue
import com.dwi.mycleanarchitecturenote.ui.theme.LightGreen
import com.dwi.mycleanarchitecturenote.ui.theme.RedOrange
import com.dwi.mycleanarchitecturenote.ui.theme.RedPink
import com.dwi.mycleanarchitecturenote.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(
            RedOrange,
            LightGreen,
            Violet,
            BabyBlue,
            RedPink,
        )
    }
}

class InvalidNoteException(message: String): Exception(message)
