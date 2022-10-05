package com.example.cocinarapida

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cocinarapida.databinding.ItemRecipeListBinding
import com.example.cocinarapida.databinding.ItemSpeciaBinding

class SpeciaAdapter(var speciasList: ArrayList<Specia>, private val listener: OnClickListenerSpecia):
    RecyclerView.Adapter<SpeciaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_specia, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val specia = speciasList.get(position)
        holder.binding.tvSpecia.text = specia.speciaDescription
        holder.binding.imgSpecia.setImageResource(specia.speciaimgDescription)

        holder.setListener(specia)
    }

    override fun getItemCount(): Int = speciasList.size

    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val binding = ItemSpeciaBinding.bind(view)

        fun setListener(specia: Specia) {
            binding.root.setOnClickListener {
                listener.onLongClick(specia)
            }
        }
    }
}