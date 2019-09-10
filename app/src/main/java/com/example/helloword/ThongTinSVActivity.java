package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class ThongTinSVActivity extends AppCompatActivity {
    private Toolbar toobal;
    private TextView tvHoten;
    private TextView tvNamSinh;
    private TextView tvLop;
    private TextView tvDiaChi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_thong_tin_sv);
        toobal = (Toolbar) findViewById(R.id.toobal);
        tvHoten = (TextView) findViewById(R.id.tvHoten);
        tvNamSinh = (TextView) findViewById(R.id.tvNamSinh);
        tvLop = (TextView) findViewById(R.id.tvLop);
        tvDiaChi = (TextView) findViewById(R.id.tvDiaChi);

        toobal.setTitle("Thông tin sinh viên");
        tvHoten.setText("Họ tên : Hoàng Anh Vũ");
        tvNamSinh.setText("Năm Sinh : 1999");
        tvDiaChi.setText("Địa Chỉ : Thọ Xuân - Đan Phượng Hà Nội");
        tvLop.setText("Lớp 12A3");
    }
}
