package ru.netology.statsview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.statsview.ui.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<StatsView>(R.id.statsView).data = listOf<StatsView.CustomArc>(
//            0.25F,
//            0.25F,
//            0.25F,
//            0.25F,
//            100F,
//            200F,
//            300F,
//            400F,
//            500F,
            // входные данные в виде пар элементов (a, b), где а - длина дуги, b - признак видимости дуги.
            StatsView.CustomArc(100F, 1),
            StatsView.CustomArc(200F, 0),
            StatsView.CustomArc(300F, 1),
            StatsView.CustomArc(400F, 0),
        )
    }
}