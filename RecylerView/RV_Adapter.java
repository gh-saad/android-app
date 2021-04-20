public class myAdapter extends RecyclerView.Adapter<myAdapter.holder> {
    String data[];
    public myAdapter(String[] data){
        this.data = data;
    }
    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View V= inflater.inflate(R.layout.postcard,parent,false);
        return new holder(V);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        holder.TV.setText(this.data[position]);
    }

    @Override
    public int getItemCount() {

        return data.length;
    }

    public class holder extends RecyclerView.ViewHolder {
        TextView TV;
        public holder(@NonNull View itemView) {
            super(itemView);
            TV=itemView.findViewById(R.id.textView3);
        }
    }
}