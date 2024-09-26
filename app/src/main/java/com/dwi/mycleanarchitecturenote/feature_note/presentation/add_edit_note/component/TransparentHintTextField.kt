package com.dwi.mycleanarchitecturenote.feature_note.presentation.add_edit_note.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Composable
fun TransparentHintTextField(
    modifier: Modifier = Modifier,
    text: String,
    hint: String,
    isHintVisible: Boolean = true,
    textStyle: TextStyle = TextStyle(),
    isSingleLine: Boolean = false,
    onValueChange: (String) -> Unit,
    onFocusChange: (FocusState) -> Unit
) {
    Box(
        modifier = modifier
    ) {
        BasicTextField(
            modifier = modifier
                .fillMaxWidth()
                .onFocusChanged {
                    onFocusChange(it)
                },
            value = text,
            onValueChange = onValueChange,
            textStyle = textStyle,
            singleLine = isSingleLine,
        )

        if (isHintVisible) {
            Text(
                text = hint,
                style = textStyle,
                color = Color.DarkGray,
            )
        }
    }
}