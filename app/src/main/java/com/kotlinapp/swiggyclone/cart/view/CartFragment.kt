package com.kotlinapp.swiggyclone.cart.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlinapp.swiggyclone.R
import com.kotlinapp.swiggyclone.cart.view.cartAddress.CartAddressFragment
import com.kotlinapp.swiggyclone.databinding.FragmentCartBinding
import com.kotlinapp.swiggyclone.utils.FragmentUtils

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CartFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CartFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private  lateinit var cartFragmentContext :CartFragment
    private lateinit var binding:FragmentCartBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCartBinding.inflate(inflater,container,false)
        initClicks()

        return binding.root
    }

    private fun initClicks() {
        binding.btnCompleteorder.setOnClickListener {
            FragmentUtils().addFragmentBackStack(requireFragmentManager(),R.id.mainHomeContainer,CartAddressFragment(),CartAddressFragment::class.java.simpleName,true)

        }
        binding.back.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CartFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CartFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}