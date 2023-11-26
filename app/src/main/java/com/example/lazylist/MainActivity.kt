package com.example.lazylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazylist.data.Dish
import com.example.lazylist.data.categories
import com.example.lazylist.data.dishes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppScreen()
        }
    }
}

@Composable
@Preview(showBackground = true)
fun AppScreen(){
    Column(modifier = Modifier.fillMaxSize()) {
        LazyRow(
            horizontalArrangement = Arrangement.SpaceAround
        ){
            items(categories){category ->
                MenuCategory(category)
            }
        }
        Divider(
            modifier = Modifier.padding(8.dp),
            color = Color.Gray,
            thickness = 1.dp
        )
        LazyColumn {
            items(dishes){dish ->
                MenuDish(dish)
            }
        }
    }
}




@Composable
//@Preview(showBackground = true)
fun MenuCategory(category: String) {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(Color(0xFFEEE2DE)),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp),
        modifier = Modifier.padding(5.dp)

    ) {
       Text(text = category)
    }
}

@Composable
fun MenuDish(dish: Dish) {
    Card {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
            ) {
            Column {
                Text(
                    text = dish.dishName,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = dish.disDescription,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(.75f)
                )

                Text(
                    text = dish.price,
                    color = Color.Gray,
                    fontSize = 8.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Image(painter = painterResource(id = dish.image), contentDescription = "")
        }
        Divider(
            modifier = Modifier.padding(start = 8.dp, end = 8.dp),
            color = Color.LightGray,
            thickness = 1.dp
        )
    }
}