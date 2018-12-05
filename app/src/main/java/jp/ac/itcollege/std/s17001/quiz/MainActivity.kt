package jp.ac.itcollege.std.s17001.quiz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        normal.setOnClickListener{
            val dif_normal = Intent(this,NormalActivity::class.java)
            startActivity(dif_normal)
        }

        hard.setOnClickListener{
            val dif_hard = Intent(this,HardActivity::class.java)
            startActivity(dif_hard)
        }

        no_order.setOnClickListener{
            val nogenre = Intent(this,NogenreActivity::class.java)
            startActivity(nogenre)
        }
    }
}
