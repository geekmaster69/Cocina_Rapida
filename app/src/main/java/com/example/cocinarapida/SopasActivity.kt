package com.example.cocinarapida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocinarapida.databinding.ActivitySopasBinding

class SopasActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySopasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySopasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSopaFideos.setOnClickListener {
            val sop_fod_ing_1: String = getString(R.string.sal_gusto)
            val sop_fod_ing_2: String = getString(R.string.bolsa_sop_fideos)
            val sop_fod_ing_3: String = getString(R.string.aceite)
            val sop_fod_ing_4: String = getString(R.string.pure_sazonado_tetrapack)
            val sop_fod_ing_5: String = getString(R.string.caldo_pollo)

            val sop_fod_subs_1: String = getString(R.string.caldo_pollo_tp)

            val pre_sop_fideos: String = getString(R.string.prep_sop_fideos)
            openSopaFideosActivity(sop_fod_ing_1, sop_fod_ing_2, sop_fod_ing_3,
                                    sop_fod_ing_4, sop_fod_ing_5, sop_fod_subs_1, pre_sop_fideos)
        }

        binding.btCaldoPollo.setOnClickListener {
            openCaldoPolloActivity()
        }

        binding.btSopaVerdolagas.setOnClickListener {
            openSopaVerdolagasActivity()
        }

        binding.btSopaCol.setOnClickListener {
            openSopaColActivity()
        }
        binding.btCremaChampiOnes.setOnClickListener {

            val ingredient1: String = getString(R.string.cuadro_leche_ev_250)
            val ingredient2: String = getString(R.string.mantequilla_1_4)
            val ingredient3: String = getString(R.string.papas_medianas_4)
            val ingredient4: String = getString(R.string.champinones_250)
            val ingredient5: String = getString(R.string.tazas_agua_4)
            val ingredient6: String = getString(R.string.clado_pollo_cucharada_4)
            val ingredient7: String = getString(R.string.taza_leche)
            val substitute1: String = getString(R.string.pure_papa_des)
            val substitute2: String = getString(R.string.lata_champinones_rev)
            val preparation1: String = getString(R.string.prep_crema_champinones)

            openCremaChampinonesActivity(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
                ingredient6, ingredient7, substitute1, substitute2, preparation1)
        }
        binding.btCremaHabas.setOnClickListener {
            openCremaHabasActivity()
        }
        binding.btSopaPoro.setOnClickListener {
            openSopaPoroActivity()
        }
        binding.btCremaEspinacas.setOnClickListener {
            openCremaEspinacasActivity()
        }
        binding.btCremaVerduras.setOnClickListener {
            openCremaVerdurasActivity()
        }
        binding.btCaldoTalpeno.setOnClickListener {
            openCladoTlalpenoActivity()
        }




    }

    private fun openCladoTlalpenoActivity() {
        startActivity(Intent(this, CaldoTlalpenoActivity::class.java))
    }

    private fun openCremaVerdurasActivity() {
        startActivity(Intent(this, CremaVerdurasActivity::class.java))
    }

    private fun openCremaEspinacasActivity() {
        startActivity(Intent(this, CremaEspinacasActivity::class.java))
    }

    private fun openSopaPoroActivity() {
        startActivity(Intent(this, SopaPoroActivity::class.java))
    }

    private fun openCremaHabasActivity() {
        startActivity(Intent(this, CremaHabasActivity::class.java))
    }

    private fun openCremaChampinonesActivity(ingredient1: String, ingredient2: String, ingredient3: String,
                                             ingredient4: String, ingredient5: String, ingredient6: String, ingredient7: String,
                                             substitute1: String, substitute2: String, preparation1: String) {
        val intent = Intent(this, RecipeTemplateActivity::class.java)
        intent.putExtra("ingredient_1", ingredient1)
        intent.putExtra("ingredient_2", ingredient2)
        intent.putExtra("ingredient_3", ingredient3)
        intent.putExtra("ingredient_4", ingredient4)
        intent.putExtra("ingredient_5", ingredient5)
        intent.putExtra("ingredient_6", ingredient6)
        intent.putExtra("ingredient_7", ingredient7)

        intent.putExtra("sustituto_1", substitute1)
        intent.putExtra("sustituto_2", substitute2)

        intent.putExtra("preparation1", preparation1)


        intent.putExtra("img_champinones_crema", R.drawable.crema_champinones)

        startActivity(intent)
    }

    private fun openSopaColActivity() {
        startActivity(Intent(this, SopaColActivity::class.java))
    }

    private fun openSopaVerdolagasActivity() {
        startActivity(Intent(this, SopaVerdolagasActivity::class.java))
    }

    private fun openCaldoPolloActivity() {
        startActivity(Intent(this, CaldoPolloActivity::class.java))
    }


    private fun openSopaFideosActivity(sop_fod_ing_1: String,sop_fod_ing_2: String,sop_fod_ing_3:
                                        String,sop_fod_ing_4: String,sop_fod_ing_5: String,
                                       sop_fod_subs_1: String, pre_sop_fideos: String) {

        val intent = Intent(this, RecipeTemplateActivity::class.java)

        intent.putExtra("ingredient_1", sop_fod_ing_1)
        intent.putExtra("ingredient_2", sop_fod_ing_2)
        intent.putExtra("ingredient_3", sop_fod_ing_3)
        intent.putExtra("ingredient_4", sop_fod_ing_4)
        intent.putExtra("ingredient_5", sop_fod_ing_5)

        intent.putExtra("sustituto_1", sop_fod_subs_1)

        intent.putExtra("preparation1", pre_sop_fideos)

        intent.putExtra("img_champinones_crema", R.drawable.sopa_fideos)

        startActivity(intent)
    }
}