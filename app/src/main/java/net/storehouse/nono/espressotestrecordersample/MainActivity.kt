package net.storehouse.nono.espressotestrecordersample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isClicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { toggle() }
    }

    private fun toggle() {
        if (isClicked) {
            main_text.text = resources.getString(R.string.main_text_not_clicked)
            main_text2.text = resources.getString(R.string.main_text2_not_clicked)
            main_text2.visibility = View.VISIBLE
            button.text = resources.getString(R.string.button_text_not_clicked)
        } else {
            main_text.text = resources.getString(R.string.main_text_clicked)
            main_text2.text = resources.getString(R.string.main_text2_clicked)
            main_text2.visibility = View.INVISIBLE
            button.text = resources.getString(R.string.button_text_clicked)
        }
        isClicked = !isClicked
    }
}
