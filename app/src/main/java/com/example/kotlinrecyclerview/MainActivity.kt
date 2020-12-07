package com.example.kotlinrecyclerview
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val  users = ArrayList<UserModel>()
    val adapter = AdapterClass(users)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  recyclerView = findViewById<RecyclerView>(R.id.recyclerview_id)
        recyclerView.layoutManager = LinearLayoutManager(this)

        users.add(UserModel("Narasimha","Android Developer"))
        users.add(UserModel("Megastar","Telugu Filim Actor"))
        users.add(UserModel("JamesGosling","C Developer "))
        users.add(UserModel("Narasimha","Android Developer"))
        users.add(UserModel("Narasimha","Android Developer"))
        users.add(UserModel("Narasimha","Android Developer"))
        users.add(UserModel("Narasimha","Android Developer"))
        users.add(UserModel("Megastar","Telugu Filim Actor"))
        users.add(UserModel("JamesGosling","C Developer "))
        users.add(UserModel("Narasimha","Android Developer"))
        users.add(UserModel("Narasimha","Android Developer"))
        users.add(UserModel("Narasimha","Android Developer"))
        users.add(UserModel("Narasimha","Android Developer"))
        users.add(UserModel("Megastar","Telugu Filim Actor"))
        users.add(UserModel("JamesGosling","C Developer "))
        users.add(UserModel("Narasimha","Android Developer"))
        users.add(UserModel("Narasimha","Android Developer"))
        users.add(UserModel("Narasimha","Android Developer"))

        recyclerView.adapter = adapter

    }
}