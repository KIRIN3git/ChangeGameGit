package jp.kirin3.changegamegit

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        textGameStart1.text = "aa"

        buttonManial.setOnClickListener(object:View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, ManualActivity::class.java)
                startActivity(intent)
            }
        })
    }


    override fun onResume() {
        super.onResume()



    }
}
