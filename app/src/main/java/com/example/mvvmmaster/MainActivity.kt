package com.example.mvvmmaster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmmaster.databinding.ActivityMainBinding
import com.example.mvvmmaster.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
private lateinit var viewModel: MainViewModel
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel= ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.viewModel = viewModel
button.setOnClickListener { unit->
    viewModel.justCreateATest("changedBBu")

}
    }
}
