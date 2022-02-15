package com.example.taskinappssquer.Fragemts

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.countryapi.MainViewModel
import com.example.retrofittest.MainViewModelFactory
import com.example.taskinappssquer.Model.ProductModel
import com.example.taskinappssquer.R
import com.example.taskinappssquer.Reposatory.Repository
import com.example.taskinappssquer.databinding.FragmentAddBinding


class FragmentAdd : Fragment() {
    private lateinit var binding: FragmentAddBinding
    private lateinit var viewModel: MainViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (Valid()) {
            binding.AddFBtn.setOnClickListener {
                var pr =(binding.AddFPrice.text)
                var am=binding.AddFAmount.text

                PushProduct(binding.AddFName.text.toString(),pr as Int,am as Int )
                findNavController().navigate(R.id.action_fragmentAdd_to_fragmentTaskFour)
            }

        }

    }

    fun Valid(): Boolean {
        var valid = false
        if (!TextUtils.isEmpty(
                binding.AddFName.text.toString().trim()
            ) && TextUtils.isEmpty(binding.AddFPrice.text.toString().trim())
            && TextUtils.isEmpty(binding.AddFAmount.text.toString().trim())
        ) {
            valid = true
        } else
            valid = false
        return valid
    }

    fun PushProduct(name: String, price: Int, amount: Int): Boolean {
        var doon = false
        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.pushProduct(ProductModel(222,name,price,amount,1000,"ssss"))
        viewModel.PushmyResponse.observe(viewLifecycleOwner, Observer { responce ->
            if (responce.isSuccessful)
            {
                doon=true
            }

        })

        return doon
    }

}