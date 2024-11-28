package com.example.basiclayoutscodelabs.align_body_section

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.basiclayoutscodelabs.R

@Composable
fun BodyExercise(modifier: Modifier, name:String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = null
        )
        Text(name)
    }
}

@Preview(showBackground = true)
@Composable
fun BodyPreview() {
    BodyExercise(Modifier,"Yoga")
}
