package com.example.nicholas.fuckingtabsmite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nicholas on 7/20/2016.
 */
    public class ListViewAdapter extends BaseAdapter {


    private ArrayList<eventInfo> events;
    private LayoutInflater inflater;

    public class ViewHolder {
        TextView eventTitleTextView;
        TextView eventTurnUpsTextView;
        TextView eventDateTextView;
        TextView eventTimeTextView;
    }

    public ListViewAdapter (Context context, ArrayList<eventInfo> events){
        inflater = LayoutInflater.from(context);
        this.events = events;
    }

    public int getCount(){
        return events.size();
    }

    @Override
    public eventInfo getItem(int position) {
        return events.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if(convertView == null){
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.active_tab, null);

            holder.eventTitleTextView = (TextView) convertView.findViewById(R.id.eventTitle);
            holder.eventTurnUpsTextView = (TextView) convertView.findViewById(R.id.eventTurnUps);
            holder.eventDateTextView = (TextView) convertView.findViewById(R.id.eventDate);
            holder.eventTimeTextView = (TextView) convertView.findViewById(R.id.eventTime);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.eventTitleTextView.setText(events.get(position).getEventTitle());
        holder.eventTurnUpsTextView.setText(events.get(position).getTurnUps());
        holder.eventDateTextView.setText(events.get(position).getDate());
        holder.eventTimeTextView.setText(events.get(position).getTime());


        return convertView;
    }
}