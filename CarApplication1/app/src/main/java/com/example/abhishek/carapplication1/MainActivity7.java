package com.example.abhishek.carapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
    GridView gridView;
    String[] carName={"Fiat","Jeep","Lada","Suzuki Vitara"};
    int[] carImage={R.drawable.fiat,R.drawable.jeep2,R.drawable.lada,R.drawable.suzuki1};
    String[] carCapacity={"capacity = 3 People","capacity = 4 People","capacity = 5 People","capacity = 6 People"};
    String[] cost={"cost = 2772 Rupees","cost = 3024 Rupees","cost = 3276 Rupees","cost = 3780 Rupees"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        gridView=findViewById(R.id.gridview);
        CustomAdapter customAdapter=new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),GridItem2.class);
                intent.putExtra("name",carName[position]);
                intent.putExtra("image",carImage[position]);
                intent.putExtra("capacity",carCapacity[position]);
                intent.putExtra("cost",cost[position]);
                startActivity(intent);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return carImage.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1=getLayoutInflater().inflate(R.layout.row_data,null);
            TextView name=view1.findViewById(R.id.cars);
            ImageView image=view1.findViewById(R.id.images);
            TextView cap=view1.findViewById(R.id.capc);
            TextView cst=view1.findViewById(R.id.cost);
            name.setText(carName[position]);
            image.setImageResource(carImage[position]);

            // cap.setText(carCapacity[position]);
            //cst.setText(cost[position]);
            return view1;
        }
    }
}

