package tw.tcnr28.m0502
//import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class M0502 : AppCompatActivity() {
    private var b001: Button? = null
    private var f000: TextView? = null
    private var rb021: RadioButton? = null
    private var rb022: RadioButton? = null
    private var rb023: RadioButton? = null
    private var rb01: RadioGroup? = null
    private var rb02: RadioGroup? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0502)
        setupViewcomponent()
    }

    private fun setupViewcomponent() {
        b001 = findViewById<View>(R.id.m0502_b001) as Button
        f000 = findViewById<View>(R.id.m0502_f000) as TextView //建議
        rb01 = findViewById<View>(R.id.m0502_r001) as RadioGroup //性別
        rb02 = findViewById<View>(R.id.m0502_r002) as RadioGroup //年齡
        rb021 = findViewById<View>(R.id.m0502_r002a) as RadioButton
        rb022 = findViewById<View>(R.id.m0502_r002b) as RadioButton
        rb023 = findViewById<View>(R.id.m0502_r002c) as RadioButton
        b001!!.setOnClickListener(b01on) //監聽按鈕
        rb01!!.setOnCheckedChangeListener(rb01on) //監聽男女按鈕RadioButton
    }

    private val rb01on =
        RadioGroup.OnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.m0502_r001a -> {
                    rb021!!.setText(R.string.m0502_r002aa)
                    rb022!!.setText(R.string.m0502_r002ab)
                    rb023!!.setText(R.string.m0502_r002ac)
                }
                R.id.m0502_r001b -> {
                    rb021!!.setText(R.string.m0502_r002ba)
                    rb022!!.setText(R.string.m0502_r002bb)
                    rb023!!.setText(R.string.m0502_r002bc)
                }
            }
        }
    private val b01on = View.OnClickListener {
        var sug = getString(R.string.m0502_f000)
        val checkSex = rb01!!.checkedRadioButtonId
        when (checkSex) {
            R.id.m0502_r001a -> when (rb02!!.checkedRadioButtonId) {
                R.id.m0502_r002a -> sug += getString(R.string.m0502_f001)
                R.id.m0502_r002b -> sug += getString(R.string.m0502_f002)
                R.id.m0502_r002c -> sug += getString(R.string.m0502_f003)
            }
            R.id.m0502_r001b -> when (rb02!!.checkedRadioButtonId) {
                R.id.m0502_r002a -> sug += getString(R.string.m0502_f004)
                R.id.m0502_r002b -> sug += getString(R.string.m0502_f005)
                R.id.m0502_r002c -> sug += getString(R.string.m0502_f006)
            }
        }
        f000!!.text = sug
    }
}