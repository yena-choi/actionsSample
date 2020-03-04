package io.yena.actionssample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buildType = BuildConfig.BUILD_TYPE
        val versionCode = BuildConfig.VERSION_CODE
        val versionName= BuildConfig.VERSION_NAME
        val str = """
            buildType : $buildType
            versionCode : $versionCode
            versionName : $versionName
        """.trimIndent()

        textView.text = str
    }
}
