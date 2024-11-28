package com.example.basiclayoutscodelabs.favorite_collections

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FavoriteCollections(modifier: Modifier){

    val collections = listOf("Short Mandras", "Nature Meditations")

    Column(modifier = modifier.fillMaxWidth()) {
        Text("Favorite Collections")
        Spacer(modifier.height(20.dp))
        LazyRow {
            items(collections) {
                collection ->
                FavoriteCollection(modifier,collectionName = collection)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FavoriteCollectionsPreview(){
    FavoriteCollections(modifier = Modifier)
}