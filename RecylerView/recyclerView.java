public class recyclerview extends AppCompatActivity {
RecyclerView RV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        RV= findViewById(R.id.RV);
        RV.setLayoutManager(new LinearLayoutManager(this));

        String data[] = {"12", "zyz", "saa", "wqe", "aqe", "ffg", "aggsbc", "fsfs", "asfsfbc", "absfsfc"};
        RV.setAdapter(new myAdapter(data));
    }
}