package com.example.basiclayoutscodelabs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.basiclayoutscodelabs.ui.theme.md_theme_light_background

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    var searchInput by remember { mutableStateOf("") }
    TextField(
        value = searchInput,
        onValueChange = { searchInput = it },
        placeholder = { Text("Search") },
        modifier = modifier
            .fillMaxWidth()
            .background(md_theme_light_background),
        leadingIcon = {
            Icon(Icons.Filled.Search, contentDescription = "Search")
        },
        singleLine = true
    )
}

@Preview(showBackground = true)
@Composable
fun SearchPreview() {
    SearchBar(modifier = Modifier)
}

