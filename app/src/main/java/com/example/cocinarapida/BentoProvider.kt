package com.example.cocinarapida

import android.content.res.Resources
import android.content.Context

class BentoProvider() {
    companion object{
        val bentoList = arrayListOf(
            Recipe(Resources.getSystem().getString(R.string.title_bento_cerdo_agridulce),
                R.drawable.bento_cerdo_agridulce,
                arrayListOf(
                    Ingredient("1kg de filete de cerdo"),
                    Ingredient("2 cucharadas de salsa de soya"),
                    Ingredient("1 cucharada de pimienta"),
                    Ingredient("1 huevo"),
                    Ingredient("harina de trigo"),
                    Ingredient("aceite para freír"),
                    Ingredient("1 cuchara de ajo picado"),
                    Ingredient("1 cucharada de jengibre picado"),
                    Ingredient("1 taza de jugo de naranja natural"),
                    Ingredient("3 cucharadas de azúcar"),
                    Ingredient("2 cucharadas de vinagre blanco"),
                    Ingredient("2 cucharadas de puré de tomate"),
                    Ingredient("4 cucharadas de salsa de soya"),
                    Ingredient("2 cucharadas de agua"),
                    Ingredient("2 cucharadas de maizena")),

                arrayListOf(
                    Ingredient("frasco de ajo picado"),
                    Ingredient("jugo de naranja en tetrapack"),
                    Ingredient("stevia"),
                    Ingredient("ketchup")),

                arrayListOf(
                    Ingredient("cebollín"),
                    Ingredient("semillas de sésamo")),

                Resources.getSystem().getString(R.string.cerdo_agridulce_preparation),

                arrayListOf(
                    Help("Sin sugerencias", R.drawable.ic_help_null, "No hay sugerencias disponibles"))

            )
        )
    }
}