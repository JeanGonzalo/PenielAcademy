package jeanzapata.notepad.com.penielacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToNextAct(View v)
    {
        Intent in = new Intent(MainActivity.this, PerfilActivity.class);
        startActivity(in);
    }
}
