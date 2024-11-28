package com.example.basiclayoutscodelabs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiclayoutscodelabs.align_body_section.AlignBody
import com.example.basiclayoutscodelabs.favorite_collections.FavoriteCollections
import com.example.basiclayoutscodelabs.ui.theme.BasicLayoutsCodelabsTheme
import com.example.basiclayoutscodelabs.ui.theme.background_light_gray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicLayoutsCodelabsTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(background_light_gray)
    ) {
        Column(
            modifier
                .padding(20.dp)
                .weight(1f)
        )
        {
            SearchBar()
            Spacer(modifier.height(30.dp))
            AlignBody(listOf("Yoga", "Box", "Yoga2", "Cardio", "Swimming", "Whatever"))
            Spacer(modifier.height(30.dp))
            FavoriteCollections(
                modifier,
                listOf(
                    "Short mantras",
                    "Nature meditations",
                    "Yoga2",
                    "Cardio",
                    "Swimming",
                    "Whatever"
                )
            )
        }
        BottomNavigation(modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicLayoutsCodelabsTheme {
        HomeScreen()
    }
}