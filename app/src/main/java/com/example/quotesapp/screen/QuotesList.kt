package com.example.quotesapp.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quotesapp.models.Quote


@Composable
fun QuoteList(data: Array<Quote>, onClick: (quote: Quote) -> Unit) {

    LazyColumn(content = {
        items(data) {
            QuotesListItem(quote = it, onClick)
        }
    })
}