package com.kotlinapp.swiggyclone.homeScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kotlinapp.swiggyclone.R
import com.kotlinapp.swiggyclone.databinding.ActivityHomeBinding
import com.kotlinapp.swiggyclone.homeScreen.adapters.SwiggyServiceAdapter
import com.kotlinapp.swiggyclone.userAccount.UserAccountFragment
import com.kotlinapp.swiggyclone.utils.FragmentUtils

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Replacing the home Fragment the home Fragment
        var fragmentUtils = FragmentUtils()
        fragmentUtils.addFragmentBackStack(supportFragmentManager,R.id.mainHomeContainer,HomeFragment(),HomeFragment().tagFragment,true)
        binding.btnUserAccount.setOnClickListener {

            fragmentUtils.addFragmentBackStack(supportFragmentManager,R.id.mainHomeContainer,UserAccountFragment(),UserAccountFragment().tagFragment,true)

        }


    }

    fun initViewStatic(): List<String>{

        var list = mutableListOf<String>()
        list.add("Food")
        list.add("Insta Mart")
        list.add("Genie")
        return list


    }
}