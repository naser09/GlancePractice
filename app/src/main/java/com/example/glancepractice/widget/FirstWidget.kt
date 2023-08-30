package com.example.glancepractice.widget

import android.content.Context
import android.graphics.drawable.Icon
import android.os.Build
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.Image
import androidx.glance.ImageProvider
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.appwidget.appWidgetBackground
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.Column
import androidx.glance.layout.fillMaxSize
import androidx.glance.text.Text
import com.example.glancepractice.MainActivity
import com.example.glancepractice.R

class FirstWidgetReceiver:GlanceAppWidgetReceiver(){
    override val glanceAppWidget: GlanceAppWidget
        get() = FirstWidget
}
object FirstWidget :GlanceAppWidget(){
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            Column(modifier = GlanceModifier.fillMaxSize().appWidgetBackground()) {
                Text(text = "First Widget")
                Button(text = "Button", onClick = actionStartActivity(MainActivity::class.java))
            }
        }
    }

}