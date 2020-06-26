package com.example.android.navdrawer

import android.view.LayoutInflater
import android.view.View
import androidx.test.platform.app.InstrumentationRegistry
import com.facebook.testing.screenshot.Screenshot
import com.facebook.testing.screenshot.ViewHelpers
import org.junit.Test


class MyTests {
    @Test
    fun doScreenshot() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        val inflater = LayoutInflater.from(appContext)
        val view: View = inflater.inflate(R.layout.activity_main, null, false)

        ViewHelpers.setupView(view)
            .setExactWidthDp(300)
            .layout()

        Screenshot.snap(view)
            .record()
    }
}