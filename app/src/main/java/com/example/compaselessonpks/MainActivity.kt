package com.example.compaselessonpks

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.compaselessonpks.ui.theme.CompaseLessonPKSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CompaseLessonPKSTheme {
                Column (modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(25.dp)) {
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                    ListItem(name = "Zac Efron", prof = "Actor")
                }
            }
        }
    }
}

@Composable
fun ListItem(name: String, prof: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Box {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(CircleShape)
                        .size(64.dp)
                )
                Column(modifier = Modifier.padding(start = 16.dp)) {
                    Text(text = name)
                    Text(text = prof)
                }
            }
        }
    }
}
