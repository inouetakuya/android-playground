package info.inouetakuya.androidplayground

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getOmikujiButton.setOnClickListener {
            // Log.v("MainActivity", "Button clicked")
            val results = arrayOf("大吉", "中吉", "吉", "小吉", "凶")
            val n = Random.nextInt(results.count())
            if (n == 0) {
                // resultTextView.setTextColor(Color.RED)
                // resultTextView.setTextColor(Color.parseColor("#ff0000"))
                resultTextView.setTextColor(Color.argb(255, 255, 0, 0))
            } else {
                resultTextView.setTextColor(Color.parseColor("#000000"))
            }
            resultTextView.text = results[n]
        }
    }
}
