package com.whoisyuan.itto;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

public class ITTOActivity extends Activity {

    private static final int TYPE_IO = 1;
    private static final int TYPE_TT = 2;

    private ListView listView;
    private ittoListAdapter iAdapter;
    private ArrayList<ITTOBean> ittoList;
    private int currentType;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itto);

        ittoList = new ArrayList<ITTOBean>();
        currentType = TYPE_IO;

        listView = (ListView)findViewById(R.id.list);
        iAdapter = new ittoListAdapter(this, R.layout.row_list_item, ittoList);
        listView.setAdapter(iAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ITTOActivity.this, RelateActivity.class);
                ITTOBean bean = ittoList.get(position);
                i.putExtra("index", DATA.ittoFullList.indexOf(bean.id));
                startActivity(i);
            }
        });

        refreshITTOList(currentType);
    }

    public void toIO(View v) {
        currentType = TYPE_IO;
        refreshITTOList(currentType);
    }

    public void toTT(View v) {
        currentType = TYPE_TT;
        refreshITTOList(currentType);
    }

    private void refreshITTOList(int type) {
        ittoList.clear();
        if (type == TYPE_IO) {
            for (DATA.ITTO i : ITTOList.ioList) {
                ittoList.add(new ITTOBean(TYPE_IO, i, getResources().getString(DATA.ittoMap.get(i))));
            }
        } else {
            for (DATA.ITTO t : ITTOList.ttList) {
                ittoList.add(new ITTOBean(TYPE_IO, t, getResources().getString(DATA.ittoMap.get(t))));
            }
        }
        iAdapter.notifyDataSetChanged();
        setTitle(type == TYPE_IO ? getResources().getString(R.string.all_io) : getResources().getString(R.string.all_tt));
    }

    public class ITTOBean {
        public int type;
        public DATA.ITTO id;
        public String content;

        ITTOBean(int type, DATA.ITTO id, String content) {
            this.type = type;
            this.id = id;
            this.content = content;
        }
    }

    public class ittoListAdapter extends ArrayAdapter<ITTOBean> {
        private LayoutInflater inflater;

        public ittoListAdapter(Context context, int textViewResourceId, List<ITTOBean> objects) {
            super(context, textViewResourceId, objects);
            inflater = LayoutInflater.from(context);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            ITTOBean itto = getItem(position);

            if (convertView == null) {
                holder = new ViewHolder();
                convertView = inflater.inflate(R.layout.row_list_item, parent, false);
                holder.tv_item = (TextView)convertView.findViewById(R.id.list_item);
                holder.tv_title = (TextView)convertView.findViewById(R.id.list_title);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder)convertView.getTag();
            }

            holder.tv_item.setText(itto.content);
            holder.tv_title.setVisibility(View.GONE);

            return convertView;
        }

        public class ViewHolder {
            TextView tv_item;
            TextView tv_title;
        }
    }
}