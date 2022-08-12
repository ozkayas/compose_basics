package com.ozkayas.composetutorialsarticle

import androidx.compose.foundation.Image
import androidx.compose.foundation.indication
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun BusinessCardMainLayout(){
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.primary) {
        Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
        ){
            Spacer(modifier = Modifier )
            LogoInfo()
            Column(modifier = Modifier.padding(horizontal = 24.dp)){
                InfoRow(icon = Icons.Rounded.Phone, text = "555 -- 12 34")
                InfoRow(icon = Icons.Rounded.Email, text = "tony_Stark@compose.com")
                InfoRow(icon = Icons.Rounded.Share, text = "Share me dude")
            }

        }
    }
}

@Composable
fun InfoRow(icon:ImageVector, text:String){
    Column() {
        Divider(color = Color.White)
        Row(modifier = Modifier.padding(vertical = 6.dp)) {
            Icon(
                icon,
                contentDescription = "Localized description",
                tint = Color.Green
            )
            Spacer(modifier = Modifier.width(24.dp))
            Text(text = text )
        }
    }
}

@Composable
fun LogoInfo(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(id = R.drawable.android_logo_2019)
        Image(painter = image, contentDescription = null)
        Text(text = "Tony Stark", fontSize = 36.sp)
        Text(text = "Super Android Hero", color = Color.Green)

    }
}