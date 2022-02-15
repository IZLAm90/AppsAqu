package com.example.taskinappssquer.Fragemts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.taskinappssquer.R
import com.example.taskinappssquer.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMainBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.MainFTaskOne.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_fragmentTaskOne)
        }
        binding.MainFTaskTwo.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_fragmentTasktwo)
        }
        binding.MainFTask3.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_fragmentTaskFour)
        }


        super.onViewCreated(view, savedInstanceState)
    }

}