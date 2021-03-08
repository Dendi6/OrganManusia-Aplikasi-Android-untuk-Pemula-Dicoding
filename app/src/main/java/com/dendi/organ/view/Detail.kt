package com.dendi.organ.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dendi.organ.R

class Detail : AppCompatActivity() {
    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_LATINNAME = "extra_latinName"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val actionbar = supportActionBar
        actionbar!!.title = " "
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvImageDetail:ImageView = findViewById(R.id.image_detail)
        val tvTitleDetail:TextView = findViewById(R.id.title_detail)
        val tvLatinTitle:TextView = findViewById(R.id.latinName_Detail)
        val tvDetailView:TextView = findViewById(R.id.detail_Organ)

        val dataImage = intent.getIntExtra(EXTRA_IMAGE,0)
        val dataTitle = intent.getStringExtra(EXTRA_NAME)
        val dataLatin = intent.getStringExtra(EXTRA_LATINNAME)
        val dataDetail = intent.getStringExtra(EXTRA_DETAIL)

        tvTitleDetail.text = dataTitle
        Glide.with(this)
                .load(dataImage)
                .apply(RequestOptions())
                .into(tvImageDetail)
        tvLatinTitle.text = dataLatin
        tvDetailView.text = dataDetail
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}