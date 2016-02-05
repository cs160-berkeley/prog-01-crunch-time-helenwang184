package com.example.helenwang.cc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText pushup, situp, squat, leglift, plank, jumpingjack, pullup, cycling, walking, jogging, swimming, stairclimbing, calories;
    Button clear;
    double repmin_num, conversion_factor, calories_result;
    Boolean updating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pushup = (EditText)findViewById(R.id.edit_pushup);
        situp = (EditText)findViewById(R.id.edit_situp);
        squat = (EditText)findViewById(R.id.edit_squat);
        leglift = (EditText)findViewById(R.id.edit_leglift);
        plank = (EditText)findViewById(R.id.edit_plank);
        jumpingjack = (EditText)findViewById(R.id.edit_jumpingjacks);
        pullup = (EditText)findViewById(R.id.edit_pullup);
        cycling = (EditText)findViewById(R.id.edit_cycling);
        walking = (EditText)findViewById(R.id.edit_walking);
        jogging = (EditText)findViewById(R.id.edit_jogging);
        swimming = (EditText)findViewById(R.id.edit_swimming);
        stairclimbing = (EditText)findViewById(R.id.edit_stairclimbing);

        calories = (EditText)findViewById(R.id.text_calories);
        clear = (Button)findViewById(R.id.button_clear);
        updating = false;

        pushup.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0 && !updating) {
                    updating = true;
                    conversion_factor = 350;
                    repmin_num = Double.parseDouble(pushup.getText().toString());
                    calories_result = repmin_num / conversion_factor * 100;
                    calories.setText(String.format("%.0f", calories_result));
                    situp.setText(String.format("%.0f", calories_result / 100 * 200));
                    squat.setText(String.format("%.0f", calories_result / 100 * 225));
                    leglift.setText(String.format("%.0f", calories_result / 100 * 25));
                    plank.setText(String.format("%.0f", calories_result / 100 * 25));
                    jumpingjack.setText(String.format("%.0f", calories_result / 100 * 10));
                    pullup.setText(String.format("%.0f", calories_result / 100 * 100));
                    cycling.setText(String.format("%.0f", calories_result / 100 * 12));
                    walking.setText(String.format("%.0f", calories_result / 100 * 20));
                    jogging.setText(String.format("%.0f", calories_result / 100 * 12));
                    swimming.setText(String.format("%.0f", calories_result / 100 * 13));
                    stairclimbing.setText(String.format("%.0f", calories_result / 100 * 15));
                    updating = false;
                } else if (!updating) {
                    updating = true;
                    pushup.setText("");
                    situp.setText("");
                    squat.setText("");
                    leglift.setText("");
                    plank.setText("");
                    jumpingjack.setText("");
                    pullup.setText("");
                    cycling.setText("");
                    walking.setText("");
                    jogging.setText("");
                    swimming.setText("");
                    stairclimbing.setText("");
                    calories.setText("0");
                    updating = false;
                }
            }
        });


        situp.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0 && !updating) {
                    updating = true;
                    conversion_factor = 200;
                    repmin_num = Double.parseDouble(situp.getText().toString());
                    calories_result = repmin_num / conversion_factor * 100;
                    calories.setText(String.format("%.0f", calories_result));
                    pushup.setText(String.format("%.0f", calories_result / 100 * 350));
                    squat.setText(String.format("%.0f", calories_result / 100 * 225));
                    leglift.setText(String.format("%.0f", calories_result / 100 * 25));
                    plank.setText(String.format("%.0f", calories_result / 100 * 25));
                    jumpingjack.setText(String.format("%.0f", calories_result / 100 * 10));
                    pullup.setText(String.format("%.0f", calories_result / 100 * 100));
                    cycling.setText(String.format("%.0f", calories_result / 100 * 12));
                    walking.setText(String.format("%.0f", calories_result / 100 * 20));
                    jogging.setText(String.format("%.0f", calories_result / 100 * 12));
                    swimming.setText(String.format("%.0f", calories_result / 100 * 13));
                    stairclimbing.setText(String.format("%.0f", calories_result / 100 * 15));
                    updating = false;
                } else if (!updating) {
                    updating = true;
                    pushup.setText("");
                    situp.setText("");
                    squat.setText("");
                    leglift.setText("");
                    plank.setText("");
                    jumpingjack.setText("");
                    pullup.setText("");
                    cycling.setText("");
                    walking.setText("");
                    jogging.setText("");
                    swimming.setText("");
                    stairclimbing.setText("");
                    calories.setText("0");
                    updating = false;
                }
            }
        });

        squat.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0 && !updating) {
                    updating = true;
                    conversion_factor = 225;
                    repmin_num = Double.parseDouble(squat.getText().toString());
                    calories_result = repmin_num / conversion_factor * 100;
                    calories.setText(String.format("%.0f", calories_result));
                    pushup.setText(String.format("%.0f", calories_result / 100 * 350));
                    situp.setText(String.format("%.0f", calories_result / 100 * 200));
                    leglift.setText(String.format("%.0f", calories_result / 100 * 25));
                    plank.setText(String.format("%.0f", calories_result / 100 * 25));
                    jumpingjack.setText(String.format("%.0f", calories_result / 100 * 10));
                    pullup.setText(String.format("%.0f", calories_result / 100 * 100));
                    cycling.setText(String.format("%.0f", calories_result / 100 * 12));
                    walking.setText(String.format("%.0f", calories_result / 100 * 20));
                    jogging.setText(String.format("%.0f", calories_result / 100 * 12));
                    swimming.setText(String.format("%.0f", calories_result / 100 * 13));
                    stairclimbing.setText(String.format("%.0f", calories_result / 100 * 15));
                    updating = false;
                } else if (!updating) {
                    updating = true;
                    pushup.setText("");
                    situp.setText("");
                    squat.setText("");
                    leglift.setText("");
                    plank.setText("");
                    jumpingjack.setText("");
                    pullup.setText("");
                    cycling.setText("");
                    walking.setText("");
                    jogging.setText("");
                    swimming.setText("");
                    stairclimbing.setText("");
                    calories.setText("0");
                    updating = false;
                }
            }
        });

        leglift.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0 && !updating) {
                    updating = true;
                    conversion_factor = 25;
                    repmin_num = Double.parseDouble(leglift.getText().toString());
                    calories_result = repmin_num / conversion_factor * 100;
                    calories.setText(String.format("%.0f", calories_result));
                    pushup.setText(String.format("%.0f", calories_result / 100 * 350));
                    situp.setText(String.format("%.0f", calories_result / 100 * 200));
                    squat.setText(String.format("%.0f", calories_result / 100 * 225));
                    plank.setText(String.format("%.0f", calories_result / 100 * 25));
                    jumpingjack.setText(String.format("%.0f", calories_result / 100 * 10));
                    pullup.setText(String.format("%.0f", calories_result / 100 * 100));
                    cycling.setText(String.format("%.0f", calories_result / 100 * 12));
                    walking.setText(String.format("%.0f", calories_result / 100 * 20));
                    jogging.setText(String.format("%.0f", calories_result / 100 * 12));
                    swimming.setText(String.format("%.0f", calories_result / 100 * 13));
                    stairclimbing.setText(String.format("%.0f", calories_result / 100 * 15));
                    updating = false;
                } else if (!updating) {
                    updating = true;
                    pushup.setText("");
                    situp.setText("");
                    squat.setText("");
                    leglift.setText("");
                    plank.setText("");
                    jumpingjack.setText("");
                    pullup.setText("");
                    cycling.setText("");
                    walking.setText("");
                    jogging.setText("");
                    swimming.setText("");
                    stairclimbing.setText("");
                    calories.setText("0");
                    updating = false;
                }
            }
        });

        plank.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0 && !updating) {
                    updating = true;
                    conversion_factor = 25;
                    repmin_num = Double.parseDouble(plank.getText().toString());
                    calories_result = repmin_num / conversion_factor * 100;
                    calories.setText(String.format("%.0f", calories_result));
                    pushup.setText(String.format("%.0f", calories_result / 100 * 350));
                    situp.setText(String.format("%.0f", calories_result / 100 * 200));
                    squat.setText(String.format("%.0f", calories_result / 100 * 225));
                    leglift.setText(String.format("%.0f", calories_result / 100 * 25));
                    jumpingjack.setText(String.format("%.0f", calories_result / 100 * 10));
                    pullup.setText(String.format("%.0f", calories_result / 100 * 100));
                    cycling.setText(String.format("%.0f", calories_result / 100 * 12));
                    walking.setText(String.format("%.0f", calories_result / 100 * 20));
                    jogging.setText(String.format("%.0f", calories_result / 100 * 12));
                    swimming.setText(String.format("%.0f", calories_result / 100 * 13));
                    stairclimbing.setText(String.format("%.0f", calories_result / 100 * 15));
                    updating = false;
                } else if (!updating) {
                    updating = true;
                    pushup.setText("");
                    situp.setText("");
                    squat.setText("");
                    leglift.setText("");
                    plank.setText("");
                    jumpingjack.setText("");
                    pullup.setText("");
                    cycling.setText("");
                    walking.setText("");
                    jogging.setText("");
                    swimming.setText("");
                    stairclimbing.setText("");
                    calories.setText("0");
                    updating = false;
                }
            }
        });

        jumpingjack.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0 && !updating) {
                    updating = true;
                    conversion_factor = 10;
                    repmin_num = Double.parseDouble(jumpingjack.getText().toString());
                    calories_result = repmin_num / conversion_factor * 100;
                    calories.setText(String.format("%.0f", calories_result));
                    pushup.setText(String.format("%.0f", calories_result / 100 * 350));
                    situp.setText(String.format("%.0f", calories_result / 100 * 200));
                    squat.setText(String.format("%.0f", calories_result / 100 * 225));
                    leglift.setText(String.format("%.0f", calories_result / 100 * 25));
                    plank.setText(String.format("%.0f", calories_result / 100 * 25));
                    pullup.setText(String.format("%.0f", calories_result / 100 * 100));
                    cycling.setText(String.format("%.0f", calories_result / 100 * 12));
                    walking.setText(String.format("%.0f", calories_result / 100 * 20));
                    jogging.setText(String.format("%.0f", calories_result / 100 * 12));
                    swimming.setText(String.format("%.0f", calories_result / 100 * 13));
                    stairclimbing.setText(String.format("%.0f", calories_result / 100 * 15));
                    updating = false;
                } else if (!updating) {
                    updating = true;
                    pushup.setText("");
                    situp.setText("");
                    squat.setText("");
                    leglift.setText("");
                    plank.setText("");
                    jumpingjack.setText("");
                    pullup.setText("");
                    cycling.setText("");
                    walking.setText("");
                    jogging.setText("");
                    swimming.setText("");
                    stairclimbing.setText("");
                    calories.setText("0");
                    updating = false;
                }
            }
        });

        pullup.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0 && !updating) {
                    updating = true;
                    conversion_factor = 100;
                    repmin_num = Double.parseDouble(pullup.getText().toString());
                    calories_result = repmin_num / conversion_factor * 100;
                    calories.setText(String.format("%.0f", calories_result));
                    pushup.setText(String.format("%.0f", calories_result / 100 * 350));
                    situp.setText(String.format("%.0f", calories_result / 100 * 200));
                    squat.setText(String.format("%.0f", calories_result / 100 * 225));
                    leglift.setText(String.format("%.0f", calories_result / 100 * 25));
                    plank.setText(String.format("%.0f", calories_result / 100 * 25));
                    jumpingjack.setText(String.format("%.0f", calories_result / 100 * 10));
                    cycling.setText(String.format("%.0f", calories_result / 100 * 12));
                    walking.setText(String.format("%.0f", calories_result / 100 * 20));
                    jogging.setText(String.format("%.0f", calories_result / 100 * 12));
                    swimming.setText(String.format("%.0f", calories_result / 100 * 13));
                    stairclimbing.setText(String.format("%.0f", calories_result / 100 * 15));
                    updating = false;
                } else if (!updating) {
                    updating = true;
                    pushup.setText("");
                    situp.setText("");
                    squat.setText("");
                    leglift.setText("");
                    plank.setText("");
                    jumpingjack.setText("");
                    pullup.setText("");
                    cycling.setText("");
                    walking.setText("");
                    jogging.setText("");
                    swimming.setText("");
                    stairclimbing.setText("");
                    calories.setText("0");
                    updating = false;
                }
            }
        });

        cycling.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0 && !updating) {
                    updating = true;
                    conversion_factor = 12;
                    repmin_num = Double.parseDouble(cycling.getText().toString());
                    calories_result = repmin_num / conversion_factor * 100;
                    calories.setText(String.format("%.0f", calories_result));
                    pushup.setText(String.format("%.0f", calories_result / 100 * 350));
                    situp.setText(String.format("%.0f", calories_result / 100 * 200));
                    squat.setText(String.format("%.0f", calories_result / 100 * 225));
                    leglift.setText(String.format("%.0f", calories_result / 100 * 25));
                    plank.setText(String.format("%.0f", calories_result / 100 * 25));
                    jumpingjack.setText(String.format("%.0f", calories_result / 100 * 10));
                    pullup.setText(String.format("%.0f", calories_result / 100 * 100));
                    walking.setText(String.format("%.0f", calories_result / 100 * 20));
                    jogging.setText(String.format("%.0f", calories_result / 100 * 12));
                    swimming.setText(String.format("%.0f", calories_result / 100 * 13));
                    stairclimbing.setText(String.format("%.0f", calories_result / 100 * 15));
                    updating = false;
                } else if (!updating) {
                    updating = true;
                    pushup.setText("");
                    situp.setText("");
                    squat.setText("");
                    leglift.setText("");
                    plank.setText("");
                    jumpingjack.setText("");
                    pullup.setText("");
                    cycling.setText("");
                    walking.setText("");
                    jogging.setText("");
                    swimming.setText("");
                    stairclimbing.setText("");
                    calories.setText("0");
                    updating = false;
                }
            }
        });

        walking.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0 && !updating) {
                    updating = true;
                    conversion_factor = 20;
                    repmin_num = Double.parseDouble(walking.getText().toString());
                    calories_result = repmin_num / conversion_factor * 100;
                    calories.setText(String.format("%.0f", calories_result));
                    pushup.setText(String.format("%.0f", calories_result / 100 * 350));
                    situp.setText(String.format("%.0f", calories_result / 100 * 200));
                    squat.setText(String.format("%.0f", calories_result / 100 * 225));
                    leglift.setText(String.format("%.0f", calories_result / 100 * 25));
                    plank.setText(String.format("%.0f", calories_result / 100 * 25));
                    jumpingjack.setText(String.format("%.0f", calories_result / 100 * 10));
                    pullup.setText(String.format("%.0f", calories_result / 100 * 100));
                    cycling.setText(String.format("%.0f", calories_result / 100 * 12));
                    jogging.setText(String.format("%.0f", calories_result / 100 * 12));
                    swimming.setText(String.format("%.0f", calories_result / 100 * 13));
                    stairclimbing.setText(String.format("%.0f", calories_result / 100 * 15));
                    updating = false;
                } else if (!updating) {
                    updating = true;
                    pushup.setText("");
                    situp.setText("");
                    squat.setText("");
                    leglift.setText("");
                    plank.setText("");
                    jumpingjack.setText("");
                    pullup.setText("");
                    cycling.setText("");
                    walking.setText("");
                    jogging.setText("");
                    swimming.setText("");
                    stairclimbing.setText("");
                    calories.setText("0");
                    updating = false;
                }
            }
        });

        jogging.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0 && !updating) {
                    updating = true;
                    conversion_factor = 12;
                    repmin_num = Double.parseDouble(jogging.getText().toString());
                    calories_result = repmin_num / conversion_factor * 100;
                    calories.setText(String.format("%.0f", calories_result));
                    pushup.setText(String.format("%.0f", calories_result / 100 * 350));
                    situp.setText(String.format("%.0f", calories_result / 100 * 200));
                    squat.setText(String.format("%.0f", calories_result / 100 * 225));
                    leglift.setText(String.format("%.0f", calories_result / 100 * 25));
                    plank.setText(String.format("%.0f", calories_result / 100 * 25));
                    jumpingjack.setText(String.format("%.0f", calories_result / 100 * 10));
                    pullup.setText(String.format("%.0f", calories_result / 100 * 100));
                    cycling.setText(String.format("%.0f", calories_result / 100 * 12));
                    walking.setText(String.format("%.0f", calories_result / 100 * 20));
                    swimming.setText(String.format("%.0f", calories_result / 100 * 13));
                    stairclimbing.setText(String.format("%.0f", calories_result / 100 * 15));
                    updating = false;
                } else if (!updating) {
                    updating = true;
                    pushup.setText("");
                    situp.setText("");
                    squat.setText("");
                    leglift.setText("");
                    plank.setText("");
                    jumpingjack.setText("");
                    pullup.setText("");
                    cycling.setText("");
                    walking.setText("");
                    jogging.setText("");
                    swimming.setText("");
                    stairclimbing.setText("");
                    calories.setText("0");
                    updating = false;
                }
            }
        });

        swimming.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0 && !updating) {
                    updating = true;
                    conversion_factor = 13;
                    repmin_num = Double.parseDouble(swimming.getText().toString());
                    calories_result = repmin_num / conversion_factor * 100;
                    calories.setText(String.format("%.0f", calories_result));
                    pushup.setText(String.format("%.0f", calories_result / 100 * 350));
                    situp.setText(String.format("%.0f", calories_result / 100 * 200));
                    squat.setText(String.format("%.0f", calories_result / 100 * 225));
                    leglift.setText(String.format("%.0f", calories_result / 100 * 25));
                    plank.setText(String.format("%.0f", calories_result / 100 * 25));
                    jumpingjack.setText(String.format("%.0f", calories_result / 100 * 10));
                    pullup.setText(String.format("%.0f", calories_result / 100 * 100));
                    cycling.setText(String.format("%.0f", calories_result / 100 * 12));
                    walking.setText(String.format("%.0f", calories_result / 100 * 20));
                    jogging.setText(String.format("%.0f", calories_result / 100 * 12));
                    stairclimbing.setText(String.format("%.0f", calories_result / 100 * 15));
                    updating = false;
                } else if (!updating) {
                    updating = true;
                    pushup.setText("");
                    situp.setText("");
                    squat.setText("");
                    leglift.setText("");
                    plank.setText("");
                    jumpingjack.setText("");
                    pullup.setText("");
                    cycling.setText("");
                    walking.setText("");
                    jogging.setText("");
                    swimming.setText("");
                    stairclimbing.setText("");
                    calories.setText("0");
                    updating = false;
                }
            }
        });

        stairclimbing.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0 && !updating) {
                    updating = true;
                    conversion_factor = 15;
                    repmin_num = Double.parseDouble(stairclimbing.getText().toString());
                    calories_result = repmin_num / conversion_factor * 100;
                    calories.setText(String.format("%.0f", calories_result));
                    pushup.setText(String.format("%.0f", calories_result / 100 * 350));
                    situp.setText(String.format("%.0f", calories_result / 100 * 200));
                    squat.setText(String.format("%.0f", calories_result / 100 * 225));
                    leglift.setText(String.format("%.0f", calories_result / 100 * 25));
                    plank.setText(String.format("%.0f", calories_result / 100 * 25));
                    jumpingjack.setText(String.format("%.0f", calories_result / 100 * 10));
                    pullup.setText(String.format("%.0f", calories_result / 100 * 100));
                    cycling.setText(String.format("%.0f", calories_result / 100 * 12));
                    walking.setText(String.format("%.0f", calories_result / 100 * 20));
                    jogging.setText(String.format("%.0f", calories_result / 100 * 12));
                    swimming.setText(String.format("%.0f", calories_result / 100 * 13));
                    updating = false;
                } else if (!updating) {
                    updating = true;
                    pushup.setText("");
                    situp.setText("");
                    squat.setText("");
                    leglift.setText("");
                    plank.setText("");
                    jumpingjack.setText("");
                    pullup.setText("");
                    cycling.setText("");
                    walking.setText("");
                    jogging.setText("");
                    swimming.setText("");
                    stairclimbing.setText("");
                    calories.setText("0");
                    updating = false;
                }
            }
        });

        clear.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                updating = true;
                pushup.setText("");
                situp.setText("");
                squat.setText("");
                leglift.setText("");
                plank.setText("");
                jumpingjack.setText("");
                pullup.setText("");
                cycling.setText("");
                walking.setText("");
                jogging.setText("");
                swimming.setText("");
                stairclimbing.setText("");
                calories.setText("0");
                updating = false;
            }
        });

        calories.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (s.length() != 0 && !updating) {
                    updating = true;
                    calories_result = Double.parseDouble(calories.getText().toString());
                    pushup.setText(String.format("%.0f", calories_result / 100 * 350));
                    situp.setText(String.format("%.0f", calories_result / 100 * 200));
                    squat.setText(String.format("%.0f", calories_result / 100 * 225));
                    leglift.setText(String.format("%.0f", calories_result / 100 * 25));
                    plank.setText(String.format("%.0f", calories_result / 100 * 25));
                    jumpingjack.setText(String.format("%.0f", calories_result / 100 * 10));
                    pullup.setText(String.format("%.0f", calories_result / 100 * 100));
                    cycling.setText(String.format("%.0f", calories_result / 100 * 12));
                    walking.setText(String.format("%.0f", calories_result / 100 * 20));
                    jogging.setText(String.format("%.0f", calories_result / 100 * 12));
                    swimming.setText(String.format("%.0f", calories_result / 100 * 13));
                    stairclimbing.setText(String.format("%.0f", calories_result / 100 * 15));
                    updating = false;
                } else if (!updating) {
                    updating = true;
                    pushup.setText("");
                    situp.setText("");
                    squat.setText("");
                    leglift.setText("");
                    plank.setText("");
                    jumpingjack.setText("");
                    pullup.setText("");
                    cycling.setText("");
                    walking.setText("");
                    jogging.setText("");
                    swimming.setText("");
                    stairclimbing.setText("");
                    updating = false;
                }
            }
        });
    }
}
