package com.example.taskinappssquer.Fragemts

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.countryapi.MainViewModel
import com.example.retrofittest.MainViewModelFactory
import com.example.taskinappssquer.Adapter.ProductAdapter
import com.example.taskinappssquer.Model.ProductModel
import com.example.taskinappssquer.R
import com.example.taskinappssquer.Reposatory.Repository
import com.example.taskinappssquer.databinding.FragmentTaskFourBinding


class FragmentTaskFour : Fragment() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentTaskFourBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTaskFourBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecycler()
        GetProduct()
        binding.TaskFFAddBtn.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentTaskFour_to_fragmentAdd)

        }
    }

    private fun setRecycler() {
        var arrayList: ArrayList<ProductModel> = arrayListOf()
        arrayList.add(ProductModel(5, "islam ragab", 10, 100, 6, "any"))
        arrayList.add(ProductModel(5, "islam ragab", 10, 100, 6, "any"))
        arrayList.add(ProductModel(5, "islam ragab", 10, 100, 6, "any"))
        arrayList.add(ProductModel(5, "islam ragab", 10, 100, 6, "any"))
        arrayList.add(ProductModel(5, "islam ragab", 10, 100, 6, "any"))
        arrayList.add(ProductModel(5, "islam ragab", 10, 100, 6, "any"))
        arrayList.add(ProductModel(5, "islam ragab", 10, 100, 6, "any"))
        arrayList.add(ProductModel(5, "islam ragab", 10, 100, 6, "any"))

        val ProductAdapter = ProductAdapter(arrayList)
        binding.FTask3RecyclerView.adapter = ProductAdapter
        binding.FTask3RecyclerView.layoutManager =
            GridLayoutManager(context, 2, LinearLayoutManager.VERTICAL, false)
        binding.FTask3RecyclerView.setHasFixedSize(true)

    }

    private fun GetProduct() {
        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        Log.d("ProdcutBefor", viewModel.toString())
        viewModel.getProducts()
        Log.d("ProdcutAftar", viewModel.toString())
        viewModel.myResponse.observe(viewLifecycleOwner, Observer { response ->
            if (response.isSuccessful) {
                Log.d("Prodcut", response.body().toString())
                Toast.makeText(context, "reponce${response.body()}", Toast.LENGTH_LONG).show()
            } else
                Toast.makeText(context, "reponce${response.code()}", Toast.LENGTH_LONG).show()
            Log.d("ProdcutFailed", response.code().toString())


        })
    }

}