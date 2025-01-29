package com.upax.gitexample

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        println("Make just one print")

        println("This is a test of squash process before rebase on master")

        /**
         * In this test, I'll make two commits on feature/branch-squash-commits-before
         * I'll make one change in master branch, and I'll rebase this with local branch feature/branch-squash-commits-before
         * **/

        /////////////////////////////////////////////////////////////////////
        println("This is a test of squash process after rebase on master")

        /**
         * In this test, I'll make two commits on feature/branch-squash-commits-after
         * I'll make two changes in master branch, and I'll rebase this with local branch feature/branch-squash-commits-after
         * **/

    }
}