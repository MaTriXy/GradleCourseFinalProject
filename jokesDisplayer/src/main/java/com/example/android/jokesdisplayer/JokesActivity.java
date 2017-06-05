package com.example.android.jokesdisplayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

  public static final String sARG_JOKE = "joke";

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.jokes_activity);
    final String joke = getIntent().getStringExtra(sARG_JOKE);
    ((TextView)findViewById(R.id.jokesTextView)).setText(joke);
  }
}
