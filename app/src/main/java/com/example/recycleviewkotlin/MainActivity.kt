package com.example.recycleviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<news>
    lateinit var imageId: Array<Int>
    lateinit var heading : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId= arrayOf(
            R.drawable.kim,
            R.drawable.modi,
            R.drawable.putin,
            R.drawable.xi,
            R.drawable.imrank,
            R.drawable.olaf,
            R.drawable.justin,
            R.drawable.kishida,
            R.drawable.rishi,
            R.drawable.erdigan


        )
        heading= arrayOf(
            "Mai is duniya ka Raja hu, mai to papa hu, Papa, Iss duniya ka Papa",
            "Bhayio aur unki behno, Bhaad mai jao",
            "Tumhare ghar mai bomb fod ke chala jaunga",
            "Ching chong ching, chang chin chin chu chang cho",
            "Sabse pehle aapne ghabrana nahi hai",
            "Mai Hitler ka door ka rishtedaar hu",
            "Mai Kya bolu, mujhe to kuch pata hi nahi hai",
            "Yaar mai chinese nahi hu yaar",
            "Bhai terko 100 baar bol diya Kohinoor mangne mat aajya karo mere paas",
            "Mujhe kya mai to aise hi aa gya list bharne"


        )
        newRecyclerView=findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager=LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList= arrayListOf<news>()
        getUserdata()
    }
    private fun getUserdata(){
        for(i in imageId.indices){

            val news=news(imageId[i], heading[i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter=Myadapter(newArrayList)
    }
}