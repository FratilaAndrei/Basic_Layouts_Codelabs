package com.example.basiclayoutscodelabs.favorite_collections

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiclayoutscodelabs.R
import com.example.basiclayoutscodelabs.ui.theme.bottom_navigation_color

@Composable
fun FavoriteCollection(modifier: Modifier, collectionName: String) {
    Row(
        modifier = modifier
            .width(250.dp)
            .height(100.dp)
            .clip(RoundedCornerShape(20))
            .background(
                bottom_navigation_color
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = modifier.fillMaxHeight(),
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = null
        )
        Spacer(modifier = modifier.width(10.dp))
        Text(text = collectionName)
    }
    Spacer(modifier.width(20.dp))
}

@Preview(showBackground = true)
@Composable
fun FavoriteCollectionPreview() {
    FavoriteCollection(modifier = Modifier, "Yoga is life")
}