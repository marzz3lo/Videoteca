package com.moonlapse.videoteca;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by marzzelo on 8/7/2017.
 */

public class ActividadDetalles extends Activity {
    public static final String MOVIE = "Movie";
    public static final String SHARED_ELEMENT_NAME = "hero";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
    }
}
