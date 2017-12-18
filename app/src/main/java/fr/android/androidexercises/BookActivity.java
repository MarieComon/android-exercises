package fr.android.androidexercises;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    private String bookName = "Garry Whopper";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        TextView messageTextView = findViewById(R.id.messageTextView);
        messageTextView.setText(bookName);

        Button sendNameButton = findViewById(R.id.sendNameButton);
        sendNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO set result to book name in intent
                // TODO finish current activity
                Intent data = new Intent();
                data.putExtra("book", bookName);
                setResult(Activity.RESULT_OK, data);
                finish();
            }
        });
    }

}
