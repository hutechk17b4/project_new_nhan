package com.example.ungdungdatvexemphim.Models;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

import com.example.ungdungdatvexemphim.R;


public class Seat extends AppCompatButton {
    private String ID;

    private int roomID;
    private String seatID;
    private int rowNum;
    private int colNum;
    private boolean isSelected;
    private boolean isBooked = false;
    private final double price = 100;


    private static final String TAG = "Seat";


    public Seat(Context context) {
        super(context);
    }

    public Seat(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Seat(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Seat(Context context, int row, int col) {
        super(context);
        this.rowNum = row;
        this.colNum = col;
        this.seatID = this.rowNum + "," + this.colNum;
//        Log.d(TAG, "Seat: ----------------------------- ID = " + seatID);
    }


    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public int getColNum() {
        return colNum;
    }

    public void setColNum(int colNum) {
        this.colNum = colNum;
    }

    public boolean setBackground(){

        if (this.isBooked) {

            this.setBackgroundResource(R.drawable.seat_sold);
            return false;
        }

        if(this.isSelected) {

            this.setBackgroundResource(R.drawable.seat_selected);
            this.isSelected = false;
            return true;
        }else{

            this.setBackgroundResource(R.drawable.seat_sale);
            this.isSelected = true;
            return true;
        }


    }

    public void setStatus(boolean status) {
        this.isSelected = status;
    }

    public boolean getStatus() {
        return isSelected;
    }

    public double getPrice() {
        return price;
    }

    public String getSeatID(){
        return this.seatID;
    }

    public void setIsBooked(){
        this.isBooked = true;
    }

    public boolean IsBooked(){
        return this.isBooked;
    }


}
