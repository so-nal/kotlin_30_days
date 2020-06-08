package com.example.bookquotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.bookquotes.BookDescriptionActivity
import com.example.bookquotes.R
import com.example.bookquotes.adapter.BookAdapter
import com.example.bookquotes.model.Book

class MainActivity : AppCompatActivity() {

    private var booksListView: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        booksListView = findViewById(R.id.books_list_view)
        val books = listOf<Book>(
            Book("1", "A Clear Blue Sky", "Narayana Murthy",
                "• Religion turns into hate and prejudice--it will make you blind.\n\n" +
                        "• We become immune to violence when we see so much of it.\n\n" +
                        "• Being different should not frighten us.\n\n" +
                        "• Not everything that you see is real and not everything real can be seen.\n\n" +
                        "•Imagine all the people\nSharing all the world...\n\nYou may say I'm a dreamer\nBut I'm not the only one...\n\n-By John Lennon."),
            Book("2", "Sapiens", "Yuval Noah Harrari",
                "•Ability to speak about fictions is most unique feature of sapiens language.\n\n" +
                        "•The transition to agriculture began around 9500-8500 BC in the hill country of South-eastern turkey, western Iran and the Levant.\n\n" +
                        "•Animism- everything has soul and can directly communicate with human.\n\n" +
                        "•Theism- It's view that the universal order is based on a hierarchical relationship between humans and a small group of ethereal entities called gods.\n\n" +
                        "•Any large scale human cooperation is because,they are rooted in common myths that exists only in people's collective imagination.Eg. Belief in god"),
            Book("3", "The fault In Our Stars", "John Green",
                "•Universe enjoys it's elegance being observed.\n\n" +
                        "•Some infinities are larger than other infinities.\n\n" +
                        "•Pain demands to be felt.\n\n" +
                        "•Our fearlessness shall be our secret weapon.\n\n" +
                        "•God grant me the serenity to accept the things I can not change, the courage to change the things that I can, and the wisdom to know the difference."),
            Book("4", "The Monk Who Sold His Ferrari", "Robin Sharma",
                "•One's destiny unfolds according to the choices one makes.\n\n" +
                        "•Never overlook the power of simplicity.\n\n" +
                        "•Who looks outside, dreams; who looks inside,awakens\n\n" +
                        "•As long as we have faith in our own cause and an unconquerable will to win, Victory will not deny us.\n\n"+
                        "•Either you control your mind or it controls you."),
            Book("5", "Miracle Morning", "Hal Elrod",
                "•It's repetition of affirmation that leads to belief.\n\n" +
                        "•We know what we need to do, we just don't consistently do what we know.\n\n" +
                        "•Always remember that when you are committed to a life purpose that's bigger than your problems, your problems become relatively insignificant and you will overcome them with ease.\n\n" +
                        "•On the one hand, we all want to be happy. On the other hand, we all know the things that makes us happy. But we don't do those things. Why? Simple. We are too busy. Too busy doing what? Too busy trying to be happy!\n\n" +
                        "•Your level of success, will rarely exceed your level of personal development, because success is something you attract by the person you become!"),
            Book("6", "The Gun", "Fuminori Nakamura", "Sorry, no Notes"),
            Book("7", "The Great Gatsby", "F. Scott Fitzgerald", "Sorry, No notes")
        )
        val booksAdapter = BookAdapter(this, books)
        booksListView?.adapter = booksAdapter
        booksListView?.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position, _ ->
                val book = books[position]
                val intent = Intent(this@MainActivity, BookDescriptionActivity::class.java)
                intent.putExtra("bookDescription", book.description)
                this@MainActivity.startActivity(intent)
            }
    }
}
