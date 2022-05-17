package kr.nepp.androidintent_20220517

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDial.setOnClickListener {

//            1. 어디에 전화를 걸지 번호를 저장
            val inputPhoneNum = edtPhoneNum.text.toString()

//            2. Uri로 전화 연결 정보를 세팅
            val myUri = Uri.parse("tel:${inputPhoneNum}")

//            3. Intent를 액션 종류 + Uri를 결합해서 생성.'
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)

//            4. 실제 화면 이동
            startActivity(myIntent)

        }

        btnCall.setOnClickListener {

            val inputPhoneNum = edtPhoneNum.text.toString()
            val myUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)

        }

    }
}