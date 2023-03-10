package com.example.motivationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.motivationapp.data.DataModel
import com.example.motivationapp.data.DataSource
import com.example.motivationapp.ui.theme.MotivationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MotivationApp()
        }
    }
}

@Composable
fun MotivationApp(){
    MotivationAppTheme {
        MotivationList(motivationList = DataSource().loadData())
    }
}

@Composable
fun MotivationList(motivationList: List<DataModel>,modifier: Modifier=Modifier){
    LazyColumn{
        items(motivationList){dataModel->
            MotivationCard(dataModel)
        }
    }
}

@Composable
fun MotivationCard(dataModel: DataModel,modifier: Modifier=Modifier){
    Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
        Column {
            Image(
                painter = painterResource(dataModel.drawableResourceId),
                contentDescription = stringResource(dataModel.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(dataModel.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.h6
            )
        }
    }
}

@Preview
@Composable
private fun MotivationCardPreview(){
    MotivationCard(dataModel = DataModel(R.string.string1,R.drawable.image1))
}