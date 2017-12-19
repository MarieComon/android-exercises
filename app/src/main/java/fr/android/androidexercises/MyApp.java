package fr.android.androidexercises;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import timber.log.Timber;

/**
 * Created by Marie Comon on 19/12/2017.
 */

public class MyApp extends Application {
    //tout ce qui est fait une seule fois

    private static HenriPotierService;

    public void onCreate() {

        super.onCreate();

        Timber.plant(new Timber.DebugTree());

        // TODO build Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://henri-potier.xebia.fr/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
