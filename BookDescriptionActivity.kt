package com.example.bookquotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BookDescriptionActivity : AppCompatActivity() {

    private var bookDescriptionTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_description)

        bookDescriptionTextView = findViewById(R.id.book_description)
        val bookDescription = intent.getStringExtra("bookDescription")
        bookDescriptionTextView?.text = bookDescription
    }
}
