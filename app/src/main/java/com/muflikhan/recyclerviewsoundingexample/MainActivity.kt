package com.muflikhan.recyclerviewsoundingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namaBuah = arrayOf("Apple", "Banana", "Orange", "Rambutan", "Watermelon")
        val gambarBuah = arrayOf(
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.orange,
            R.drawable.rambutan,
            R.drawable.watermelon
        )
        val suaraBuah = arrayOf(
            R.raw.apple,
            R.raw.banana,
            R.raw.orange,
            R.raw.rambutan,
            R.raw.watermelon
        )

        val buahAdapter = BuahAdapter(namaBuah, gambarBuah, suaraBuah)
        rv_buah.apply {
//            layoutManager = LinearLayoutManager(this@MainActivity)
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            setHasFixedSize(true)
            adapter = buahAdapter
        }
    }
}