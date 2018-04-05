package com.scottquch.retrofitmvvmdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.scottquch.retrofitmvvmdemo.repos.UserReposListFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment =  UserReposListFragment.newInstance()
        supportFragmentManager.beginTransaction().apply {
            add(frame_layout_main.id, fragment)
            commit()
        }
    }
}
