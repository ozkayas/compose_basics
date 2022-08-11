package com.ozkayas.composetutorialsarticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ozkayas.composetutorialsarticle.ui.theme.ComposeTutorialsArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialsArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainLayout()
                }
            }
        }
    }
}

@Composable
fun MainLayout(){
    Column {
        TopImage()
        Text(text = stringResource(R.string.tutorial_title), fontSize = 24.sp , modifier = Modifier.padding(all = 16.dp))
        Text(text = stringResource(R.string.description), fontSize = 16.sp , textAlign = TextAlign.Justify, modifier = Modifier.padding(start = 16.dp, end = 16.dp))
        Text(text = stringResource(R.string.body), fontSize = 16.sp , textAlign = TextAlign.Justify, modifier = Modifier.padding(all = 16.dp))
    }
}

@Composable
fun TopImage() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(painter = image, contentDescription = null)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTutorialsArticleTheme {
    }
}