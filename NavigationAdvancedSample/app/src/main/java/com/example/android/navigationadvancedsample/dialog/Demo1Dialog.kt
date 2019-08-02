package com.example.android.navigationadvancedsample.dialog

import android.annotation.SuppressLint
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.example.android.navigationadvancedsample.R
import kotlinx.android.synthetic.main.dialog_demo1.*


/**
 * @author yyf
 * @since 08-01-2019
 */
class Demo1Dialog : DialogFragment() {

    @SuppressLint("InflateParams")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dialog?.apply {
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            window?.setBackgroundDrawable(ColorDrawable(0))
        }
        return inflater.inflate(R.layout.dialog_demo1, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        about_tv.setOnClickListener {
//            findNavController().navigate()
        }
    }
}