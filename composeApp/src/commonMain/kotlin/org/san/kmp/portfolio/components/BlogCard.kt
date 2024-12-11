package org.san.kmp.portfolio.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.san.kmp.portfolio.data.Blog

@Composable
fun BlogCard(modifier: Modifier = Modifier, blog: Blog) {

    Column(modifier.width(275.dp).wrapContentHeight().padding(10.dp)) {
        Text(text = blog.title, style = MaterialTheme.typography.h5)

        Row(
            horizontalArrangement = Arrangement.Start,
        ) {
            Text(text = blog.date, style = MaterialTheme.typography.subtitle1)
            Text(" | ")
            Text(text = blog.tags.joinToString(", "), style = MaterialTheme.typography.body1)
        }

        Text(text = blog.description, style = MaterialTheme.typography.body2)

    }

}