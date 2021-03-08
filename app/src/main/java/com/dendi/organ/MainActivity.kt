package com.dendi.organ

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dendi.organ.`object`.DataOrgan
import com.dendi.organ.data.Organ
import com.dendi.organ.view.Detail
import com.dendi.organ.view.OrganViewAdapter
import com.dendi.organ.view.Profil

class MainActivity : AppCompatActivity() {
    private lateinit var rvViews: RecyclerView
    private var listOrgans: ArrayList<Organ> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvViews = findViewById(R.id.rv_heroes)
        rvViews.setHasFixedSize(true)

        listOrgans.addAll(DataOrgan.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvViews.layoutManager = LinearLayoutManager(this)
        val cardViewOrgan = OrganViewAdapter(listOrgans)
        rvViews.adapter = cardViewOrgan

        cardViewOrgan.setOnItemClickCallback(object : OrganViewAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Organ) {
                showOrganSelected(data)
            }
        })

        cardViewOrgan.setOnButtonClickCallback(object : OrganViewAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Organ) {
                sendMessage(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                myProfil()
            }
        }
    }

    private fun myProfil(){
        val intent = Intent(this, Profil::class.java)
        startActivity(intent)
    }

    private fun showOrganSelected(organ: Organ) {
        Toast.makeText(this, "Kamu memilih " + organ.name, Toast.LENGTH_SHORT).show()
        val moveData = Intent(this, Detail::class.java)
        moveData.putExtra(Detail.EXTRA_NAME, organ.name)
        moveData.putExtra(Detail.EXTRA_LATINNAME, organ.latinName)
        moveData.putExtra(Detail.EXTRA_IMAGE, organ.photo)
        moveData.putExtra(Detail.EXTRA_DETAIL, organ.detail)
        startActivity(moveData)
    }

    private fun sendMessage(organ: Organ){
        val judul = organ.name
        val latinName = organ.latinName
        val detail = organ.detail

        val message = "Nama Organ : *$judul*,\nNama Latin : _" + latinName +"_,\n \n$detail"

        val intent = Intent(Intent.ACTION_SEND)
        intent.putExtra(Intent.EXTRA_TEXT, message)
        intent.type = "text/plain"

        startActivity(Intent.createChooser(intent, "Share using .."))
    }
}
