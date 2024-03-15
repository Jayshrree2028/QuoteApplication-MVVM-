package com.example.mvvmpractice.quoteapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmpractice.R

//MVVM Architecture
class MainQuoteActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    private val   quoteText : TextView
        get() = findViewById(R.id.quoteText)

    private  val quthorText : TextView
        get() = findViewById(R.id.quoteAuthor)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_quote)
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(application)).get(MainViewModel::class.java)

        setQuote(mainViewModel.getQuotes())
    }
    fun setQuote( quote: Quote){
        quoteText.text = quote.text
        quthorText.text = quote.author
    }

    fun onPrevious(view: View) {
        setQuote(mainViewModel.previousQuotes())
    }
    fun onNext(view: View) {
        setQuote(mainViewModel.nextQuotes())
    }
    fun onShare(view: View) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/action")
        intent.putExtra(Intent.EXTRA_TEXT,mainViewModel.getQuotes().text)
        startActivity(intent)
    }
}