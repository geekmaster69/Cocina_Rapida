package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivityBebidasBinding
import java.io.Serializable

class BebidasActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivityBebidasBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBebidasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recipeList = arrayListOf(
            Recipe(
                getString(R.string.title_agua_jamaica_natural),
                R.drawable.agua_jamaica_natural,
                arrayListOf(
                    Ingredient(getString(R.string.flor_jamaica_1tz)),
                    Ingredient(getString(R.string.agua_12tz)),
                    Ingredient(getString(R.string.azucar_stevia_al_gusto)),
                    Ingredient(getString(R.string.hielo))),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.agua_jamaica_natural_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                getString(R.string.title_limonada_frutos_rojos),
                R.drawable.limonada_frutos_rojos,
                arrayListOf(
                    Ingredient(getString(R.string.frutos_rojos_congelados_1tz)),
                    Ingredient(getString(R.string.jugo_limon_1_4tz)),
                    Ingredient(getString(R.string.jarabe_natural_1cda)),
                    Ingredient(getString(R.string.agua_agua_mineral_1tz)),
                    Ingredient(getString(R.string.hielo))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.hojas_menta))
                ),
                getString(R.string.limonada_frutos_rojos_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                getString(R.string.title_latte_fresa_te_verde),
                R.drawable.latte_fresa_te_verde,
                arrayListOf(
                    Ingredient(getString(R.string.fresas_congeladas_6pz)),
                    Ingredient(getString(R.string.azucar_1cda)),
                    Ingredient(getString(R.string.taza_leche_1)),
                    Ingredient(getString(R.string.te_verde_polvo_1cda)),
                    Ingredient(getString(R.string.agua_caliente_1_4tz)),
                    Ingredient(getString(R.string.hielo))
                ),
                arrayListOf(Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.fresas_frescas))
                ),
                getString(R.string.latte_fresa_te_verde_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                getString(R.string.title_latte_cafe_baileys),
                R.drawable.cafe_baileys,
                arrayListOf(
                    Ingredient(getString(R.string.licor_cafe_30ml)),
                    Ingredient(getString(R.string.hielo)),
                    Ingredient(getString(R.string.baileys_30ml)),
                    Ingredient(getString(R.string.crema_leche_30ml))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.consentrado_jugo_limon))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.crema_batida)),
                    Ingredient(getString(R.string.nuez_moscada_polvo))
                ),
                getString(R.string.latte_cafe_baileys_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                getString(R.string.title_licuado_pina_platano_coco),
                R.drawable.licuado_piana_platano,
                arrayListOf(
                    Ingredient(getString(R.string.ralladura_coco_1_2tz)),
                    Ingredient(getString(R.string.leche_coco_1_2tz)),
                    Ingredient(getString(R.string.pina_pelada_1_2tz)),
                    Ingredient(getString(R.string.platano_1)),
                    Ingredient(getString(R.string.azucar_4cda)),
                    Ingredient(getString(R.string.leche_1tz)),
                    Ingredient(getString(R.string.canela_molida_1cda))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.licuado_pina_platano_coco_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                getString(R.string.title_licuado_oreo_chocolate),
                R.drawable.licuado_oreo,
                arrayListOf(
                    Ingredient(getString(R.string.chocolate_liquido)),
                    Ingredient(getString(R.string.galletas_chocolate_6pz)),
                    Ingredient(getString(R.string.leche_1_1_2tz)),
                    Ingredient(getString(R.string.helado_vainilla_1tz))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.licuado_ore_chocolate_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                getString(R.string.title_licuado_duraazno_fresa_platano),
                R.drawable.licuado_fresa_durasno,
                arrayListOf(
                    Ingredient(getString(R.string.leche_2tz)),
                    Ingredient(getString(R.string.fresa_125g)),
                    Ingredient(getString(R.string.durazno_100g)),
                    Ingredient(getString(R.string.platano_1)),
                    Ingredient(getString(R.string.azucar_2cda)),
                    Ingredient(getString(R.string.naranja_jugo_1_2pz))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.licuado_durazno_fresa_platano_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                getString(R.string.title_licuado_mamey_nuez),
                R.drawable.licuado_mamey_nuez,
                arrayListOf(
                    Ingredient(getString(R.string.mamey_1_2pz)),
                    Ingredient(getString(R.string.leche_2tz)),
                    Ingredient(getString(R.string.azucar_3cds)),
                    Ingredient(getString(R.string.nueces_1_4_tza)),
                    Ingredient(getString(R.string.canela_molida_1_2cda))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.licuado_mamey_nuez_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                getString(R.string.title_licuado_mango_crema_coco),
                R.drawable.licuado_mango_crema_coco,
                arrayListOf(
                    Ingredient(getString(R.string.mango_1tz)),
                    Ingredient(getString(R.string.crema_coco_1tz)),
                    Ingredient(getString(R.string.yogurt_natural_1tz)),
                    Ingredient(getString(R.string.hielo)),
                    Ingredient(getString(R.string.chichitos_colores_1_2tz)),
                    Ingredient(getString(R.string.azucar_glas)),
                    Ingredient(getString(R.string.agua_1cda))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.licuado_mango_crema_coco_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@BebidasActivity)
            adapter = recipeAdapter
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun recipeOnClickListener(recipe: Recipe) {
        val intent = Intent(this, RecipeTemplateActivity::class.java)

        val args = Bundle()
        args.putSerializable("Recipe", recipe as Serializable)
        intent.putExtra("Bundle", args)

        startActivity(intent)

    }
}