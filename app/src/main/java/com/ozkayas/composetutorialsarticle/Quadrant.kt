package com.ozkayas.composetutorialsarticle

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun QuadrantMainLayout(){
    Column{
        Row(Modifier.weight(1f)) {
            Quadrant(color = Color.Green, title = stringResource(R.string.title_1), description = stringResource(
                R.string.description_1
            ), flex = 1f )
            Quadrant(color = Color.Yellow, title = stringResource(R.string.title_2), description = stringResource(
                R.string.description_2), flex = 1f)
        }
        Row(Modifier.weight(1f)) {
            Quadrant(color = Color.Cyan, title = stringResource(R.string.title_3), description = stringResource(
                R.string.description_3), flex = 1f)
            Quadrant(color = Color.LightGray, title = stringResource(R.string.title_4), description = stringResource(
                R.string.description_4), flex = 1f)
        }
    }
}

@Composable
fun RowScope.Quadrant(color: Color, title:String, description:String, flex: Float ){
    Surface(color = color, modifier = Modifier
        .fillMaxHeight()
        .weight(flex)) {
        Column(modifier = Modifier.padding(all = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
            Text(text = title, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
            Text(text = description, textAlign = TextAlign.Justify)
        }
    }
}