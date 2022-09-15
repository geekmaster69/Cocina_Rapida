package com.example.cocinarapida

import android.widget.ListAdapter
import android.widget.ListView

object ListHelper {
    fun getListViewSize(myListView: ListView){
        val myListAdapter: ListAdapter = myListView.adapter
            ?:
            return

        var totalheight = 0
        for (size in 0 until myListAdapter.count){
            val listItem = myListAdapter.getView(size, null, myListView)
            listItem.measure(0, 0, )
            totalheight += listItem.measuredHeight
        }

        val params = myListView.layoutParams
        params.height = totalheight + myListView.dividerHeight * (myListAdapter.count - 1)
        myListView.layoutParams = params
    }
}