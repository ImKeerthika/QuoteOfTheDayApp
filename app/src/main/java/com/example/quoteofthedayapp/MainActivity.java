package com.example.quoteofthedayapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView quoteText;
    private Button nextQuoteButton;

    private String[] quotes = {
            "Believe in yourself and all that you are.",
            "Push yourself, because no one else is going to do it for you.",
            "The harder you work for something, the greater you’ll feel when you achieve it.",
            "Success doesn’t just find you. You have to go out and get it.",
            "Great things never come from comfort zones.",
            "Dream it. Wish it. Do it.",
            "Stay positive, work hard, make it happen.",
            "Don’t watch the clock; do what it does. Keep going.",
            "It’s going to be hard, but hard does not mean impossible.",
            "Believe you can and you’re halfway there."
    };

    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // ✅ Uses new layout name

        quoteText = findViewById(R.id.quoteText);
        nextQuoteButton = findViewById(R.id.nextQuoteButton);

        showRandomQuote();

        nextQuoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showRandomQuote();
            }
        });
    }

    private void showRandomQuote() {
        int index = random.nextInt(quotes.length);
        quoteText.setText(quotes[index]);
    }
}

