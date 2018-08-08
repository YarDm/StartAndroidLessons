package ru.mperika.lp0121ogandmess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Находим вьюхи");
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        Log.d(TAG, "Присваиваем обработчик кнопкам");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "по id определеяем кнопку, вызвавшую этот обработчик");
        switch (view.getId()) {
            case R.id.btnOk:
                Log.d(TAG, "кнопка ОК");
                tvOut.setText("Нажата кнопка ОК");
                Toast.makeText(this, "Button OK is pressed", Toast.LENGTH_LONG)
                        .show();
                break;
            case R.id.btnCancel:
                Log.d(TAG, "кнопка Cancel");
                tvOut.setText("Нажата кнопка Cancel");
                Toast.makeText(this, "Button Cancel is pressed", Toast.LENGTH_LONG)
                        .show();
                break;
        }
    }
}
