package com.whoisyuan.itto;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RelateActivity extends Activity {

    public static final int TYPE_IN  = 1;
    public static final int TYPE_OUT = 2;
    public static final int TYPE_TT  = 3;

    private ListView listView;
    private RelateListAdapter iAdapter;
    private ArrayList<ProcessBean> relateProcessList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relate);

        ArrayList<ProcessBean> inputList = new ArrayList<ProcessBean>();
        ArrayList<ProcessBean> outputList = new ArrayList<ProcessBean>();
        ArrayList<ProcessBean> ttList = new ArrayList<ProcessBean>();
        relateProcessList = new ArrayList<ProcessBean>();

        Intent intent = getIntent();
        int index = intent.getIntExtra("index", 0);
        DATA.ITTO ittoItem = DATA.ittoFullList.get(index);
        for (Process p : ProcessList.getList()) {
            if (p.isInput(ittoItem)) {
                inputList.add(new ProcessBean(p.getProcess(), getResources().getString(p.getName()), TYPE_IN));
            } else if (p.isOutput(ittoItem)) {
                outputList.add(new ProcessBean(p.getProcess(), getResources().getString(p.getName()), TYPE_OUT));
            } else if (p.isTT(ittoItem)) {
                ttList.add(new ProcessBean(p.getProcess(), getResources().getString(p.getName()), TYPE_TT));
            }
        }

        relateProcessList.addAll(inputList);
        relateProcessList.addAll(outputList);
        relateProcessList.addAll(ttList);

        listView = (ListView)findViewById(R.id.list);
        iAdapter = new RelateListAdapter(this, R.layout.row_list_item, relateProcessList);
        listView.setAdapter(iAdapter);

        setTitle(getResources().getString(DATA.ittoMap.get(ittoItem)));
    }

    public class ProcessBean {
        public Process.PROCESS process;
        public String content;
        public int type;

        ProcessBean(Process.PROCESS process, String content, int type) {
            this.type = type;
            this.process = process;
            this.content = content;
        }
    }

    public class RelateListAdapter extends ArrayAdapter<ProcessBean> {
        private LayoutInflater inflater;

        public RelateListAdapter(Context context, int textViewResourceId, List<ProcessBean> objects) {
            super(context, textViewResourceId, objects);
            inflater = LayoutInflater.from(context);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            ProcessBean itto = getItem(position);

            if (convertView == null) {
                holder = new ViewHolder();
                convertView = inflater.inflate(R.layout.row_list_item, parent, false);
                holder.tv_item = (TextView)convertView.findViewById(R.id.list_item);
                holder.tv_title = (TextView)convertView.findViewById(R.id.list_title);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder)convertView.getTag();
            }

            Process process = ProcessList.getProcess(itto.process);
            int kid = process.getkID();
            int pid = process.getpID();
            holder.tv_item.setText(kid + "." + pid + " " + itto.content);
            if (position == 0 || itto.type != getItem(position - 1).type) {
                if (itto.type == TYPE_IN) {
                    holder.tv_title.setVisibility(View.VISIBLE);
                    holder.tv_title.setText(R.string.as_input);
                } else if (itto.type == TYPE_OUT) {
                    holder.tv_title.setVisibility(View.VISIBLE);
                    holder.tv_title.setText(R.string.as_output);
                } else if (itto.type == TYPE_TT) {
                    holder.tv_title.setVisibility(View.VISIBLE);
                    holder.tv_title.setText(R.string.as_tt);
                } else {
                    holder.tv_title.setVisibility(View.GONE);
                }
            } else {
                holder.tv_title.setVisibility(View.GONE);
            }

            return convertView;
        }

        public class ViewHolder {
            TextView tv_item;
            TextView tv_title;
        }
    }
}