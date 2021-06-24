package com.mindorks.framework.cardview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter
    var listofUsers: ArrayList<User_row> = ArrayList()
    //lateinit var login: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        login = findViewById(R.id.tv_login)
//        login.setOnClickListener {
//            val intent = Intent(this,pic::class.java)
//            startActivity(intent)
//        }

        for (i in 0..6){
            var user = User_row()
            user.id = i
            user.login = "Eyehunt $i"
            listofUsers.add(user)
        }

        recyclerView = findViewById(R.id.recyclerview)
        var LayoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager = LayoutManager
        adapter = MyAdapter(listofUsers)
        recyclerView.adapter = adapter
    }
}