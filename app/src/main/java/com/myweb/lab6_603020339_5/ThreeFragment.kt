package com.myweb.lab6_603020339_5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_three.view.*

class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_three,container, false)
        view.btnClickFragThree.setOnClickListener(){
            val toast = Toast.makeText(context,"click On fragment Three", Toast.LENGTH_SHORT)
            toast.show()
        }
        return view
    }


}
