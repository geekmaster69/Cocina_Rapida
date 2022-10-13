package com.example.cocinarapida

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cocinarapida.databinding.ItemHelperBinding

class HelpAdapter(var helpList: ArrayList<Help>, private val listener: OnClickListenerHelper):RecyclerView.Adapter<HelpAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_helper,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val help = helpList.get(position)
        holder.binding.tvHelper.text = help.helpText
        holder.binding.imgHelper.setImageResource(help.imgHelper)

    }

    override fun getItemCount(): Int = helpList.size

    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val binding = ItemHelperBinding.bind(view)
    }
}