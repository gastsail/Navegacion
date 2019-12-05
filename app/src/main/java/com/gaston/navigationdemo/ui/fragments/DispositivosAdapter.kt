package com.gaston.navigationdemo.ui.fragments

import com.gaston.navigationdemo.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * Created by Gastón Saillén on 05 December 2019
 */
class DispositivosAdapter(val context: Context):BaseAdapter() {

    private var nameList = arrayOf("Jose", "Gaston","Pablo","Elias")

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View?
        val vh: ListRowHolder
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, convertView, false)
            vh = ListRowHolder(view)
            view.tag = vh
        } else {
            view = convertView
            vh = view.tag as ListRowHolder
        }

        vh.textNombre.text = nameList[position]
        return view!!
    }

    override fun getItem(position: Int): String {
        return nameList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return nameList.size
    }

    inner class ListRowHolder(view:View){
        val textNombre: TextView = view.findViewById(R.id.txt_nombres) as TextView
    }
}