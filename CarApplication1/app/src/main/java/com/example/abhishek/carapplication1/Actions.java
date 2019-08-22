package com.example.abhishek.carapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Actions extends AppCompatActivity {
Button add,update,remove,b1;
DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
        add=findViewById(R.id.btadd);
        update=findViewById(R.id.btupdate);
        remove=findViewById(R.id.btremove);
        AddData();
        Updatedata();
        RemoveData();
        //viewData();

    }public void AddData(){
      add.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent=new Intent(Actions.this,addcar.class);
              startActivity(intent);
          }
      });
    }
    public void Updatedata(){
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Actions.this,update.class);
                startActivity(intent);
            }
        });
    }
    public void RemoveData(){
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Actions.this,delete.class);
                startActivity(intent);
            }
        });
    }
/*public void viewData(){

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Cursor res= myDb.getAllData();
            if(res.getCount()==0){
                showMessage("ERROR","NOTHING FOUND");
                return;
            }
            StringBuffer buffer=new StringBuffer();
            while (res.moveToNext()) {
                buffer.append("Id"+res.getString(0)+"\n");
                buffer.append("Name"+res.getString(1)+"\n");
                buffer.append("CONTACT"+res.getString(2)+"\n");
                buffer.append("TO"+res.getString(3)+"\n");
                buffer.append("FROM"+res.getString(4)+"\n");
                buffer.append("REG NO."+res.getString(5)+"\n");
            }
            showMessage("Data",buffer.toString());
        }
    });
}
public void showMessage(String title,String Message){
    AlertDialog.Builder builder=new AlertDialog.Builder(this);
    builder.setCancelable(true);
    builder.setTitle(title);
    builder.setMessage(Message);
    builder.show();

}*/
}
