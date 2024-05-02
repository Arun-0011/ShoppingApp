package com.example.urbanhouse.ui

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat.startActivity
import com.example.urbanhouse.R

class DialogOrderConfirm(
    private var activity: Activity,
) {
    private val dialog = Dialog(activity)

    @SuppressLint("SetTextI18n")
    fun showPopup() {
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dailog_order_confirm)

        val width = WindowManager.LayoutParams.MATCH_PARENT
        val height = WindowManager.LayoutParams.MATCH_PARENT

        dialog.window?.setLayout(width, height)

        val params: WindowManager.LayoutParams = dialog.window!!.attributes
        params.gravity = Gravity.CENTER

        dialog.window?.decorView?.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        dialog.window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        dialog.window?.statusBarColor = Color.WHITE
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val ivBack: AppCompatImageView = dialog.findViewById(R.id.ivBack)

        ivBack.setOnClickListener {
            dialog.dismiss()
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(activity, intent, null)
            activity.finish()
        }
        dialog.show()
    }
}