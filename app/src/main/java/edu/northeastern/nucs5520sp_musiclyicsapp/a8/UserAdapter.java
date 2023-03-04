package edu.northeastern.nucs5520sp_musiclyicsapp.a8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import edu.northeastern.nucs5520sp_musiclyicsapp.R;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder>{
    private Context context;
    private List<User> userList;
    public UserAdapter(Context context){
        this.context = context;
        userList = new ArrayList<>();
    }

    public void add(User user){
        userList.add(user);
        notifyDataSetChanged();
    }

    public void clear(){
        userList.clear();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        User user = userList.get(position);
        holder.name.setText(user.getUsername());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.userName);
        }
    }
}
