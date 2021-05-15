package com.nurozkaya.hamburking

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_arama_sayfa.view.*


class AramaSayfaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim =  inflater.inflate(R.layout.fragment_arama_sayfa, container, false)
        tasarim.toolbarArama.title=""
        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarArama)
        return tasarim
    }


}