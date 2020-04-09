package com.example.ungdungdatvexemphim.Activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ungdungdatvexemphim.Models.Room;
import com.example.ungdungdatvexemphim.Models.Seat;
import com.example.ungdungdatvexemphim.R;

import java.util.ArrayList;


public class SeatSelectionActivity extends AppCompatActivity {

    private static final String TAG = "SeatSelectionActivity";
    private static final int ROW = 15;
    private static final int COL = 15;
    private ArrayList<Seat> seats;
    private ArrayList<String> seatIds = new ArrayList<>();
    private Room room;
    int showId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_selection);


        getIntent().getSerializableExtra("MyFilmTitle");

        showId = getIntent().getIntExtra("ShowID", 0);



        createTable();

        Button button = findViewById(R.id.btnxacnhan);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seats = room.getSeats();

                Log.d(TAG, "onClick: how big is array?------ " + seats.size());
                for (int i = 0; i < seats.size(); i++){
////
//                    System.out.println(i);
//                    Log.d(TAG, "onClick: -----------insert into data reservation seat " + showId + " " + seats.get(i).getSeatID());
//                    filmDatabase.insertDataToReservation(showId, seats.get(i).getSeatID());
                    seatIds.add(seats.get(i).getSeatID());
                    Log.d(TAG, "onClick: seats ids added" + seatIds.get(i));

                }

                if (seats.size() == 0) {

                    Toast.makeText(view.getContext(), "No seat selected", Toast.LENGTH_SHORT).show();

                } else {



                }
            }
        });





    }
    private void    createTable() {
        TableLayout tableLayout =  findViewById(R.id.TableSeats);
        final TextView titleTextView = findViewById(R.id.textView);


    }

}
