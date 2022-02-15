package com.example.taskinappssquer.Fragemts

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.taskinappssquer.R
import com.example.taskinappssquer.databinding.FragmentTaskOneBinding

class FragmentTaskOne : Fragment() {
    private lateinit var binding: FragmentTaskOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentTaskOneBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.TaskOneBtn.setOnClickListener {
            binding.show.text="Ninja Islam Ragab :)"
        }



    }

}