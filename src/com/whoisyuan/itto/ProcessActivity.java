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

public class ProcessActivity extends Activity {

    public static final int ITTO_INPUT  = 1;
    public static final int ITTO_OUTPUT = 2;
    public static final int ITTO_TT     = 3;

    private ListView listView;
    private ittoListAdapter iAdapter;
    private ArrayList<ITTOBean> ittoList;
    private Process.PROCESS currentProcess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process);
        currentProcess = Process.PROCESS.DEVELOP_PROJECT_CHARTER;
        ittoList = getITTOList(currentProcess);

        listView = (ListView)findViewById(R.id.list);
        iAdapter = new ittoListAdapter(this, R.layout.row_list_item, ittoList);
        listView.setAdapter(iAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ProcessActivity.this, RelateActivity.class);
                ITTOBean bean = ittoList.get(position);
                i.putExtra("index", DATA.ittoFullList.indexOf(bean.id));
                startActivity(i);
            }
        });

        refreshProcess(currentProcess);
    }

    private ArrayList<ITTOBean> getITTOList(Process.PROCESS p) {
        ArrayList<ITTOBean> result = new ArrayList<ITTOBean>();
        Process process = ProcessList.getProcess(p);

        if (process != null) {
            ArrayList<DATA.ITTO> iList = process.getInputList();
            for (DATA.ITTO i : iList) {
                result.add(new ITTOBean(ITTO_INPUT, i, getResources().getString(DATA.ittoMap.get(i))));
            }

            ArrayList<DATA.ITTO> tList = process.getTTList();
            for (DATA.ITTO t : tList) {
                result.add(new ITTOBean(ITTO_TT, t, getResources().getString(DATA.ittoMap.get(t))));
            }

            ArrayList<DATA.ITTO> oList = process.getOutputList();
            for (DATA.ITTO o : oList) {
                result.add(new ITTOBean(ITTO_OUTPUT, o, getResources().getString(DATA.ittoMap.get(o))));
            }

            return result;
        } else {
            return null;
        }
    }

    private void refreshProcess(Process.PROCESS p) {
        ArrayList<ITTOBean> newITTOList = getITTOList(p);
        if (newITTOList != null) {
            ittoList.clear();
            for (ITTOBean i : newITTOList) {
                ittoList.add(i);
            }
            iAdapter.notifyDataSetChanged();
            Process process = ProcessList.getProcess(p);
            if (process != null) {
                setTitle(process.getkID() + "." + process.getpID() + " " + getResources().getString(process.getName()));
            }
        }
    }

    public void prevKnowledgeArea(View v) {
        Process process = ProcessList.getPrevKnowledgeArea(currentProcess);
        if (process != null) {
            refreshProcess(process.getProcess());
            currentProcess = process.getProcess();
        }
    }

    public void prevProcess(View v) {
        Process process = ProcessList.getPrevProcess(currentProcess);
        if (process != null) {
            refreshProcess(process.getProcess());
            currentProcess = process.getProcess();
        }
    }

    public void nextProcess(View v) {
        Process process = ProcessList.getNextProcess(currentProcess);
        if (process != null) {
            refreshProcess(process.getProcess());
            currentProcess = process.getProcess();
        }
    }

    public void nextKnowledgeArea(View v) {
        Process process = ProcessList.getNextKnowledgeArea(currentProcess);
        if (process != null) {
            refreshProcess(process.getProcess());
            currentProcess = process.getProcess();
        }
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
                holder.background = (RelativeLayout)convertView.findViewById(R.id.background);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder)convertView.getTag();
            }

            holder.tv_item.setText(itto.content);
            if (position == 0 || getItem(position - 1).type != itto.type) {
                holder.tv_title.setVisibility(View.VISIBLE);
            } else {
                holder.tv_title.setVisibility(View.GONE);
            }
            if (itto.type == ITTO_INPUT) {
                holder.background.setBackgroundColor(0xFF0000);
                holder.tv_title.setText(R.string.input_label);
            } else if (itto.type == ITTO_TT) {
                holder.background.setBackgroundColor(0x00FF00);
                holder.tv_title.setText(R.string.tech_and_tool_label);
            } else if (itto.type == ITTO_OUTPUT) {
                holder.background.setBackgroundColor(0x0000FF);
                holder.tv_title.setText(R.string.output_label);
            }

            return convertView;
        }

        public class ViewHolder {
            TextView tv_item;
            TextView tv_title;
            RelativeLayout background;
        }
    }
}