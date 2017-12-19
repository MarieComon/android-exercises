package fr.android.androidexercises;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Step0Fragment extends Fragment {

    private static final String STEP_0 = "This is step 0";

    private TextView textView;
    private OnNextStep0Listener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (OnNextStep0Listener) context;

        // TODO cast context to listener
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_step0, container, false);

        // TODO find TextView and set text
        //((TextView) view.findViewById(R.id.textView)).setText(STEP_0);

        // TODO find Button and set listener
        Button nextButton = view.findViewById(R.id.nextButton);
        nextButton.setOnClickListener(v -> {
            // TODO call listener
            listener.onNext();
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.textView);
        textView.setText((STEP_0));
        // TODO setText(STEP_0)
    }

    public interface OnNextStep0Listener {
        // TODO add onNext() method
        public void onNext();
    }

}
