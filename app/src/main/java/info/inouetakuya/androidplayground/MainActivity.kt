package info.inouetakuya.androidplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getOmikujiButton.setOnClickListener {
            Log.v("MainActivity", "Button clicked")
            val n = Random.nextInt(3)
            resultTextView.text = n.toString()
        }
    }
}
