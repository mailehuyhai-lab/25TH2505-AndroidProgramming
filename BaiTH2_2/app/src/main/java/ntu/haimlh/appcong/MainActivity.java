package ntu.haimlh.appcong;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //gắn layout tương ứng với file này
        setContentView(R.layout.activity_main);
    }
    //đây là bộ lắng nghe và xử lý sự kiện click lên nút tính tổng
    public void XuLyCong(View view){
        //Tìm, tham chiếu đến điều khiển trên têpj XML
            EditText editTextSoA = findViewById(R.id.edtA);
            EditText editTextSoB = findViewById(R.id.edtB);
            EditText editTextKetQua = findViewById(R.id.edtKQ);
        //Lấy dữ liệu về ở điều khiển số A
           String strA = editTextSoA.getText().toString();
        //Lấy dữ liệu về ở điều khiển số B
        String strB = editTextSoB.getText().toString();

        //Chuyển dữ liệu sang dạng số
            int so_A = Integer.parseInt(strA);
            int so_B = Integer.parseInt(strB);

        //Tính toán theo yêu cầu
            int tong = so_A + so_B;
            String strTong = String.valueOf(tong); //chuyển sang dạng chuỗi
        //Hiện ra màn hình
            editTextKetQua.setText(strTong);
    }
}