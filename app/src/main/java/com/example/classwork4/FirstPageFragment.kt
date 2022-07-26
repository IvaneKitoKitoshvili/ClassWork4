package com.example.classwork4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.example.classwork4.databinding.FragmentFirstPageBinding

class FirstPageFragment : Fragment() {
    private var binding: FragmentFirstPageBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstPageBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = XoAdapter {
            findNavController().navigate(
                FirstPageFragmentDirections.actionFirstPageFragmentToSecondPageFragment(
                    it
                )
            )
        }
        binding?.rvXo?.adapter = adapter
        binding?.rvXo?.layoutManager = GridLayoutManager(requireContext(), 3)
        adapter.subList(list)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}