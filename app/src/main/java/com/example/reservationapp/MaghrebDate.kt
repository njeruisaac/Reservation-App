package com.example.reservationapp

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker
import java.util.*

class MaghrebDate : AppCompatActivity(), DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    var day= 0
    var month=0
    var year=0
    var hour=0
    var minute=0


    var savedDay= 0
    var savedMonth=0
    var savedYear=0
    var savedHour=0
    var savedMinute=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maghreb_date)

        pickDate()

    }
    private fun getDateTimeCalendar(){
        val cal= Calendar.getInstance()
        day = cal.get(Calendar.DAY_OF_MONTH)
        month = cal.get(Calendar.MONTH)
        year = cal.get(Calendar.YEAR)
        hour = cal.get(Calendar.HOUR)
        minute=cal.get(Calendar.MINUTE)

    }

    private fun pickDate(){
        val btn_timePicker: Button = findViewById(R.id.btn_time)
        btn_timePicker.setOnClickListener(){
            getDateTimeCalendar()
            DatePickerDialog(this,this,year,month,day).show()
        }
    }



    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        savedDay=dayOfMonth
        savedMonth=month
        savedYear=year

        getDateTimeCalendar()
        TimePickerDialog(this,this,hour,minute,true).show()
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {

        savedHour=hourOfDay
        savedMinute=minute

        val txtTime: TextView = findViewById(R.id.tv_textTime)

        val AM_PM: String
        if (hourOfDay>=0&&hourOfDay<12){
            AM_PM=" AM";
        }else {
            AM_PM=" PM";
        }

        txtTime.text =" $savedDay,$savedMonth,$savedYear\n AT: $savedHour : $savedMinute $AM_PM"
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this,MaghrebSplash::class.java)
            startActivity(intent)
            finish()
        },5000)
    }

}