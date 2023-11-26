package com.example.lazylist.data

import com.example.lazylist.R

data class Dish(
    val dishName : String,
    val disDescription : String,
    val price : String,
    val image : Int
)


val dishes = listOf<Dish>(
    Dish("Greek Salade", "This character description generator will generate a fairly random description of a belonging to a random race. However, some aspects of the descriptions will remain the same", "12", R.drawable.greeksalad ),
    Dish("Bruschetta", "This character description generator will generate a fairly random description of a belonging to a random race. However, some aspects of the descriptions will remain the same", "12", R.drawable.bruschetta ),
    Dish("Lemon Dessert", "This character description generator will generate a fairly random description of a belonging to a random race. However, some aspects of the descriptions will remain the same", "12", R.drawable.lemondessert ),
    Dish("Greek Salade", "This character description generator will generate a fairly random description of a belonging to a random race. However, some aspects of the descriptions will remain the same", "12", R.drawable.greeksalad ),
    Dish("Bruschetta", "This character description generator will generate a fairly random description of a belonging to a random race. However, some aspects of the descriptions will remain the same", "12", R.drawable.bruschetta ),
    Dish("Lemon Dessert", "This character description generator will generate a fairly random description of a belonging to a random race. However, some aspects of the descriptions will remain the same", "12", R.drawable.lemondessert ),
    Dish("Greek Salade", "This character description generator will generate a fairly random description of a belonging to a random race. However, some aspects of the descriptions will remain the same", "12", R.drawable.greeksalad ),
    Dish("Bruschetta", "This character description generator will generate a fairly random description of a belonging to a random race. However, some aspects of the descriptions will remain the same", "12", R.drawable.bruschetta ),
    Dish("Lemon Dessert", "This character description generator will generate a fairly random description of a belonging to a random race. However, some aspects of the descriptions will remain the same", "12", R.drawable.lemondessert )

)