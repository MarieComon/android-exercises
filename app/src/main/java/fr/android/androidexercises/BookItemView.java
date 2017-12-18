package fr.android.androidexercises;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BookItemView extends LinearLayout {
    public TextView nameView;
    public TextView priceView;

    public BookItemView(Context context) {
        this(context, null);

    }

    public BookItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BookItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        nameView = findViewById(R.id.nameTextView);
        priceView = findViewById(R.id.priceTextView);
        // TODO findViewById()
    }

    public void bindView(Book book) {
        nameView.setText(book.name);
        priceView.setText(String.valueOf(book.price));
        // TODO setText()
    }
}
