package com.example.cocinarapida

import android.content.res.Resources

class FullRecipeList {

    companion object{

        val fullRecipeList = arrayListOf(

            //Recetas de Bento

            Recipe(
                Resources.getSystem().getString(R.string.title_bento_cerdo_agridulce),
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
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles"))
            ),
            Recipe(
                "Wok de Res con Fideos de Arroz y Brocoli",
                R.drawable.wok_res_fideos_brocoli,
                arrayListOf(
                    Ingredient("400g de fideos de arroz"),
                    Ingredient("1 brocoli mediano"),
                    Ingredient("600g de filete de res"),
                    Ingredient("cacahuates tostados salados"),
                    Ingredient("salsa de soya"),
                    Ingredient("250ml de agua"),
                    Ingredient("3 cucharadas de aceite de oliva")
                ),
                arrayListOf(
                    Ingredient("fideos de frijos (Sustitulle fideos de arroz)"),
                    Ingredient("milanesa de res (Sustitulle fielete de res)")
                ),
                arrayListOf(
                    Ingredient( Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.preparation_wok_res_fideos_brocoli),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                "Chili con carne expés",
                R.drawable.chili_expres,
                arrayListOf(
                    Ingredient("2 cebollas"),
                    Ingredient("500g de carne molida de res"),
                    Ingredient("2 cucharadas de aceite de oliva"),
                    Ingredient("300g de jitomates picados enlatados o tetrapak"),
                    Ingredient("1 cucharada de comino en polvo"),
                    Ingredient("1 cucharada de chile en polvo"),
                    Ingredient("1 lata de frijoles ayocote morado"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient("frijoles enteros (Stutituye frijoles ayocote)"),
                    Ingredient("500g de carne molida de cerdo (Sustituye carne de res)"),
                ),
                arrayListOf(
                    Ingredient("limones")
                ),
                Resources.getSystem().getString(R.string.preparation_chili_expres),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                "Brochetas de Albóndigas con Ensalada de Jitomate",
                R.drawable.brochetas_albondigas_ensalada,
                arrayListOf(
                    Ingredient("1 cebolla morada"),
                    Ingredient("30 hojas de menta"),
                    Ingredient("palitos para brocheta"),
                    Ingredient("600g de carme molida de res"),
                    Ingredient("4 cucharadas de aceite"),
                    Ingredient("20 jitomates cherry"),
                    Ingredient("vinagre balsámico")
                ),
                arrayListOf(
                    Ingredient( Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("puedes acompañar con pasta o arroz")
                ),
                Resources.getSystem().getString(R.string.preparation_brochetas_albondigas_ensalada),
                arrayListOf(
                    Help("Corte de Cebolla",
                        R.drawable.help_cebolla_rodajas,
                        "Así es como debe verse la cebolla cuando la cortes")
                )
            ),
            Recipe(
                "Saltimbocca",
                R.drawable.saltimbocca,
                arrayListOf(
                    Ingredient("8 milanesas de res"),
                    Ingredient("8 rebanadas de queso mozzarela"),
                    Ingredient("romero"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("palillos"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient( Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient( Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.preparation_saltimbocca),
                arrayListOf(
                    Help( Resources.getSystem().getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Salteado de Cerdo y Jengibre",
                R.drawable.salteado_cerdo_jengibre,
                arrayListOf(
                    Ingredient("600g de filete de cerdo"),
                    Ingredient("4 cebollas cambray"),
                    Ingredient("3cm de jengibre"),
                    Ingredient("2 cucharadas de aceite"),
                    Ingredient("3 cucharadas de aceite de soya"),
                    Ingredient("2 cucharadas de azúcar mascabado"),
                    Ingredient("sal y pimienta")
                ),
                arrayListOf(
                    Ingredient( Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("puedes acompañar arroz blanco")
                ),
                Resources.getSystem().getString(R.string.preparation_salteado_cerdo_jengibre),
                arrayListOf(
                    Help( Resources.getSystem().getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Pollo crujiente con Hojuelas de Maíz",
                R.drawable.pollo_crujinte_jojuelas,
                arrayListOf(
                    Ingredient("2 pecuchas sin piel y sin hueso"),
                    Ingredient("200 ml de leche"),
                    Ingredient("1 cucharada de páprika"),
                    Ingredient("8 cucharadas de harina"),
                    Ingredient("1 cucharada de ajo en polvo"),
                    Ingredient("2 huevos"),
                    Ingredient("250g de hojuelas de miz"),
                    Ingredient("2 cucharadas de aceite")
                ),
                arrayListOf(
                    Ingredient( Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient("puedes acompañar arroz blanco")
                ),
                Resources.getSystem().getString(R.string.preparation_pollo_crujiente_hojuelas),
                arrayListOf(
                    Help( Resources.getSystem().getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                "Poke Bowl",
                R.drawable.poke_bowl,
                arrayListOf(
                    Ingredient("300g de arroz cocido"),
                    Ingredient("1 cucharada de ajonjolí blanco y negro"),
                    Ingredient("300g de salmón"),
                    Ingredient("4 cebollas cambray (Solo tallo)"),
                    Ingredient("4 cucharadas de salsa de soya"),
                    Ingredient("2 cucharadas de aceite de ajonjolí"),
                    Ingredient("1 pepino"),
                    Ingredient("1 col"),
                    Ingredient("2 aguacates")
                ),
                arrayListOf(
                    Ingredient("Sobre de salmón (Sustituye el salmón)"),
                    Ingredient("Sobre de atún (Sustituye el salmón)")
                ),
                arrayListOf(
                    Ingredient( Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.preparation_poke_bowl),
                arrayListOf(
                    Help( Resources.getSystem().getString(R.string.help_arroz_title),
                        R.drawable.arroz_help,
                        Resources.getSystem().getString(R.string.help_arroz_oniguiri))
                )
            ),

            ////////////////////////////////////////**********************//////////////////////////
            //////////////RECETAS DE BEBIDAS////////////////////////////////

            Recipe(
                Resources.getSystem().getString(R.string.title_agua_jamaica_natural),
                R.drawable.agua_jamaica_natural,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.flor_jamaica_1tz)),
                    Ingredient(Resources.getSystem().getString(R.string.agua_12tz)),
                    Ingredient(Resources.getSystem().getString(R.string.azucar_stevia_al_gusto)),
                    Ingredient(Resources.getSystem().getString(R.string.hielo))),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.agua_jamaica_natural_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_limonada_frutos_rojos),
                R.drawable.limonada_frutos_rojos,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.frutos_rojos_congelados_1tz)),
                    Ingredient(Resources.getSystem().getString(R.string.jugo_limon_1_4tz)),
                    Ingredient(Resources.getSystem().getString(R.string.jarabe_natural_1cda)),
                    Ingredient(Resources.getSystem().getString(R.string.agua_agua_mineral_1tz)),
                    Ingredient(Resources.getSystem().getString(R.string.hielo))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.hojas_menta))
                ),
                Resources.getSystem().getString(R.string.limonada_frutos_rojos_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_latte_fresa_te_verde),
                R.drawable.latte_fresa_te_verde,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.fresas_congeladas_6pz)),
                    Ingredient(Resources.getSystem().getString(R.string.azucar_1cda)),
                    Ingredient(Resources.getSystem().getString(R.string.taza_leche_1)),
                    Ingredient(Resources.getSystem().getString(R.string.te_verde_polvo_1cda)),
                    Ingredient(Resources.getSystem().getString(R.string.agua_caliente_1_4tz)),
                    Ingredient(Resources.getSystem().getString(R.string.hielo))
                ),
                arrayListOf(Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.fresas_frescas))
                ),
                Resources.getSystem().getString(R.string.latte_fresa_te_verde_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_latte_cafe_baileys),
                R.drawable.cafe_baileys,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.licor_cafe_30ml)),
                    Ingredient(Resources.getSystem().getString(R.string.hielo)),
                    Ingredient(Resources.getSystem().getString(R.string.baileys_30ml)),
                    Ingredient(Resources.getSystem().getString(R.string.crema_leche_30ml))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.consentrado_jugo_limon))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.crema_batida)),
                    Ingredient(Resources.getSystem().getString(R.string.nuez_moscada_polvo))
                ),
                Resources.getSystem().getString(R.string.latte_cafe_baileys_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_licuado_pina_platano_coco),
                R.drawable.licuado_piana_platano,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.ralladura_coco_1_2tz)),
                    Ingredient(Resources.getSystem().getString(R.string.leche_coco_1_2tz)),
                    Ingredient(Resources.getSystem().getString(R.string.pina_pelada_1_2tz)),
                    Ingredient(Resources.getSystem().getString(R.string.platano_1)),
                    Ingredient(Resources.getSystem().getString(R.string.azucar_4cda)),
                    Ingredient(Resources.getSystem().getString(R.string.leche_1tz)),
                    Ingredient(Resources.getSystem().getString(R.string.canela_molida_1cda))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.licuado_pina_platano_coco_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_licuado_oreo_chocolate),
                R.drawable.licuado_oreo,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.chocolate_liquido)),
                    Ingredient(Resources.getSystem().getString(R.string.galletas_chocolate_6pz)),
                    Ingredient(Resources.getSystem().getString(R.string.leche_1_1_2tz)),
                    Ingredient(Resources.getSystem().getString(R.string.helado_vainilla_1tz))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.licuado_ore_chocolate_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_licuado_duraazno_fresa_platano),
                R.drawable.licuado_fresa_durasno,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.leche_2tz)),
                    Ingredient(Resources.getSystem().getString(R.string.fresa_125g)),
                    Ingredient(Resources.getSystem().getString(R.string.durazno_100g)),
                    Ingredient(Resources.getSystem().getString(R.string.platano_1)),
                    Ingredient(Resources.getSystem().getString(R.string.azucar_2cda)),
                    Ingredient(Resources.getSystem().getString(R.string.naranja_jugo_1_2pz))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.licuado_durazno_fresa_platano_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_licuado_mamey_nuez),
                R.drawable.licuado_mamey_nuez,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.mamey_1_2pz)),
                    Ingredient(Resources.getSystem().getString(R.string.leche_2tz)),
                    Ingredient(Resources.getSystem().getString(R.string.azucar_3cds)),
                    Ingredient(Resources.getSystem().getString(R.string.nueces_1_4_tza)),
                    Ingredient(Resources.getSystem().getString(R.string.canela_molida_1_2cda))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.licuado_mamey_nuez_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_licuado_mango_crema_coco),
                R.drawable.licuado_mango_crema_coco,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.mango_1tz)),
                    Ingredient(Resources.getSystem().getString(R.string.crema_coco_1tz)),
                    Ingredient(Resources.getSystem().getString(R.string.yogurt_natural_1tz)),
                    Ingredient(Resources.getSystem().getString(R.string.hielo)),
                    Ingredient(Resources.getSystem().getString(R.string.chichitos_colores_1_2tz)),
                    Ingredient(Resources.getSystem().getString(R.string.azucar_glas)),
                    Ingredient(Resources.getSystem().getString(R.string.agua_1cda))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.licuado_mango_crema_coco_preparation),
                arrayListOf(
                    Help("Sin sugerencias",
                        R.drawable.ic_help_null,
                        "No hay sugerencias disponibles")
                )

            ///*/*/*/**//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*
                             // RECETA DE DESAYUNOS
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_omelette_jamon_queso),
                R.drawable.omelette_jamon_queso,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.huevos_2)),
                    Ingredient(Resources.getSystem().getString(R.string.rebanada_pechuga_pollo_rostizada)),
                    Ingredient(Resources.getSystem().getString(R.string.queso_manchego_2)),
                    Ingredient(Resources.getSystem().getString(R.string.rebanada_jitomate_bola_3)),
                    Ingredient(Resources.getSystem().getString(R.string.rebanada_aguacate_3)),
                    Ingredient(Resources.getSystem().getString(R.string.sal_grano_cda_1_2)),
                    Ingredient(Resources.getSystem().getString(R.string.aceite_canola_cda)),
                    Ingredient(Resources.getSystem().getString(R.string.mantequilla_cda_1_2)),
                    Ingredient(Resources.getSystem().getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.omelette_jamon_queso_preparation),
                arrayListOf(
                    Help(
                       Resources.getSystem().getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                       Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_huevos_estilo_amelia),
                R.drawable.huevos_amelia,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.huevos_2)),
                    Ingredient(Resources.getSystem().getString(R.string.rebanas_pan_caja_2)),
                    Ingredient(Resources.getSystem().getString(R.string.sal_pimineta_gusto)),
                    Ingredient(Resources.getSystem().getString(R.string.mantequilla)),
                    Ingredient(Resources.getSystem().getString(R.string.miel_abeja))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.huevos_amelia_preparation),
                arrayListOf(
                    Help(Resources.getSystem().getString(R.string.no_help_suggestion),
                        R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_huevos_lugo_lopez),
                R.drawable.huevos_lugo_lopez,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.huevos_4)),
                    Ingredient(Resources.getSystem().getString(R.string.cebolla_blanca_picada_1)),
                    Ingredient(Resources.getSystem().getString(R.string.jitomate_picado_cubos_1)),
                    Ingredient(Resources.getSystem().getString(R.string.papa_cortada_cubos_1)),
                    Ingredient(Resources.getSystem().getString(R.string.rebanadas_jamon_triangulos_2)),
                    Ingredient(Resources.getSystem().getString(R.string.queso_oaxaca_20g)),
                    Ingredient(Resources.getSystem().getString(R.string.aceite_cda_5)),
                    Ingredient(Resources.getSystem().getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.huevos_kuego_lopez_preparation),
                arrayListOf(
                    Help(
                        Resources.getSystem().getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_huevos_salsa_jitomate),
                R.drawable.huevos_salsa_jitomate,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.huevos_4)),
                    Ingredient(Resources.getSystem().getString(R.string.jitomates_cortados_4_3)),
                    Ingredient(Resources.getSystem().getString(R.string.cebolla_1_4)),
                    Ingredient(Resources.getSystem().getString(R.string.ajo_1)),
                    Ingredient(Resources.getSystem().getString(R.string.manojo_cilantro_1_8)),
                    Ingredient(Resources.getSystem().getString(R.string.cucharadas_aceite_2)),
                    Ingredient(Resources.getSystem().getString(R.string.agua_50ml)),
                    Ingredient(Resources.getSystem().getString(R.string.mantequilla_2_cda))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.pure_tomate_tp))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.chiles_serranos_2))
                ),
                Resources.getSystem().getString(R.string.huevos_salsa_jitomate_preparation),
                arrayListOf(
                    Help(
                        Resources.getSystem().getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_chilaquiles_rojos_verdes),
                R.drawable.chilaquiles,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.totopos_500gr)),
                    Ingredient(Resources.getSystem().getString(R.string.tomate_verde_1kg)),
                    Ingredient(Resources.getSystem().getString(R.string.cebolla)),
                    Ingredient(Resources.getSystem().getString(R.string.chiles_serranos_2)),
                    Ingredient(Resources.getSystem().getString(R.string.manojo_cilantro_1_8)),
                    Ingredient(Resources.getSystem().getString(R.string.cebolla_blanca_picada_1)),
                    Ingredient(Resources.getSystem().getString(R.string.queso_panela_manchego_100gr)),
                    Ingredient(Resources.getSystem().getString(R.string.cucharadas_aceite_2)),
                    Ingredient(Resources.getSystem().getString(R.string.sal_pimineta_gusto)),
                    Ingredient(Resources.getSystem().getString(R.string.ajo_1))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.chilaquiles_preparation),
                arrayListOf(
                    Help(Resources.getSystem().getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_enfrijoladas),
                R.drawable.enfrijoladas,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.huevos_4)),
                    Ingredient(Resources.getSystem().getString(R.string.jitomate_picado_cubos_1)),
                    Ingredient(Resources.getSystem().getString(R.string.cebolla_blanca_picada_1)),
                    Ingredient(Resources.getSystem().getString(R.string.chile_cuaresmeno_jilianas_1)),
                    Ingredient(Resources.getSystem().getString(R.string.bolsa_frijoles_refritos_1)),
                    Ingredient(Resources.getSystem().getString(R.string.manojo_cilantro_1_8)),
                    Ingredient(Resources.getSystem().getString(R.string.longaniza_100gr)),
                    Ingredient(Resources.getSystem().getString(R.string.crema)),
                    Ingredient(Resources.getSystem().getString(R.string.cucharadas_aceite_2)),
                    Ingredient(Resources.getSystem().getString(R.string.agua)),
                    Ingredient(Resources.getSystem().getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.enfrijoladas_preparation),
                arrayListOf(
                    Help(Resources.getSystem().getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_avocado_toast),
                R.drawable.avocado_toas,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.rebanas_pan_caja_2)),
                    Ingredient(Resources.getSystem().getString(R.string.blanco_integral_centeno)),
                    Ingredient(Resources.getSystem().getString(R.string.aguacate)),
                    Ingredient(Resources.getSystem().getString(R.string.huevos_2)),
                    Ingredient(Resources.getSystem().getString(R.string.limon)),
                    Ingredient(Resources.getSystem().getString(R.string.jitomate_1)),
                    Ingredient(Resources.getSystem().getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.avocado_toas_preparation),
                arrayListOf(
                    Help(Resources.getSystem().getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_omurice),
                R.drawable.omurice,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.huevos_2)),
                    Ingredient(Resources.getSystem().getString(R.string.cebolla_cambray_1)),
                    Ingredient(Resources.getSystem().getString(R.string.mantequilla_cda_1)),
                    Ingredient(Resources.getSystem().getString(R.string.taza_arroz_vapor_1_2)),
                    Ingredient(Resources.getSystem().getString(R.string.agua)),
                    Ingredient(Resources.getSystem().getString(R.string.catsup)),
                    Ingredient(Resources.getSystem().getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.omurice_preparation),
                arrayListOf(
                    Help(Resources.getSystem().getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_omelette_espinacas),
                R.drawable.omelette_espinaca,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.huevos_2)),
                    Ingredient(Resources.getSystem().getString(R.string.leche_10ml)),
                    Ingredient(Resources.getSystem().getString(R.string.manojo_espinacas)),
                    Ingredient(Resources.getSystem().getString(R.string.queso_manchego_cabra)),
                    Ingredient(Resources.getSystem().getString(R.string.jamon)),
                    Ingredient(Resources.getSystem().getString(R.string.mantequilla_cda_1)),
                    Ingredient(Resources.getSystem().getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.espinacas_bolsa)),
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.omelette_espinacas_preparation),
                arrayListOf(
                    Help(Resources.getSystem().getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))

                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_omelette_champinones),
                R.drawable.omelette_champinones,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.huevos_2)),
                    Ingredient(Resources.getSystem().getString(R.string.leche_10ml)),
                    Ingredient(Resources.getSystem().getString(R.string.champinones_250)),
                    Ingredient(Resources.getSystem().getString(R.string.queso_manchego_2)),
                    Ingredient(Resources.getSystem().getString(R.string.cebolla_picada_1_4)),
                    Ingredient(Resources.getSystem().getString(R.string.jamon)),
                    Ingredient(Resources.getSystem().getString(R.string.mantequilla_cda_1)),
                    Ingredient(Resources.getSystem().getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.lata_champinones_rev))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.omelette_champinones_preparation),
                arrayListOf(
                    Help(Resources.getSystem().getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_huevo_salchicha),
                R.drawable.huevo_salchicha,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.huevos_2)),
                    Ingredient(Resources.getSystem().getString(R.string.leche_10ml)),
                    Ingredient(Resources.getSystem().getString(R.string.salchichas_2)),
                    Ingredient(Resources.getSystem().getString(R.string.mantequilla_cda_1)),
                    Ingredient(Resources.getSystem().getString(R.string.sal_pimineta_gusto))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.catsup)),
                    Ingredient(Resources.getSystem().getString(R.string.tortillas))
                ),
                Resources.getSystem().getString(R.string.huevos_salchicha_preparation),
                arrayListOf(
                    Help(Resources.getSystem().getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            //*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
        //*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/* RECETAS DE ENSALADA              //*/*/*/*/*/*/

            Recipe(
                Resources.getSystem().getString(R.string.title_ensalada_col_mostaza_miel),
                R.drawable.ensalada_col_mostaza,
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.huevo_1)),
                    Ingredient(Resources.getSystem().getString(R.string.mostaza_miel_1cda)),
                    Ingredient(Resources.getSystem().getString(R.string.aceite_girasol_250ml)),
                    Ingredient(Resources.getSystem().getString(R.string.coco_rayado_60g)),
                    Ingredient(Resources.getSystem().getString(R.string.agua_fria)),
                    Ingredient(Resources.getSystem().getString(R.string.col_morada_ch_1_2)),
                    Ingredient(Resources.getSystem().getString(R.string.col_blanca_ch_1_2)),
                    Ingredient(Resources.getSystem().getString(R.string.zanahorias_5)),
                    Ingredient(Resources.getSystem().getString(R.string.sal_gusto))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_subtitutes))
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.preparation_ensalada_col_mostaza_miel),
                arrayListOf(
                    Help(Resources.getSystem().getString(R.string.no_help_suggestion), R.drawable.ic_help_null,
                        Resources.getSystem().getString(R.string.no_help_suggestion_description))
                )
            ),
            Recipe(
                Resources.getSystem().getString(R.string.title_ensalada_verde_burrata),
                R.drawable.ensalada_burrata,
                arrayListOf(
                    Ingredient("sopa de municion 220g"),
                    Ingredient("vinagre balsámico"),
                    Ingredient(Resources.getSystem().getString(R.string.medio_manojo_menta)),
                    Ingredient("100g de espinaca"),
                    Ingredient("250g de chicharos cocidos"),
                    Ingredient("1 pieza de burrata"),
                ),
                arrayListOf(
                    Ingredient("chicharos en lata"),
                    Ingredient("chicharos congelados"),
                    Ingredient("espinaca baby en bolsa"),
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.preparation_ensalada_verde_burrata),
                arrayListOf(
                    Help("Concer Pasta", R.drawable.pasta_help,
                        Resources.getSystem().getString(R.string.help_pasta_preparation))
                )
            ),
            Recipe(
                "Ensalada de Salmón con Cítricos",
                R.drawable.ensalada_salon_citricos,
                arrayListOf(
                    Ingredient("4 rebanadas de salmón ahumado"),
                    Ingredient("1 limon amarillo"),
                    Ingredient("6 mandarinas"),
                    Ingredient("2 aguacates"),
                    Ingredient("1 manojo de cebolla cambray (Solo los tallos)"),
                    Ingredient("½ granada (Solo los dientes)"),
                    Ingredient("100g de mezcla de lechugas"),
                    Ingredient("2 cucharadas de miel"),
                    Ingredient("sal y pimienta"),
                ),
                arrayListOf(
                    Ingredient("salmón en agua (sobre o lata)")
                ),
                arrayListOf(
                    Ingredient(Resources.getSystem().getString(R.string.no_optios))
                ),
                Resources.getSystem().getString(R.string.preparation_ensalada_salmon_citricos),
                arrayListOf(
                    Help(
                        "Concer Pasta",
                        R.drawable.pasta_help,
                        Resources.getSystem().getString(R.string.help_pasta_preparation)
                    )
                )
            )

        )
    }
}