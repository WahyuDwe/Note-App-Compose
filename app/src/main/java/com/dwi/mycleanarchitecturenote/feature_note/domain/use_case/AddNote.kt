package com.dwi.mycleanarchitecturenote.feature_note.domain.use_case

import com.dwi.mycleanarchitecturenote.feature_note.domain.model.InvalidNoteException
import com.dwi.mycleanarchitecturenote.feature_note.domain.model.Note
import com.dwi.mycleanarchitecturenote.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        when {
            note.title.isBlank() -> {
                throw InvalidNoteException("The title of the note can't be empty.")
            }

            note.content.isBlank() -> {
                throw InvalidNoteException("The content of the note can't be empty.")
            }

            else -> {
                repository.insertNote(note)
            }
        }
    }
}