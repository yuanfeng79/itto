package com.whoisyuan.itto;

import java.util.ArrayList;

public class Process {
    // Process group
    public enum PROCESS_GROUP {
        INITIATING,
        PLANNING,
        EXECUTING,
        MONITORING_AND_CONTROLLING,
        CLOSING,
    }

    // Knowledge area
    public enum KNOWLEDGE_AREA {
        INTEGRATION,
        SCOPE,
        TIME,
        COST,
        QUALITY,
        HUMAN_RESOURCE,
        COMMUNICATIONS,
        RISK,
        PROCUREMENT,
        STAKEHOLDER
    }

    public enum PROCESS {
        DEVELOP_PROJECT_CHARTER,
        DEVELOP_PROJECT_MANAGEMENT_PLAN,
        DIRECT_AND_MANAGE_PROJECT_WORK,
        MONITOR_AND_CONTROL_PROJECT_WORK,
        PERFORM_INTEGRATED_CHANGE_CONTROL,
        CLOSE_PROJECT_OR_PHASE,

        PLAN_SCOPE_MANAGEMENT,
        COLLECT_REQUIREMENT,
        DEFINE_SCOPE,
        CREATE_WBS,
        VALIDATE_SCOPE,
        CONTROL_SCOPE,

        PLAN_SCHEDULE_MANAGEMENT,
        DEFINE_ACTIVITIES,
        SEQUENCE_ACTIVITIES,
        ESTIMATE_ACTIVITY_RESOURCES,
        ESTIMATE_ACTIVITY_DURATIONS,
        DEVELOP_SCHEDULE,
        CONTROL_SCHEDULE,

        PLAN_COST_MANAGEMENT,
        ESTIMATE_COSTS,
        DETERMINE_BUDGET,
        CONTROL_COST,

        PLAN_QUALITY_MANAGEMENT,
        PERFORM_QUALITY_ASSURANCE,
        CONTROL_QUALITY,

        PLAN_HUMAN_RESOURCE_MANAGEMENT,
        ACQUIRE_PROJECT_TEAM,
        DEVELOP_PROJECT_TEAM,
        MANAGE_PROJECT_TEAM,

        PLAN_COMMUNICATIONS_MANAGEMENT,
        MANAGE_COMMUNICATIONS,
        CONTROL_COMMUNICATIONS,

        PLAN_RISK_MANAGEMENT,
        IDENTIFY_RISKS,
        PERFORM_QUALITATIVE_RISK_ANALYSIS,
        PERFORM_QUANTITATIVE_RISK_ANALYSIS,
        PLAN_RISK_RESPONSES,
        CONTROL_RISKS,

        PLAN_PROCUREMENT_MANAGEMENT,
        CONDUCT_PROCUREMENTS,
        CONTROL_PROCUREMENTS,
        CLOSE_PROCUREMENTS,

        IDENTIFY_STAKEHOLDERS,
        PLAN_STAKEHOLDER_MANAGEMENT,
        MANAGE_STAKEHOLDER_ENGAGEMENT,
        CONTROL_STAKEHOLDER_ENGAGEMENT
    }

    private PROCESS_GROUP processGroup;
    private KNOWLEDGE_AREA knowledgeArea;
    private PROCESS process;
    private int kID;
    private int pID;
    private int nameRes;

    private ArrayList<DATA.ITTO> inputs;
    private ArrayList<DATA.ITTO> techAndTool;
    private ArrayList<DATA.ITTO> outputs;

    public Process(PROCESS_GROUP pg, KNOWLEDGE_AREA ka, PROCESS p, int kid, int pid) {
        processGroup = pg;
        knowledgeArea = ka;
        process = p;
        kID = kid;
        pID = pid;

        inputs = new ArrayList<DATA.ITTO>();
        outputs = new ArrayList<DATA.ITTO>();
        techAndTool = new ArrayList<DATA.ITTO>();
    }

    public void addInput(DATA.ITTO in) {
        inputs.add(in);
    }

    public void addOutput(DATA.ITTO out) {
        outputs.add(out);
    }

    public void addTechAndTool(DATA.ITTO tt) {
        techAndTool.add(tt);
    }

    public Process setName(int nameRes) {
        this.nameRes = nameRes;
        return this;
    }

    public int getName() {
        return nameRes;
    }

    public Process addInputList(ArrayList<DATA.ITTO> iList) {
        inputs = iList;
        return this;
    }

    public Process addOutputList(ArrayList<DATA.ITTO> oList) {
        outputs = oList;
        return this;
    }

    public Process addTechAndToolList(ArrayList<DATA.ITTO> tList) {
        techAndTool = tList;
        return this;
    }

    public boolean isInput(DATA.ITTO in) {
        for (DATA.ITTO i : inputs) {
            if (i.equals(in)) {
                return true;
            }
        }
        return false;
    }

    public boolean isOutput(DATA.ITTO out) {
        for (DATA.ITTO o : outputs) {
            if (o.equals(out)) {
                return true;
            }
        }
        return false;
    }

    public boolean isTT(DATA.ITTO tt) {
        for (DATA.ITTO t : techAndTool) {
            if (t.equals(tt)) {
                return true;
            }
        }
        return false;
    }

    public PROCESS getProcess() {
        return process;
    }

    public ArrayList<DATA.ITTO> getInputList() {
        return inputs;
    }

    public ArrayList<DATA.ITTO> getOutputList() {
        return outputs;
    }

    public ArrayList<DATA.ITTO> getTTList() {
        return techAndTool;
    }

    public int getkID() {return kID;}
    public int getpID() {return pID;}
}
