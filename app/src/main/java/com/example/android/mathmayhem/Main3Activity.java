package com.example.android.mathmayhem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }


    /**
     * This method is called when Finish button is clicked.
     */

    public void quizSummary(View view) {


        RadioButton button1 = (RadioButton) findViewById(R.id.circumference);
        boolean answer1 = button1.isChecked();

        RadioButton button2 = (RadioButton) findViewById(R.id.radius);
        boolean answer2 = button2.isChecked();

        RadioButton button3 = (RadioButton) findViewById(R.id.pie);
        boolean answer3 = button3.isChecked();

        RadioButton button4 = (RadioButton) findViewById(R.id.calculator);
        boolean answer4 = button4.isChecked();

        RadioButton button5 = (RadioButton) findViewById(R.id.computer);
        boolean answer5 = button5.isChecked();

        RadioButton button6 = (RadioButton) findViewById(R.id.abacus);
        boolean answer6 = button6.isChecked();

        RadioButton button7 = (RadioButton) findViewById(R.id.side_8);
        boolean answer7 = button7.isChecked();

        RadioButton button8 = (RadioButton) findViewById(R.id.side_10);
        boolean answer8 = button8.isChecked();

        RadioButton button9 = (RadioButton) findViewById(R.id.side_12);
        boolean answer9 = button9.isChecked();

        RadioButton button10 = (RadioButton) findViewById(R.id.prime_1);
        boolean answer10 = button10.isChecked();

        RadioButton button11 = (RadioButton) findViewById(R.id.prime_2);
        boolean answer11 = button11.isChecked();

        RadioButton button12 = (RadioButton) findViewById(R.id.prime_3);
        boolean answer12 = button12.isChecked();

        RadioButton button13 = (RadioButton) findViewById(R.id.edge_10);
        boolean answer13 = button13.isChecked();

        RadioButton button14 = (RadioButton) findViewById(R.id.edge_12);
        boolean answer14 = button14.isChecked();

        RadioButton button15 = (RadioButton) findViewById(R.id.edge_14);
        boolean answer15 = button15.isChecked();

        RadioButton button16 = (RadioButton) findViewById(R.id.yards_1760);
        boolean answer16 = button16.isChecked();

        RadioButton button17 = (RadioButton) findViewById(R.id.yards_1860);
        boolean answer17 = button17.isChecked();

        RadioButton button18 = (RadioButton) findViewById(R.id.yards_1960);
        boolean answer18 = button18.isChecked();

        RadioButton button19 = (RadioButton) findViewById(R.id.degrees_180);
        boolean answer19 = button19.isChecked();

        RadioButton button20 = (RadioButton) findViewById(R.id.degrees_270);
        boolean answer20 = button20.isChecked();

        RadioButton button21 = (RadioButton) findViewById(R.id.degrees_360);
        boolean answer21 = button21.isChecked();

        RadioButton button22 = (RadioButton) findViewById(R.id.zero_8);
        boolean answer22 = button22.isChecked();

        RadioButton button23 = (RadioButton) findViewById(R.id.zero_9);
        boolean answer23 = button23.isChecked();

        RadioButton button24 = (RadioButton) findViewById(R.id.zero_10);
        boolean answer24 = button24.isChecked();

        RadioButton button25 = (RadioButton) findViewById(R.id.sixth_950);
        boolean answer25 = button25.isChecked();

        RadioButton button26 = (RadioButton) findViewById(R.id.sixth_1050);
        boolean answer26 = button26.isChecked();

        RadioButton button27 = (RadioButton) findViewById(R.id.sixth_1250);
        boolean answer27 = button27.isChecked();

        RadioButton button28 = (RadioButton) findViewById(R.id.sqft_40190);
        boolean answer28 = button28.isChecked();

        RadioButton button29 = (RadioButton) findViewById(R.id.sqft_42320);
        boolean answer29 = button29.isChecked();

        RadioButton button30 = (RadioButton) findViewById(R.id.sqft_43560);
        boolean answer30 = button30.isChecked();

        CheckBox button31 = (CheckBox) findViewById(R.id.divide_65);
        boolean answer31 = button31.isChecked();

        CheckBox button32 = (CheckBox) findViewById(R.id.divide_77);
        boolean answer32 = button32.isChecked();

        CheckBox button33 = (CheckBox) findViewById(R.id.divide_78);
        boolean answer33 = button33.isChecked();

        CheckBox button34 = (CheckBox) findViewById(R.id.divide_93);
        boolean answer34 = button34.isChecked();

        CheckBox button35 = (CheckBox) findViewById(R.id.divide_1970);
        boolean answer35 = button35.isChecked();

        CheckBox button36 = (CheckBox) findViewById(R.id.divide_5555);
        boolean answer36 = button36.isChecked();

        EditText text37 = (EditText) findViewById(R.id.enter_answer);
        String answer37 = text37.getText().toString();

        // Show an error message as a toast.
        if (answer37.matches("")) {
            Toast.makeText(this, R.string.enter_answer_toast, Toast.LENGTH_SHORT).show();
            return;
        }

// Shows an error message if all the questions are not answered.
        if (!button1.isChecked() && !button2.isChecked() && !button3.isChecked() && !button4.isChecked() && !button5.isChecked() && !button6.isChecked() && !button7.isChecked() && !button8.isChecked() && !button9.isChecked() && !button10.isChecked() && !button11.isChecked() && !button12.isChecked() && !button13.isChecked() && !button14.isChecked() && !button15.isChecked() && !button16.isChecked() && !button17.isChecked() && !button18.isChecked() && !button19.isChecked() && !button20.isChecked() && !button21.isChecked() && !button22.isChecked() && !button23.isChecked() && !button24.isChecked() && !button25.isChecked() && !button26.isChecked() && !button27.isChecked() && !button28.isChecked() && !button29.isChecked() && !button30.isChecked() && !button31.isChecked() && !button32.isChecked() && !button33.isChecked() && !button34.isChecked() && !button35.isChecked() && !button36.isChecked()) {
            Toast.makeText(this, R.string.toast_answer_question, Toast.LENGTH_SHORT).show();
            return;

        }


        int totalScore = calculateScore(answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10, answer11, answer12, answer13, answer14, answer15, answer16, answer17, answer18, answer19, answer20, answer21, answer22, answer23, answer24, answer25, answer26, answer27, answer28, answer29, answer30, answer31, answer32, answer33, answer34, answer35, answer36, answer37);
        String scoreMessage = createScoreSummary(totalScore);
        if (scoreMessage != null) {
            Toast.makeText(this, scoreMessage, Toast.LENGTH_LONG).show();
            return;
        }


    }

    /**
     * This method calculates the total score.
     */
    private int calculateScore(boolean answer1, boolean answer2, boolean answer3, boolean answer4, boolean answer5, boolean answer6, boolean answer7, boolean answer8, boolean answer9, boolean answer10, boolean answer11, boolean answer12, boolean answer13, boolean answer14, boolean answer15, boolean answer16, boolean answer17, boolean answer18, boolean answer19, boolean answer20, boolean answer21, boolean answer22, boolean answer23, boolean answer24, boolean answer25, boolean answer26, boolean answer27, boolean answer28, boolean answer29, boolean answer30, boolean answer31, boolean answer32, boolean answer33, boolean answer34, boolean answer35, boolean answer36, String answer37) {
        //Starting score.
        int score = 0;

        //Adds 1 if correct answer is selected.
        if (answer1) {
            score += 1;
        }

        if (answer2) {
            score += 0;
        }

        if (answer3) {
            score += 0;
        }

        if (answer4) {
            score += 0;
        }

        if (answer5) {
            score += 0;
        }

        if (answer6) {
            score += 1;
        }
        if (answer7) {
            score += 0;
        }

        if (answer8) {
            score += 1;
        }

        if (answer9) {
            score += 0;
        }

        if (answer10) {
            score += 0;
        }


        if (answer11) {
            score += 1;
        }

        if (answer12) {
            score += 0;
        }

        if (answer13) {
            score += 0;
        }

        if (answer14) {
            score += 1;
        }

        if (answer15) {
            score += 0;
        }

        if (answer16) {
            score += 1;
        }

        if (answer17) {
            score += 0;
        }

        if (answer18) {
            score += 0;
        }

        if (answer19) {
            score += 0;
        }

        if (answer20) {
            score += 0;
        }

        if (answer21) {
            score += 1;
        }

        if (answer22) {
            score += 0;
        }

        if (answer23) {
            score += 1;
        }

        if (answer24) {
            score += 0;
        }

        if (answer25) {
            score += 0;
        }

        if (answer26) {
            score += 1;
        }

        if (answer27) {
            score += 0;
        }

        if (answer28) {
            score += 0;
        }

        if (answer29) {
            score += 0;
        }

        if (answer30) {
            score += 1;
        }

        if (answer31) {
            score = +0;
        }

        if (answer32) {
            score += 0;
        }

        if (answer33) {
            score += 1;
        }

        if (answer34) {
            score += 0;
        }

        if (answer35) {
            score += 1;
        }

        if (answer36) {
            score += 1;
        }

        if (answer37.equals(R.string.answer_acute)) {
            score += 1;
        }

        return score;
    }


    /**
     * This method creates a score summary.
     *
     * @param score total score of the user.
     * @return
     */

    private String createScoreSummary(int score) {
        String scoreMessage = score + " " + getString(R.string.out_of_13);

        if (score == 0) {
            scoreMessage = scoreMessage + "\n" + getString(R.string.message_1);
            return scoreMessage;
        } else if (score <= 6) {
            scoreMessage = scoreMessage + "\n" + getString(R.string.message_2);
            return scoreMessage;
        } else if (score <= 11) {
            scoreMessage = scoreMessage + "\n" + getString(R.string.message_3);
            return scoreMessage;
        } else if (score <= 13) {
            scoreMessage = scoreMessage + "\n" + getString(R.string.message_4);
            return scoreMessage;
        } else {
            return scoreMessage;
        }
    }
}
