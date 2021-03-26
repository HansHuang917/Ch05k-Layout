package tw.tcnr28.m0501
//import android.R//註解這行就不會紅了
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener
import androidx.appcompat.app.AppCompatActivity





class M0501 : AppCompatActivity() {
    private var a001: Spinner? = null
    private var e001: EditText? = null
    private var b001: Button? = null
    private var f000: TextView? = null
    private var gender: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0501)
        setupViewcomponent()
    }

    private fun setupViewcomponent() {
        a001 = findViewById<View>(R.id.m0501_a001) as Spinner
        e001 = findViewById<View>(R.id.m0501_e001) as EditText
        b001 = findViewById<View>(R.id.m0501_b001) as Button
        f000 = findViewById<View>(R.id.m0501_f000) as TextView
        b001!!.setOnClickListener(b01on)
        val adapterSex =
            ArrayAdapter.createFromResource(this, R.array.m0501_a001, android.R.layout.simple_list_item_1)
        adapterSex.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        a001!!.adapter = adapterSex
        a001!!.onItemSelectedListener = a001on
    }

    private val a001on: OnItemSelectedListener = object : OnItemSelectedListener {
        override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            gender = parent.selectedItem.toString()
        }

        override fun onNothingSelected(parent: AdapterView<*>?) {}
    }
    private val b01on = View.OnClickListener {
        val age = e001!!.text.toString().toInt()
        var sug = getString(R.string.m0501_f000)
        if (e001!!.text.toString().trim { it <= ' ' }.length != 0) {
            sug += if (gender == getString(R.string.chksex)) {
                if (age > 33) {
                    getString(R.string.m0501_f003)
                } else if (age < 28) {
                    getString(R.string.m0501_f001)
                } else {
                    getString(R.string.m0501_f002)
                }
            } else if (age > 30) {
                getString(R.string.m0501_f003)
            } else if (age < 25) {
                getString(R.string.m0501_f001)
            } else {
                getString(R.string.m0501_f002)
            }
            f000!!.text = sug
        } else {
            sug = getString(R.string.nospace) //else { //年齡輸入空白
        }
        f000!!.text = sug
    }
}