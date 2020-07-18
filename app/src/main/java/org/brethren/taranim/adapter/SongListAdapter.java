package org.brethren.taranim.adapter;

import java.util.ArrayList;

import org.brethren.taranim.model.Song;
import org.brethren.taranim.view.SongListItem;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.brethren.taranim.R;

public class SongListAdapter extends BaseAdapter{
	
	private ArrayList<Song> songs;
	private Context context;
	
	public SongListAdapter(ArrayList<Song> songs, Context context) {
		super();
		this.songs = songs;
		this.context = context;
	}

	public Context getContext() {
		return context;
	}
	
	public void setContext(Context context) {
		this.context = context;
	}
	
	@Override
	public int getCount() {
		return songs.size();
	}

	@Override
	public Song getItem(int position) {
		return (null == songs) ? null : songs.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		SongListItem tli;
		if (null == convertView) {
			tli = (SongListItem) View.inflate(context, R.layout.song_list_item, null);
		} else {
			tli = (SongListItem) convertView;
		}

		if (position % 2 == 1)
			tli.setBackgroundColor(Color.WHITE);
		else
			tli.setBackgroundColor(Color.LTGRAY);

		tli.setSong(songs.get(position));
		return tli;
	}
}
