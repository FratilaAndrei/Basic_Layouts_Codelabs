package com.example.basiclayoutscodelabs.align_body_section

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiclayoutscodelabs.R
import com.example.basiclayoutscodelabs.ui.theme.Pink80
import com.example.basiclayoutscodelabs.ui.theme.Purple40

@Composable
fun BodyExercise(modifier: Modifier, name: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier.height(20.dp))
        Image(
            modifier = modifier.clip(CircleShape).background(Purple40),
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = null
        )
        Spacer(modifier.height(20.dp))
        Text(name)
    }
}

@Preview(showBackground = true)
@Composable
fun BodyPreview() {
    BodyExercise(Modifier, "Yoga")
}
