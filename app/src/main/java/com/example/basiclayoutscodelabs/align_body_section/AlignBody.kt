package com.example.basiclayoutscodelabs.align_body_section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AlignBody(exercises: List<String>) {

    Column {
        Text("Align your Body")
        LazyRow {
            items(exercises){
                exercise -> BodyExercise(modifier= Modifier, exercise)
            }
        }
    }
}
