package fr.android.androidexercises;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class BookActivity extends AppCompatActivity {

    public static final String BOOK = "BOOK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Intent intent = getIntent();
        Book book = intent.getParcelableExtra(BOOK);

        TextView authorTextView = findViewById(R.id.authorTextView);
        authorTextView.setText(book.getAuthor());

        TextView nameTextView = findViewById(R.id.nameTextView);
        nameTextView.setText(book.getName());
    }

}
