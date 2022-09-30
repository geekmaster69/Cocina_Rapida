package com.example.cocinarapida

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import androidx.recyclerview.widget.RecyclerView
import com.example.cocinarapida.databinding.ItemIngredientListBinding
import com.example.cocinarapida.databinding.ItemRecipeListBinding

class IngredientAdapter(var ingredientList: ArrayList<Ingredient>, private val listener: OnClickListenerIngredient):
    RecyclerView.Adapter<IngredientAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe_list, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ingredient = ingredientList.get(position)
        holder.binding.tvIngredient.text = ingredient.description

    }

    override fun getItemCount(): Int = ingredientList.size

    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val binding = ItemRecipeListBinding.bind(view)
    }
}