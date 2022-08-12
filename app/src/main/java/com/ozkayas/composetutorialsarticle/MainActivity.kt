package com.ozkayas.composetutorialsarticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
//                    ArticleMainLayout()
//                    TaskMainLayout()
                    QuadrantMainLayout()
                }
            }
        }
    }
}

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
fun RowScope.Quadrant(color:Color, title:String, description:String, flex: Float ){
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


@Composable
fun TaskMainLayout(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(id = R.drawable.ic_task_completed)
        Image(painter = image, contentDescription = null)
        Text(text = stringResource(R.string.all_tasks_completed), fontSize = 24.sp, modifier = Modifier.padding(top = 24.dp, bottom = 8.dp))
        Text(text = stringResource(R.string.nice_work), fontSize = 16.sp)
    }
}

@Composable
fun ArticleMainLayout(){
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