package com.example.cocinarapida

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cocinarapida.adapter.ReceipeClickListener
import com.example.cocinarapida.adapter.RecipeAdapter
import com.example.cocinarapida.databinding.ActivitySopasBinding
import java.io.Serializable
import java.util.ArrayList

class SopasActivity : AppCompatActivity(), ReceipeClickListener {
    private lateinit var binding: ActivitySopasBinding
    private lateinit var recipeAdapter: RecipeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySopasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        val recipeList = arrayListOf<Recipe>(
            Recipe(getString(R.string.title_sopa_fideos),
                R.drawable.sopa_fideos,
                arrayListOf(
                    Ingredient(getString(R.string.sal_gusto)),
                    Ingredient(getString(R.string.bolsa_sop_fideos)),
                    Ingredient(getString(R.string.aceite)),
                    Ingredient(getString(R.string.pure_sazonado_tetrapack)),
                    Ingredient(getString(R.string.caldo_pollo))),
                arrayListOf(
                    Ingredient(getString(R.string.caldo_pollo_tp))),
                        arrayListOf(
                        Ingredient(getString(R.string.no_optios))),
                getString(R.string.prep_sop_fideos),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)))
            ),
            Recipe(
                getString(R.string.title_caldo_pollo),
                R.drawable.sopa_fideos,
                arrayListOf(
                    Ingredient(getString(R.string.piernas_pollo_4)),
                    Ingredient(getString(R.string.muslos_pollo_4)),
                    Ingredient(getString(R.string.zanahorias_4)),
                    Ingredient(getString(R.string.chayotes_2)),
                    Ingredient(getString(R.string.papas_2)),
                    Ingredient(getString(R.string.brocoli)),
                    Ingredient(getString(R.string.calabazas_4)),
                    Ingredient(getString(R.string.cebolla)),
                    Ingredient(getString(R.string.dientes_ajo_2)),
                    Ingredient(getString(R.string.manojo_cilantro)),
                    Ingredient(getString(R.string.sal_grano))),
                arrayListOf(
                    Ingredient(getString(R.string.vegetales_congelados))),
                arrayListOf(
                    Ingredient(getString(R.string.aguacate_1)),
                    Ingredient(getString(R.string.salsa_fav)),
                    Ingredient(getString(R.string.queso_panela)),
                    Ingredient(getString(R.string.tortillas))),
                getString(R.string.caldo_pollo_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)))
            ),
            Recipe(
                getString(R.string.title_sopa_verdolagas),
                R.drawable.sopa_verdolagas,
                arrayListOf(
                    Ingredient(getString(R.string.cucharadas_aceite_2)),
                    Ingredient(getString(R.string.cebolla_1_4)),
                    Ingredient(getString(R.string.ajos_2)),
                    Ingredient(getString(R.string.verdolagas)),
                    Ingredient(getString(R.string.papas_2)),
                    Ingredient(getString(R.string.jitomates_3)),
                    Ingredient(getString(R.string.tazas_caldo_pollo)),
                    Ingredient(getString(R.string.chile_guajillo_1)),
                    Ingredient(getString(R.string.dientes_ajo_2)),
                    Ingredient(getString(R.string.sal_grano))),
                arrayListOf(
                    Ingredient(getString(R.string.pure_tomate_tp)),
                    Ingredient(getString(R.string.caldo_pollo_tp))),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))),
                getString(R.string.sopa_verdeolagas_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)))

            ),
            Recipe(
                getString(R.string.title_sopa_col_tomate),
                R.drawable.sopa_col_tomate,
                arrayListOf(
                    Ingredient(getString(R.string.aceite)),
                    Ingredient(getString(R.string.cebolla_blanca_picada_1)),
                    Ingredient(getString(R.string.cucharada_tomillo_seco_1_2)),
                    Ingredient(getString(R.string.oregano)),
                    Ingredient(getString(R.string.pure_tomate_2_tazas)),
                    Ingredient(getString(R.string.caldo_pollo_4_tazas)),
                    Ingredient(getString(R.string.col_picada_4_tazas)),
                    Ingredient(getString(R.string.vara_apio_1)),
                    Ingredient(getString(R.string.zanahoria_pelada_1)),
                    Ingredient(getString(R.string.sal_pimineta_gusto))),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))),
                getString(R.string.sopa_col_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)))
            ),
            Recipe(
                getString(R.string.title_crema_champinones),
                R.drawable.crema_champinones,
                arrayListOf(
                    Ingredient(getString(R.string.cuadro_leche_ev_250)),
                    Ingredient(getString(R.string.mantequilla_1_4)),
                    Ingredient(getString(R.string.papas_medianas_4)),
                    Ingredient(getString(R.string.champinones_250)),
                    Ingredient(getString(R.string.tazas_agua_4)),
                    Ingredient(getString(R.string.clado_pollo_cucharada_4)),
                    Ingredient(getString(R.string.taza_leche))),
                arrayListOf(
                    Ingredient(getString(R.string.pure_papa_des)),
                    Ingredient(getString(R.string.lata_champinones_rev))),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))),
                getString(R.string.crema_champinones_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)))
            ),
            Recipe(
                getString(R.string.title_crema_habas),
                R.drawable.crema_habas,
                arrayListOf(
                    Ingredient(getString(R.string.habas_400g)),
                    Ingredient(getString(R.string.papa_mediana_3)),
                    Ingredient(getString(R.string.zanahorias_2)),
                    Ingredient(getString(R.string.cebolla)),
                    Ingredient(getString(R.string.aceite)),
                    Ingredient(getString(R.string.agua_1l)),
                    Ingredient(getString(R.string.sal_pimineta_gusto)),
                    Ingredient(getString(R.string.caldo_pollo_polvo_1cda))),
                arrayListOf(
                    Ingredient(getString(R.string.pure_papa_des))),
                arrayListOf(
                    Ingredient(getString(R.string.pan_tostadas_crutones))),
                getString(R.string.crema_habas_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)))
            ),
            Recipe(
                getString(R.string.title_sopa_poro),
                R.drawable.sopa_poro,
                arrayListOf(
                    Ingredient(getString(R.string.papas_medianas_3)),
                    Ingredient(getString(R.string.aceite_oliva_cda)),
                    Ingredient(getString(R.string.poro_rodajas_1)),
                    Ingredient(getString(R.string.jitomates_2)),
                    Ingredient(getString(R.string.ajo_1)),
                    Ingredient(getString(R.string.caldo_pollo_1_1_2))),
                arrayListOf(
                    Ingredient(getString(R.string.caldo_pollo_tp)),
                    Ingredient(getString(R.string.pure_tomate_tp))),
                arrayListOf(
                    Ingredient(getString(R.string.rebanada_aguacate_3))),
                getString(R.string.sopa_poro_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)))
            ),
            Recipe(
                getString(R.string.title_crema_espinacas),
                R.drawable.crema_espinacas,
                arrayListOf(
                    Ingredient(getString(R.string.manojo_espinacas)),
                    Ingredient(getString(R.string.leche_evaporada_250ml)),
                    Ingredient(getString(R.string.papas_medianas_3)),
                    Ingredient(getString(R.string.taza_leche_1)),
                    Ingredient(getString(R.string.caldo_pollo_1_2l)),
                    Ingredient(getString(R.string.caldo_pollo_polvo_1_2_cda)),
                    Ingredient(getString(R.string.mantequilla_2_cda))),
                arrayListOf(
                    Ingredient(getString(R.string.espinacas_bolsa)),
                    Ingredient(getString(R.string.caldo_pollo_tp)),
                    Ingredient(getString(R.string.pure_papa_dht))),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))),
                getString(R.string.crema_espinacas_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description)))
            ),
            Recipe(
                getString(R.string.title_crema_verduras),
                R.drawable.crema_verduras_2,
                arrayListOf(
                    Ingredient(getString(R.string.mezcla_verduras_500g)),
                    Ingredient(getString(R.string.caldo_pollo_1_2l)),
                    Ingredient(getString(R.string.leche_evaporada_250ml)),
                    Ingredient(getString(R.string.papas_medianas_3)),
                    Ingredient(getString(R.string.cebolla_1_4)),
                    Ingredient(getString(R.string.ajo_1))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.mezcla_verduras_congeladas)),
                    Ingredient(getString(R.string.caldo_pollo_tp)),
                    Ingredient(getString(R.string.pure_papa_dht))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.crema_verduras_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_caldo_tlalpeno),
                R.drawable.caldo_tlalpeno,
                arrayListOf(
                    Ingredient(getString(R.string.piernas_pollo_sin_piel_2)),
                    Ingredient(getString(R.string.muslos_pollo_sin_piel_2)),
                    Ingredient(getString(R.string.pechuga_pollo_sin_piel)),
                    Ingredient(getString(R.string.cebolla_1_4)),
                    Ingredient(getString(R.string.ajo_1)),
                    Ingredient(getString(R.string.agua_2l)),
                    Ingredient(getString(R.string.sal_grano)),
                    Ingredient(getString(R.string.pure_tomate_tp)),
                    Ingredient(getString(R.string.chile_chipotle_lata_1)),
                    Ingredient(getString(R.string.manojo_epazote)),
                    Ingredient(getString(R.string.zanahorias_4)),
                    Ingredient(getString(R.string.papas_medianas_3)),
                    Ingredient(getString(R.string.ejotes_cocidos_250g)),
                    Ingredient(getString(R.string.garbanzos_cocidos_250g))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.garbanzos_lata)),
                    Ingredient(getString(R.string.zanahorias_papas_lata))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.tortillas)),
                    Ingredient(getString(R.string.queso_panela)),
                    Ingredient(getString(R.string.aguacate))
                ),
                getString(R.string.caldo_tlalpeño_preparation),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_crema_calabazas_curri),
                R.drawable.crema_calabazas_currry,
                arrayListOf(
                    Ingredient("1Kg de calabazitas"),
                    Ingredient("1 cebolla"),
                    Ingredient("1 cucharada de aceite"),
                    Ingredient("2 cucharadas de curry amaraillo en polvo"),
                    Ingredient("1 cubo de caldo de pollo"),
                    Ingredient("150g de queso doble crema"),
                    Ingredient("700ml de agua")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_crema_calabacitas_curry),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_crema_zanahorias),
                R.drawable.crema_zanahoria,
                arrayListOf(
                    Ingredient("4 zanahorias"),
                    Ingredient("1 cebolla"),
                    Ingredient("1 manojo de cilantro"),
                    Ingredient("150g de qeso crema"),
                    Ingredient("sal y pimienta al gusto")
                ),
                arrayListOf(
                    Ingredient("pure de papa en polvo"),
                    Ingredient("crema de cacahuate sin azúcar")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_crema_zanahoria),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_sopa_manzana_camote_jengibre),
                R.drawable.crema_manzana_camote,
                arrayListOf(
                    Ingredient("2 manzanas"),
                    Ingredient("1 cebolla"),
                    Ingredient("1 camote"),
                    Ingredient("2 cm de jengibre"),
                    Ingredient("3 cucharadas de leche de coco"),
                    Ingredient("agua"),
                    Ingredient("aceite")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_sopa_manzana_camote),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                getString(R.string.title_sopa_espinacas_comino),
                R.drawable.crema_espinacas_comino,
                arrayListOf(
                    Ingredient("3 papas"),
                    Ingredient("300g de espinacas"),
                    Ingredient("250ml de leche"),
                    Ingredient("1 caharada de comino en polvo"),
                    Ingredient("2 cucharas de aceite"),
                    Ingredient("agua"),
                    Ingredient("150g de queso doble crema"),
                    Ingredient("sal y pimienta al gusto")
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(getString(R.string.no_optios))
                ),
                getString(R.string.preparation_sopa_espicancas_comino),
                arrayListOf(
                    Help(getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        getString(R.string.no_help_suggestion_description))
                )
            )
        )

        recipeAdapter = RecipeAdapter(recipeList, this)
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(this@SopasActivity)
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