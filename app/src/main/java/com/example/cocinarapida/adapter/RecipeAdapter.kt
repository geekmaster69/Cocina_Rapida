package com.example.cocinarapida.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cocinarapida.R
import com.example.cocinarapida.Recipe
import com.example.cocinarapida.databinding.ItemRecipeBinding

class RecipeAdapter(var recipeList: ArrayList<Recipe>, private val listener: ReceipeClickListener):
RecyclerView.Adapter<RecipeAdapter.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe,parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recipe = recipeList[position]

        holder.binding.tvRecipe.text = recipe.title

        holder.setListener(recipe)
    }

    override fun getItemCount(): Int = recipeList.size

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val binding = ItemRecipeBinding.bind(view)

        fun setListener(recipe: Recipe){
            binding.root.setOnClickListener {
                listener.recipeOnClickListener(recipe)
            }
        }
    }
}