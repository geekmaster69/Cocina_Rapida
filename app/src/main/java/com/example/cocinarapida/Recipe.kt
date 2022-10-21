package com.example.cocinarapida

import java.io.Serializable

data class Recipe(val title: String, val image: Int, val ingredients: ArrayList<Ingredient>,
                  val optional: ArrayList<Ingredient>, val substitutes: ArrayList<Ingredient>,
                  val process: String, val help: ArrayList<Help>):Serializable

