package com.mindorks.framework.cardview

import android.content.Intent
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val List: ArrayList<User_row>): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        internal var tvlogin: TextView

        init {
            tvlogin = itemView.findViewById(R.id.tv_login) as TextView
        }

        override fun onClick(v: View?) {
            itemView.setOnClickListener(this)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        holder.tvlogin.text = List[position].login
    }

    override fun getItemCount(): Int {
        return List.size
    }


}