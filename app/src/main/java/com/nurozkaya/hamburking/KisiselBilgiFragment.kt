package com.nurozkaya.hamburking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_kisisel_bilgi.view.*

class KisiselBilgiFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim= inflater.inflate(R.layout.fragment_kisisel_bilgi, container, false)
        tasarim.toolbarKisiselBilgi.title=""
        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarKisiselBilgi)
        return tasarim
    }
}