package com.example.petwell.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.petwell.R
import com.example.petwell.data.Vet

class VetListFragment : Fragment() {

    private lateinit var vetListAdapter: VetListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_vet_list, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        val filterByDistance: Button = view.findViewById(R.id.filterDistanceButton)
        val filterByRating: Button = view.findViewById(R.id.filterRatingButton)
        val filterByPricing: Button = view.findViewById(R.id.filterPricingButton)

        val vets = generateSampleVetList()
        vetListAdapter = VetListAdapter(vets)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = vetListAdapter

        filterByDistance.setOnClickListener { filterVets("Distance") }
        filterByRating.setOnClickListener { filterVets("Rating") }
        filterByPricing.setOnClickListener { filterVets("Pricing") }

        return view
    }

    private fun generateSampleVetList(): List<Vet> {
        return listOf(
            Vet("Happy Paws Clinic", "Downtown", 4.5, "$$", 1.2),
            Vet("Pet Health Center", "Uptown", 4.0, "$$$", 2.5),
            Vet("Friendly Vet", "Midtown", 3.8, "$", 0.9)
        )
    }

    private fun filterVets(filterType: String) {
        val sortedList = when (filterType) {
            "Distance" -> vetListAdapter.vets.sortedBy { it.distance }
            "Rating" -> vetListAdapter.vets.sortedByDescending { it.rating }
            "Pricing" -> vetListAdapter.vets.sortedBy { it.priceCategory.length }
            else -> vetListAdapter.vets
        }
        vetListAdapter.updateList(sortedList)
    }

    companion object {
        fun newInstance(query: String) = VetListFragment().apply {
            arguments = Bundle().apply {
                putString("SEARCH_QUERY", query)
            }
        }
    }
}
