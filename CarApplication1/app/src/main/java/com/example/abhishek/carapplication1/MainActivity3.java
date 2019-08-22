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

public class MainActivity3 extends AppCompatActivity {
    GridView gridView;
    String[] carName={"Fiat","Toyota Yaris","Acura","Toyoto Innova"};
    int[] carImage={R.drawable.fiat,R.drawable.toyota2,R.drawable.acura,R.drawable.toyota1};
    String[] carCapacity={"capacity = 3 People","capacity = 4 People","capacity = 5 People","capacity = 6 People"};
    String[] cost={"cost = 3850 Rupees","cost = 4200 Rupees","cost = 4550 Rupees","cost = 5250 Rupees"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
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

    private class CustomAdapter extends BaseAdapter{
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
