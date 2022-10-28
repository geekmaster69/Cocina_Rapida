package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityParaDosBinding
import java.io.Serializable
class ParaDosActivity : AppCompatActivity(), ReceipeClickListener{
    private lateinit var binding: ActivityParaDosBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParaDosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                "Lomo de Cerdo y Papas con Pesto",
                R.drawable.omelette_jamon_queso,
                arrayListOf(
                    Ingredient(getString(R.string.perejil_1_2_manojo)),
                    Ingredient("4 cucharadas de aceite de oliva"),
                    Ingredient("dos cucharadas de piñones"),
                    Ingredient("1Kg de papas"),
                    Ingredient("4 dientes de ajo machacados"),
                    Ingredient("1Kg de lomo de cerdo")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_lomo_papas_pesto),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Carne de Res a la Cerveza",
                R.drawable.carne_res_cerveza,
                arrayListOf(
                    Ingredient("20g de mantequilla"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("1 cebolla grande"),
                    Ingredient("1.2Kg de carne de res para estofado"),
                    Ingredient("4 cucharadas de harina"),
                    Ingredient("500ml de cerveza clara"),
                    Ingredient("1 manojo de hiervas de olor"),
                    Ingredient("4 cucharadas de mostaza antigua"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_carne_res_cerveza),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Hamburguesas Suculentas",
                R.drawable.hamburguesa_suculenta,
                arrayListOf(
                    Ingredient("30g de mantequilla"),
                    Ingredient("2 cebollas"),
                    Ingredient("1 cucharada de azúcar"),
                    Ingredient("1 cucharada de vinagre balsámico"),
                    Ingredient("2 cucharadas de agua"),
                    Ingredient("4 discos de carne para hamburguesa"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("4 bollos para hamburgesas tostados"),
                    Ingredient("salsa barbecue"),
                    Ingredient("4 rebanadas de queso amarillo"),
                    Ingredient("1 jitomate"),
                    Ingredient("1 puñado de arúgula")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_hamburguesa_suculenta),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Rollo de Res al Pastor",
                R.drawable.rollos_res_pastor,
                arrayListOf(
                    Ingredient("10 milanesas de res"),
                    Ingredient("2 manojos de cilantro"),
                    Ingredient("500g de carne al pastor preparada"),
                    Ingredient("25g de mantequilla"),
                    Ingredient("una cuerda para hornear (Hilo grueso de algodón)"),
                    Ingredient("250ml de agua"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_rollos_res_pastor),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Costillas de cerdo en salsa BBQ",
                R.drawable.costillas_bbq,
                arrayListOf(
                    Ingredient("1.5kg de costillas de cerdo sin grasa"),
                    Ingredient("2 dientes de ajo"),
                    Ingredient("2 camotes"),
                    Ingredient("1 cebolla"),
                    Ingredient("6 ramas de tomillo"),
                    Ingredient("salsa BBQ"),
                    Ingredient("1 cucharada de aceite"),
                    Ingredient("papel aluminio")
                ),
                arrayListOf(
                    Ingredient("2 papas (Sustituye camote)")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_costillas_bbq),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Filete Mignon",
                R.drawable.salteado_cerdo_pina,
                arrayListOf(
                    Ingredient("2 fieletes de cerdo"),
                    Ingredient("180g de jitomates deshidratados en aceite"),
                    Ingredient("1 diente de ajo"),
                    Ingredient("1 cucharada de mostaza dijon"),
                    Ingredient("1 cebolla morada")
                ),
                arrayListOf(
                    Ingredient("2 papas (Sustituye camote)")
                ),
                arrayListOf(
                    Ingredient("Arróz"),
                    Ingredient("Ensalada"),
                ),
                getString(R.string.preparation_filete_mignon),
                arrayListOf(
                    Help(
                        getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@ParaDosActivity)
            adapter = recipeAdapter
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun recipeOnClickListener(recipe: Recipe) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)
        intent.putExtra("title",  recipe.title)
        intent.putExtra("img_top_recipe", recipe.image)

        val args = Bundle()
        args.putSerializable("ARRAYLIST", recipe.ingredients as Serializable)
        intent.putExtra("BUNDLE", args)

        args.putSerializable("SubstituteList", recipe.substitutes as Serializable)
        intent.putExtra("SubstituteListBundle", args)

        args.putSerializable("OptionalList", recipe.optional as Serializable)
        intent.putExtra("OptionalListBundle", args)

        args.putSerializable("HelpList", recipe.help as Serializable)
        intent.putExtra("HelpListBundle", args)

        intent.putExtra("preparation", recipe.process)

        startActivity(intent)
    }


}