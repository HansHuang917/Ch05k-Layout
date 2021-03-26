package tw.tcnr28.m0500f

//import android.R//註解這行就不會紅了
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

//import androidx.appcompat.app.AppCompatActivity;
class M0500 : AppCompatActivity() {
    private var a: Int=0;
    private var e001: EditText? = null
//    private var b001: Button? = null
//    private var t003: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0500) //抓取layout xml
        setupViewcomponent()
    }

    private fun setupViewcomponent() {
        e001=findViewById(R.id.m0500_e001) as EditText
        a=0;
    }

//    private fun setupViewcomponent() {
////        設定layout配置
//        e001 = findViewById<View>(R.id.m0500_e001) as EditText //請輸入
//        b001 = findViewById<View>(R.id.m0500_b001) as Button //執行單位換算
//        t003 = findViewById<View>(R.id.m0500_t003) as TextView //換算結果
//        b001!!.setOnClickListener(b001ON) //宣告按鈕的監聽程式
//    }
//
//    private val b001ON = View.OnClickListener {
//        val pondsFormat = DecimalFormat("0.0000") //限制顯示的小數點後位數
//        val pond = pondsFormat.format(e001!!.text.toString().toFloat() * 28.91)
//        //把抓到的公斤數轉成磅數
//        t003!!.text = pond
//    } //    @Override
    //    protected void onCreate(Bundle savedInstanceState) {
    //        super.onCreate(savedInstanceState);
    //        setContentView(R.layout.m0500);
    //    }
}