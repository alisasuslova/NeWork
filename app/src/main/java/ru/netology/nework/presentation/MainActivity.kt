package ru.netology.nework.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import ru.netology.nework.R
import ru.netology.nework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //для названий фрагментов в AppBar
        /*val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = navHostFragment.navController
        setupActionBarWithNavController(navController)*/
        navController = Navigation.findNavController(this, R.id.fragment_container)



        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.postList.observe(this) {
            Log.d("MainActivity", it.toString())
        }


        // как определить в каком разделе сейчас находимся????
        binding.menuBotton.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.postsFragment -> {
                    //переход на postsFragment

                    true
                }
                R.id.eventsFragment -> {
                    //переход на eventsFragment
                    navController.navigate(R.id.action_postsFragment_to_eventsFragment) // не важно откуда переход, переделать
                    true
                }
                R.id.usersFragment -> {
                    //переход на usersFragment
                    true
                }
            }
            false
        }

    }
}