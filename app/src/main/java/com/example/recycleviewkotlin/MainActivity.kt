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
            "Kim Jong Un set to launch ICBM in pacific ocean",
            "Modi Announces Bold Economic Reforms to Accelerate India's Growth",
            "Putin Engages in High-Level Diplomatic Talks to Strengthen Russia's Global Influence",
            "Xi Jinping Unveils Ambitious Plans for China's Technological Advancement",
            "Imran Khan Spearheads Initiatives to Foster Peace and Stability in South Asia",
            "Olaf Scholz Assumes Office as Germany's New Chancellor, Pledges Progressive Agenda",
            "Justin Trudeau Implements Climate Change Policies to Combat Environmental Challenges",
            "Fumio Kishida Takes Charge as Japan's Prime Minister, Focuses on Economic Revitalization",
            "Rishi Sunak Unveils Comprehensive Budget Plans to Support UK's Post-Pandemic Recovery",
            "Erdogan Makes Bold Moves to Cement Turkey's Position on the Global Stage"


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