package com.hebat.sibat.sibat.ui.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BerandaFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity?.title = getString(com.hebat.sibat.sibat.R.string.title_beranda)
        val view = inflater.inflate(com.hebat.sibat.sibat.R.layout.beranda_fragment, container, false)
        return view
    }


}
