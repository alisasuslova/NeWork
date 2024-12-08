package ru.netology.nework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.netology.nework.databinding.FragmentUsersBinding


class UsersFragment : Fragment() {

    private var _binding: FragmentUsersBinding? = null
    private val binding: FragmentUsersBinding
        get() = _binding ?: throw RuntimeException("UsersFragment == null")

            override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUsersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    /*private fun launchPostsFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, PostsFragment.newInstancePost())
            .addToBackStack(null)
            .commit()
    }

    private fun launchEventsFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, EventsFragment.newInstanceEvent())
            .addToBackStack(null)
            .commit()
    }*/

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        val TAG: String = UsersFragment::class.java.simpleName
        fun newInstanceUser() = UsersFragment()

    }
}