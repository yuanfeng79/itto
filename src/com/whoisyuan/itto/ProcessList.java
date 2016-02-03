package com.whoisyuan.itto;

import java.util.ArrayList;

public class ProcessList {

    private static ArrayList<Process> list = new ArrayList<Process>() {
        {
            // 4.1
            add(new Process(Process.PROCESS_GROUP.INITIATING, Process.KNOWLEDGE_AREA.INTEGRATION, Process.PROCESS.DEVELOP_PROJECT_CHARTER, 4, 1)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_STATEMENT_OF_WORK);
                            add(DATA.ITTO.BUSINESS_CASE);
                            add(DATA.ITTO.AGREEMENTS);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.FACILITATION_TECHNIQUES);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_CHARTER);
                        }
                    }).setName(R.string.p4_1_develop_project_charter)
            );
            // 4.2
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.INTEGRATION, Process.PROCESS.DEVELOP_PROJECT_MANAGEMENT_PLAN, 4, 2)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_CHARTER);
                            add(DATA.ITTO.OUTPUTS_FROM_OTHER_PROCESSES);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.FACILITATION_TECHNIQUES);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                        }
                    }).setName(R.string.p4_2_develop_project_management_plan)
            );
            // 4.3
            add(new Process(Process.PROCESS_GROUP.EXECUTING, Process.KNOWLEDGE_AREA.INTEGRATION, Process.PROCESS.DIRECT_AND_MANAGE_PROJECT_WORK, 4, 3)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.APPROVED_CHANGE_REQUESTS);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_INFORMATION_SYSTEM);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.DELIVERABLES);
                            add(DATA.ITTO.WORK_PERFORMANCE_DATA);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p4_3_direct_and_manage_project_work)
            );
            // 4.4
            add(new Process(Process.PROCESS_GROUP.MONITORING_AND_CONTROLLING, Process.KNOWLEDGE_AREA.INTEGRATION, Process.PROCESS.MONITOR_AND_CONTROL_PROJECT_WORK, 4, 4)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.SCHEDULE_FORECASTS);
                            add(DATA.ITTO.COST_FORECASTS);
                            add(DATA.ITTO.VALIDATED_CHANGES);
                            add(DATA.ITTO.WORK_PERFORMANCE_INFORMATION);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.ANALYTICAL_TECHNIQUES);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_INFORMATION_SYSTEM);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.WORK_PERFORMANCE_REPORTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p4_4_monitor_and_control_project_work)
            );
            // 4.5
            add(new Process(Process.PROCESS_GROUP.MONITORING_AND_CONTROLLING, Process.KNOWLEDGE_AREA.INTEGRATION, Process.PROCESS.PERFORM_INTEGRATED_CHANGE_CONTROL, 4, 5)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.WORK_PERFORMANCE_REPORTS);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.MEETINGS);
                            add(DATA.ITTO.CHANGE_CONTROL_TOOLS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.APPROVED_CHANGE_REQUESTS);
                            add(DATA.ITTO.CHANGE_LOG);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p4_5_perform_integrated_change_control)
            );
            // 4.6
            add(new Process(Process.PROCESS_GROUP.CLOSING, Process.KNOWLEDGE_AREA.INTEGRATION, Process.PROCESS.CLOSE_PROJECT_OR_PHASE, 4, 6)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.ACCEPTED_DELIVERABLES);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.ANALYTICAL_TECHNIQUES);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.FINAL_PRODUCT_SERVICE_OR_RESULT_TRANSITION);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p4_6_close_project_or_phase)
            );

            // 5.1
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.SCOPE, Process.PROCESS.PLAN_SCOPE_MANAGEMENT, 5, 1)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_CHARTER);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SCOPE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.REQUIREMENTS_MANAGEMENT_PLAN);
                        }
                    }).setName(R.string.p5_1_plan_scope_management)
            );
            // 5.2
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.SCOPE, Process.PROCESS.COLLECT_REQUIREMENT, 5, 2)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SCOPE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.REQUIREMENTS_MANAGEMENT_PLAN);
                            add(DATA.ITTO.STAKEHOLDER_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_CHARTER);
                            add(DATA.ITTO.STAKEHOLDER_REGISTER);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.INTERVIEWS);
                            add(DATA.ITTO.FOCUS_GROUPS);
                            add(DATA.ITTO.FACILIATED_WORKSHOPS);
                            add(DATA.ITTO.GROUP_CREATIVITY_TECHNIQUES);
                            add(DATA.ITTO.GROUP_DECISION_MAKING_TECHNIQUES);
                            add(DATA.ITTO.QUESTIONNAIRES_AND_SURVEYS);
                            add(DATA.ITTO.OBSERVATIONS);
                            add(DATA.ITTO.PROTOTYPES);
                            add(DATA.ITTO.BENCHMARKING);
                            add(DATA.ITTO.CONTEXT_DIAGRAMS);
                            add(DATA.ITTO.DOCUMENT_ANALYSIS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.REQUIREMENT_DOCUMENTATION);
                            add(DATA.ITTO.REQUIREMENTS_TRACEABILITY_MATRIX);
                        }
                    }).setName(R.string.p5_2_collect_requirements)
            );
            // 5.3
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.SCOPE, Process.PROCESS.DEFINE_SCOPE, 5, 3)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SCOPE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_CHARTER);
                            add(DATA.ITTO.REQUIREMENT_DOCUMENTATION);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.PRODUCT_ANALYSIS);
                            add(DATA.ITTO.ALTERNATIVES_GENERATION);
                            add(DATA.ITTO.FACILIATED_WORKSHOPS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_SCOPE_STATEMENT);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p5_3_define_scope)
            );
            // 5.4
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.SCOPE, Process.PROCESS.CREATE_WBS, 5, 4)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SCOPE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_SCOPE_STATEMENT);
                            add(DATA.ITTO.REQUIREMENT_DOCUMENTATION);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.DECOMPOSITION);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SCOPE_BASELINE);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p5_4_create_wbs)
            );
            // 5.5
            add(new Process(Process.PROCESS_GROUP.MONITORING_AND_CONTROLLING, Process.KNOWLEDGE_AREA.SCOPE, Process.PROCESS.VALIDATE_SCOPE, 5, 5)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.REQUIREMENT_DOCUMENTATION);
                            add(DATA.ITTO.REQUIREMENTS_TRACEABILITY_MATRIX);
                            add(DATA.ITTO.VERIFIED_DELIVERABLES);
                            add(DATA.ITTO.WORK_PERFORMANCE_DATA);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.INSPECTION);
                            add(DATA.ITTO.GROUP_DECISION_MAKING_TECHNIQUES);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.ACCEPTED_DELIVERABLES);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.WORK_PERFORMANCE_INFORMATION);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p5_5_validate_scope)
            );
            // 5.6
            add(new Process(Process.PROCESS_GROUP.MONITORING_AND_CONTROLLING, Process.KNOWLEDGE_AREA.SCOPE, Process.PROCESS.CONTROL_SCOPE, 5, 6)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.REQUIREMENT_DOCUMENTATION);
                            add(DATA.ITTO.REQUIREMENTS_TRACEABILITY_MATRIX);
                            add(DATA.ITTO.WORK_PERFORMANCE_DATA);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.VARIANCE_ANALYSIS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.WORK_PERFORMANCE_INFORMATION);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p5_6_constrol_scope)
            );

            // 6.1
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.TIME, Process.PROCESS.PLAN_SCHEDULE_MANAGEMENT, 6, 1)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_CHARTER);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.ANALYTICAL_TECHNIQUES);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SCHEDULE_MANAGEMENT_PLAN);

                        }
                    }).setName(R.string.p6_1_plan_schedule_management)
            );
            // 6.2
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.TIME, Process.PROCESS.DEFINE_ACTIVITIES, 6, 2)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SCHEDULE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.SCOPE_BASELINE);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.DECOMPOSITION);
                            add(DATA.ITTO.ROLLING_WAVE_PLANNING);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.ACTIVITY_LIST);
                            add(DATA.ITTO.ACTIVITY_ATTRIBUTES);
                            add(DATA.ITTO.MILESTONE_LIST);
                        }
                    }).setName(R.string.p6_2_define_activities)
            );
            // 6.3
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.TIME, Process.PROCESS.SEQUENCE_ACTIVITIES, 6, 3)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SCHEDULE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.ACTIVITY_LIST);
                            add(DATA.ITTO.ACTIVITY_ATTRIBUTES);
                            add(DATA.ITTO.MILESTONE_LIST);
                            add(DATA.ITTO.PROJECT_SCOPE_STATEMENT);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PRECEDENCE_DIAGRAMMING_METHOD);
                            add(DATA.ITTO.DEPENDENCY_DETERMINATION);
                            add(DATA.ITTO.LEADS_AND_LAGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_SCHEDULE_NETWORK_DIAGRAM);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p6_3_sequence_activities)
            );
            // 6.4
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.TIME, Process.PROCESS.ESTIMATE_ACTIVITY_RESOURCES, 6, 4)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SCHEDULE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.ACTIVITY_LIST);
                            add(DATA.ITTO.ACTIVITY_ATTRIBUTES);
                            add(DATA.ITTO.RESOURCE_CALENDAR);
                            add(DATA.ITTO.RISK_REGISTER);
                            add(DATA.ITTO.ACTIVITY_COST_ESTIMATES);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.ALTERNATIVE_ANALYSIS);
                            add(DATA.ITTO.PUBLISHED_ESTIMATING_DATA);
                            add(DATA.ITTO.BOTTOM_UP_ESTIMATING);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_SOFTWARE);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.ACTIVITY_RESOURCE_REQUIREMENTS);
                            add(DATA.ITTO.RESOURCE_BREAKDOWN_STRUCTURE);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p6_4_estimate_activity_resources)
            );
            // 6.5
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.TIME, Process.PROCESS.ESTIMATE_ACTIVITY_DURATIONS, 6, 5)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SCHEDULE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.ACTIVITY_LIST);
                            add(DATA.ITTO.ACTIVITY_ATTRIBUTES);
                            add(DATA.ITTO.ACTIVITY_RESOURCE_REQUIREMENTS);
                            add(DATA.ITTO.RESOURCE_CALENDAR);
                            add(DATA.ITTO.PROJECT_SCOPE_STATEMENT);
                            add(DATA.ITTO.RISK_REGISTER);
                            add(DATA.ITTO.RESOURCE_BREAKDOWN_STRUCTURE);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.ANALOGOUS_ESTIMATING);
                            add(DATA.ITTO.PARAMETRIC_ESTIMATING);
                            add(DATA.ITTO.THREE_POINT_ESTIMATING);
                            add(DATA.ITTO.GROUP_DECISION_MAKING_TECHNIQUES);
                            add(DATA.ITTO.RESERVE_ANALYSIS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.ACTIVITY_DURATION_ESTIMATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p6_5_estimate_activity_durations)
            );
            // 6.6
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.TIME, Process.PROCESS.DEVELOP_SCHEDULE, 6, 6)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SCHEDULE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.ACTIVITY_LIST);
                            add(DATA.ITTO.ACTIVITY_ATTRIBUTES);
                            add(DATA.ITTO.PROJECT_SCHEDULE_NETWORK_DIAGRAM);
                            add(DATA.ITTO.ACTIVITY_RESOURCE_REQUIREMENTS);
                            add(DATA.ITTO.RESOURCE_CALENDAR);
                            add(DATA.ITTO.ACTIVITY_DURATION_ESTIMATES);
                            add(DATA.ITTO.PROJECT_SCOPE_STATEMENT);
                            add(DATA.ITTO.RISK_REGISTER);
                            add(DATA.ITTO.PROJECT_STAFF_ASSIGNMENTS);
                            add(DATA.ITTO.RESOURCE_BREAKDOWN_STRUCTURE);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SCHEDULE_NETWORK_ANALYSIS);
                            add(DATA.ITTO.CRITICAL_PATH_METHOD);
                            add(DATA.ITTO.CRITICAL_CHAIN_METHOD);
                            add(DATA.ITTO.RESOURCE_OPTIMIZATION_TECHNIQUES);
                            add(DATA.ITTO.MODELING_TECHNIQUES);
                            add(DATA.ITTO.LEADS_AND_LAGS);
                            add(DATA.ITTO.SCHEDULE_COMPRESSING);
                            add(DATA.ITTO.SCHEDULING_TOOL);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SCHEDULE_BASELINE);
                            add(DATA.ITTO.PROJECT_SCHEDULE);
                            add(DATA.ITTO.SCHEDULE_DATA);
                            add(DATA.ITTO.PROJECT_CALENDAR);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p6_6_develop_schedule)
            );
            // 6.7
            add(new Process(Process.PROCESS_GROUP.MONITORING_AND_CONTROLLING, Process.KNOWLEDGE_AREA.TIME, Process.PROCESS.CONTROL_SCHEDULE, 6, 7)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_SCHEDULE);
                            add(DATA.ITTO.WORK_PERFORMANCE_DATA);
                            add(DATA.ITTO.PROJECT_CALENDAR);
                            add(DATA.ITTO.SCHEDULE_DATA);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PERFORMANCE_REVIEWS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_SOFTWARE);
                            add(DATA.ITTO.RESOURCE_OPTIMIZATION_TECHNIQUES);
                            add(DATA.ITTO.MODELING_TECHNIQUES);
                            add(DATA.ITTO.LEADS_AND_LAGS);
                            add(DATA.ITTO.SCHEDULE_COMPRESSING);
                            add(DATA.ITTO.SCHEDULING_TOOL);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.WORK_PERFORMANCE_INFORMATION);
                            add(DATA.ITTO.SCHEDULE_FORECASTS);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p6_7_control_schedule)
            );

            // 7.1
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.COST, Process.PROCESS.PLAN_COST_MANAGEMENT, 7, 1)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_CHARTER);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.ANALYTICAL_TECHNIQUES);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.COST_MANAGEMENT_PLAN);

                        }
                    }).setName(R.string.p7_1_plan_cost_management)
            );
            // 7.2
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.COST, Process.PROCESS.ESTIMATE_COSTS, 7, 2)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.COST_MANAGEMENT_PLAN);
                            add(DATA.ITTO.HUMAN_RESOURCE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.SCOPE_BASELINE);
                            add(DATA.ITTO.PROJECT_SCHEDULE);
                            add(DATA.ITTO.RISK_REGISTER);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.ANALOGOUS_ESTIMATING);
                            add(DATA.ITTO.PARAMETRIC_ESTIMATING);
                            add(DATA.ITTO.BOTTOM_UP_ESTIMATING);
                            add(DATA.ITTO.THREE_POINT_ESTIMATING);
                            add(DATA.ITTO.RESERVE_ANALYSIS);
                            add(DATA.ITTO.COST_OF_QUALITY);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_SOFTWARE);
                            add(DATA.ITTO.VENDOR_BID_ANALYSIS);
                            add(DATA.ITTO.GROUP_DECISION_MAKING_TECHNIQUES);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.ACTIVITY_COST_ESTIMATES);
                            add(DATA.ITTO.BASIS_OF_ESTIMATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p7_2_estimate_costs)
            );
            // 7.3
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.COST, Process.PROCESS.DETERMINE_BUDGET, 7, 3)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.COST_MANAGEMENT_PLAN);
                            add(DATA.ITTO.SCOPE_BASELINE);
                            add(DATA.ITTO.ACTIVITY_COST_ESTIMATES);
                            add(DATA.ITTO.BASIS_OF_ESTIMATES);
                            add(DATA.ITTO.PROJECT_SCHEDULE);
                            add(DATA.ITTO.RESOURCE_CALENDAR);
                            add(DATA.ITTO.RISK_REGISTER);
                            add(DATA.ITTO.AGREEMENTS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.COST_AGGREGATION);
                            add(DATA.ITTO.RESERVE_ANALYSIS);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.HISTORICAL_RELATIONSHIPS);
                            add(DATA.ITTO.FUNDING_LIMIT_RECONCILIATION);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.COST_BASELINE);
                            add(DATA.ITTO.PROJECT_FUNDING_REQUIREMENTS);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p7_3_determine_budget)
            );
            // 7.4
            add(new Process(Process.PROCESS_GROUP.MONITORING_AND_CONTROLLING, Process.KNOWLEDGE_AREA.COST, Process.PROCESS.CONTROL_COST, 7, 4)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_FUNDING_REQUIREMENTS);
                            add(DATA.ITTO.WORK_PERFORMANCE_DATA);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EARNED_VALUE_MANAGEMENT);
                            add(DATA.ITTO.FORECASTING);
                            add(DATA.ITTO.TO_COMPLETE_PERFORMANCE_INDEX);
                            add(DATA.ITTO.PERFORMANCE_REVIEWS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_SOFTWARE);
                            add(DATA.ITTO.RESERVE_ANALYSIS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.WORK_PERFORMANCE_INFORMATION);
                            add(DATA.ITTO.COST_FORECASTS);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p7_4_control_costs)
            );

            // 8.1
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.QUALITY, Process.PROCESS.PLAN_QUALITY_MANAGEMENT, 8, 1)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.STAKEHOLDER_REGISTER);
                            add(DATA.ITTO.RISK_REGISTER);
                            add(DATA.ITTO.REQUIREMENT_DOCUMENTATION);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.COST_BENEFIT_ANALYSIS);
                            add(DATA.ITTO.COST_OF_QUALITY);
                            add(DATA.ITTO.SEVEN_BASIC_QUALITY_TOOLS);
                            add(DATA.ITTO.BENCHMARKING);
                            add(DATA.ITTO.DESIGN_OF_EXPERIMENTS);
                            add(DATA.ITTO.STATISTICAL_SAMPLING);
                            add(DATA.ITTO.ADDITIONAL_QUALITY_PLANNING);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.QUALITY_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROCESS_IMPROVEMENT_PLAN);
                            add(DATA.ITTO.QUALITY_METRICS);
                            add(DATA.ITTO.QUALITY_CHECKLISTS);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p8_1_plan_quality_management)
            );
            // 8.2
            add(new Process(Process.PROCESS_GROUP.EXECUTING, Process.KNOWLEDGE_AREA.QUALITY, Process.PROCESS.PERFORM_QUALITY_ASSURANCE, 8, 2)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.QUALITY_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROCESS_IMPROVEMENT_PLAN);
                            add(DATA.ITTO.QUALITY_METRICS);
                            add(DATA.ITTO.QUALITY_CONTROL_MEASUREMENTS);
                            add(DATA.ITTO.PROJECT_DOCUMENTS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.QUALITY_MANAGEMENT_AND_CONTROL_TOOLS);
                            add(DATA.ITTO.QUALITY_AUDITS);
                            add(DATA.ITTO.PROCESS_ANALYSIS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p8_2_perform_quality_assurance)
            );
            // 8.3
            add(new Process(Process.PROCESS_GROUP.MONITORING_AND_CONTROLLING, Process.KNOWLEDGE_AREA.QUALITY, Process.PROCESS.CONTROL_QUALITY, 8, 3)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.QUALITY_METRICS);
                            add(DATA.ITTO.QUALITY_CHECKLISTS);
                            add(DATA.ITTO.WORK_PERFORMANCE_DATA);
                            add(DATA.ITTO.APPROVED_CHANGE_REQUESTS);
                            add(DATA.ITTO.DELIVERABLES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SEVEN_BASIC_QUALITY_TOOLS);
                            add(DATA.ITTO.STATISTICAL_SAMPLING);
                            add(DATA.ITTO.INSPECTION);
                            add(DATA.ITTO.APPROVED_CHANGE_REQUESTS_REVIEW);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.QUALITY_CONTROL_MEASUREMENTS);
                            add(DATA.ITTO.VALIDATED_CHANGES);
                            add(DATA.ITTO.VERIFIED_DELIVERABLES);
                            add(DATA.ITTO.WORK_PERFORMANCE_INFORMATION);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p8_3_control_quality)
            );

            // 9.1
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.HUMAN_RESOURCE, Process.PROCESS.PLAN_HUMAN_RESOURCE_MANAGEMENT, 9, 1)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.ACTIVITY_RESOURCE_REQUIREMENTS);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.ORGANIZATION_CHARTS_AND_POSITION_DESCRIPTIONS);
                            add(DATA.ITTO.NETWORKING);
                            add(DATA.ITTO.ORGANIZATION_THEORY);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.HUMAN_RESOURCE_MANAGEMENT_PLAN);

                        }
                    }).setName(R.string.p9_1_plan_human_resource_management)
            );
            // 9.2
            add(new Process(Process.PROCESS_GROUP.EXECUTING, Process.KNOWLEDGE_AREA.HUMAN_RESOURCE, Process.PROCESS.ACQUIRE_PROJECT_TEAM, 9, 2)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.HUMAN_RESOURCE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PRE_ASSIGNMENT);
                            add(DATA.ITTO.NEGOTIATION);
                            add(DATA.ITTO.ACQUISITION);
                            add(DATA.ITTO.VIRTUAL_TEAMS);
                            add(DATA.ITTO.MULTI_CRITERIA_DECISION_ANALYSIS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_STAFF_ASSIGNMENTS);
                            add(DATA.ITTO.RESOURCE_CALENDAR);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                        }
                    }).setName(R.string.p9_2_acquire_project_team)
            );
            // 9.3
            add(new Process(Process.PROCESS_GROUP.EXECUTING, Process.KNOWLEDGE_AREA.HUMAN_RESOURCE, Process.PROCESS.DEVELOP_PROJECT_TEAM, 9, 3)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.HUMAN_RESOURCE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_STAFF_ASSIGNMENTS);
                            add(DATA.ITTO.RESOURCE_CALENDAR);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.INTERPERSONAL_SKILLS);
                            add(DATA.ITTO.TRAINING);
                            add(DATA.ITTO.TEAM_BUILDING_ACTIVITIES);
                            add(DATA.ITTO.GROUND_RULES);
                            add(DATA.ITTO.COLOCATION);
                            add(DATA.ITTO.RECOGNITION_AND_REWARDS);
                            add(DATA.ITTO.PERSONNEL_ASSESSMENT_TOOLS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.TEAM_PERFORMANCED_ASSESSMENTS);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS_UPDATES);
                        }
                    }).setName(R.string.p9_3_develop_project_team)
            );
            // 9.4
            add(new Process(Process.PROCESS_GROUP.EXECUTING, Process.KNOWLEDGE_AREA.HUMAN_RESOURCE, Process.PROCESS.MANAGE_PROJECT_TEAM, 9, 4)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.HUMAN_RESOURCE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_STAFF_ASSIGNMENTS);
                            add(DATA.ITTO.TEAM_PERFORMANCED_ASSESSMENTS);
                            add(DATA.ITTO.ISSUE_LOG);
                            add(DATA.ITTO.WORK_PERFORMANCE_REPORTS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.OBSERVATION_AND_CONVERSATION);
                            add(DATA.ITTO.PROJECT_PERFORMANCE_APPRAISALS);
                            add(DATA.ITTO.CONFLICT_MANAGEMENT);
                            add(DATA.ITTO.INTERPERSONAL_SKILLS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS_UPDATES);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p9_4_manage_project_team)
            );

            // 10.1
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.COMMUNICATIONS, Process.PROCESS.PLAN_COMMUNICATIONS_MANAGEMENT, 10, 1)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.STAKEHOLDER_REGISTER);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.COMMUNICATION_REQUIREMENTS_ANALYSIS);
                            add(DATA.ITTO.COMMUNICATION_TECHNOLOGY);
                            add(DATA.ITTO.COMMUNICATION_MODELS);
                            add(DATA.ITTO.COMMUNICATION_METHODS);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.COMMUNICATIONS_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p10_1_plan_communications_management)
            );
            // 10.2
            add(new Process(Process.PROCESS_GROUP.EXECUTING, Process.KNOWLEDGE_AREA.COMMUNICATIONS, Process.PROCESS.MANAGE_COMMUNICATIONS, 10, 2)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.COMMUNICATIONS_MANAGEMENT_PLAN);
                            add(DATA.ITTO.WORK_PERFORMANCE_REPORTS);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.COMMUNICATION_TECHNOLOGY);
                            add(DATA.ITTO.COMMUNICATION_MODELS);
                            add(DATA.ITTO.COMMUNICATION_METHODS);
                            add(DATA.ITTO.INFORMATION_MANAGEMENT_SYSTEMS);
                            add(DATA.ITTO.PERFORMANCE_REPORTING);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_COMMUNICATIONS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p10_2_manage_communications)
            );
            // 10.3
            add(new Process(Process.PROCESS_GROUP.MONITORING_AND_CONTROLLING, Process.KNOWLEDGE_AREA.COMMUNICATIONS, Process.PROCESS.CONTROL_COMMUNICATIONS, 10, 3)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_COMMUNICATIONS);
                            add(DATA.ITTO.ISSUE_LOG);
                            add(DATA.ITTO.WORK_PERFORMANCE_DATA);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.INFORMATION_MANAGEMENT_SYSTEMS);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.WORK_PERFORMANCE_INFORMATION);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p10_3_control_communications)
            );

            // 11.1
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.RISK, Process.PROCESS.PLAN_RISK_MANAGEMENT, 11, 1)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_CHARTER);
                            add(DATA.ITTO.STAKEHOLDER_REGISTER);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.ANALYTICAL_TECHNIQUES);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.RISK_MANAGEMENT_PLAN);

                        }
                    }).setName(R.string.p11_1_plan_risk_management)
            );
            // 11,2
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.RISK, Process.PROCESS.IDENTIFY_RISKS, 11, 2)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.RISK_MANAGEMENT_PLAN);
                            add(DATA.ITTO.COST_MANAGEMENT_PLAN);
                            add(DATA.ITTO.SCHEDULE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.QUALITY_MANAGEMENT_PLAN);
                            add(DATA.ITTO.HUMAN_RESOURCE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.SCOPE_BASELINE);
                            add(DATA.ITTO.ACTIVITY_COST_ESTIMATES);
                            add(DATA.ITTO.ACTIVITY_DURATION_ESTIMATES);
                            add(DATA.ITTO.STAKEHOLDER_REGISTER);
                            add(DATA.ITTO.PROJECT_DOCUMENTS);
                            add(DATA.ITTO.PROCUREMENT_DOCUMENTS);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.DOCUMENTATION_REVIEWS);
                            add(DATA.ITTO.INFORMATION_GATHERING_TECHNIQUES);
                            add(DATA.ITTO.CHECKLIST_ANALYSIS);
                            add(DATA.ITTO.ASSUMPTIONS_ANALYSIS);
                            add(DATA.ITTO.DIAGRAMMING_TECHNIQUES);
                            add(DATA.ITTO.SWOT_ANALYSIS);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.RISK_REGISTER);

                        }
                    }).setName(R.string.p11_2_identify_risks)
            );
            // 11.3
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.RISK, Process.PROCESS.PERFORM_QUALITATIVE_RISK_ANALYSIS, 11, 3)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.RISK_MANAGEMENT_PLAN);
                            add(DATA.ITTO.SCOPE_BASELINE);
                            add(DATA.ITTO.RISK_REGISTER);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.RISK_PROBABILITY_AND_IMPACT_ASSESSMENT);
                            add(DATA.ITTO.PROBABILITY_AND_IMPACT_MATRIX);
                            add(DATA.ITTO.RISK_DATA_QUALITY_ASSESSMENT);
                            add(DATA.ITTO.RISK_CATEGORIZATION);
                            add(DATA.ITTO.RISK_URGENCY_ASSESSMENT);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);

                        }
                    }).setName(R.string.p11_3_perform_qualitative_risk_analysis)
            );
            // 11.4
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.RISK, Process.PROCESS.PERFORM_QUANTITATIVE_RISK_ANALYSIS, 11, 4)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.RISK_MANAGEMENT_PLAN);
                            add(DATA.ITTO.COST_MANAGEMENT_PLAN);
                            add(DATA.ITTO.SCHEDULE_MANAGEMENT_PLAN);
                            add(DATA.ITTO.RISK_REGISTER);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.DATA_GATHERING_AND_REPRESENTATION_TECHNIQUES);
                            add(DATA.ITTO.QUANTITATIVE_RISK_ANALYSIS_AND_MODELING_TECHNIQUES);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);

                        }
                    }).setName(R.string.p11_4_perform_quantitative_risk_analysis)
            );
            // 11.5
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.RISK, Process.PROCESS.PLAN_RISK_RESPONSES, 11, 5)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.RISK_MANAGEMENT_PLAN);
                            add(DATA.ITTO.RISK_REGISTER);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.STRATEGIES_FOR_NEGATIVE_RISKS_OR_THREATS);
                            add(DATA.ITTO.STRATEGIES_FOR_POSITIVE_RISKS_OR_OPPORTUNITIES);
                            add(DATA.ITTO.CONTINGENT_RESPONSE_STRATEGIES);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p11_5_plan_risk_resources)
            );
            // 11.6
            add(new Process(Process.PROCESS_GROUP.MONITORING_AND_CONTROLLING, Process.KNOWLEDGE_AREA.RISK, Process.PROCESS.CONTROL_RISKS, 11, 6)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.RISK_REGISTER);
                            add(DATA.ITTO.WORK_PERFORMANCE_DATA);
                            add(DATA.ITTO.WORK_PERFORMANCE_REPORTS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.RISK_REASSESSMENT);
                            add(DATA.ITTO.RISK_AUDITS);
                            add(DATA.ITTO.VARIANCE_AND_TREND_ANALYSIS);
                            add(DATA.ITTO.TECHNICAL_PERFORMANCE_MEASUREMENT);
                            add(DATA.ITTO.RESERVE_ANALYSIS);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.WORK_PERFORMANCE_INFORMATION);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p11_6_control_risks)
            );

            // 12.1
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.PROCUREMENT, Process.PROCESS.PLAN_PROCUREMENT_MANAGEMENT, 12, 1)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.REQUIREMENT_DOCUMENTATION);
                            add(DATA.ITTO.RISK_REGISTER);
                            add(DATA.ITTO.ACTIVITY_RESOURCE_REQUIREMENTS);
                            add(DATA.ITTO.PROJECT_SCHEDULE);
                            add(DATA.ITTO.ACTIVITY_COST_ESTIMATES);
                            add(DATA.ITTO.STAKEHOLDER_REGISTER);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.MAKE_OR_BUY_ANALYSIS);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.MARKET_RESEARCH);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROCUREMENT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROCUREMENT_STATEMENT_OF_WORK);
                            add(DATA.ITTO.PROCUREMENT_DOCUMENTS);
                            add(DATA.ITTO.SOURCE_SELECTION_CRITERIA);
                            add(DATA.ITTO.MAKE_OR_BUY_DECISIONS);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p12_1_plan_procurement_management)
            );
            // 12.2
            add(new Process(Process.PROCESS_GROUP.EXECUTING, Process.KNOWLEDGE_AREA.PROCUREMENT, Process.PROCESS.CONDUCT_PROCUREMENTS, 12, 2)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROCUREMENT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROCUREMENT_DOCUMENTS);
                            add(DATA.ITTO.SOURCE_SELECTION_CRITERIA);
                            add(DATA.ITTO.SELLER_PROPOSALS);
                            add(DATA.ITTO.PROJECT_DOCUMENTS);
                            add(DATA.ITTO.MAKE_OR_BUY_DECISIONS);
                            add(DATA.ITTO.PROCUREMENT_STATEMENT_OF_WORK);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.BIDDER_CONFERENCE);
                            add(DATA.ITTO.PROPOSAL_EVALUATION_TECHNIQUES);
                            add(DATA.ITTO.INDEPENDENT_ESTIMATES);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.ADVERTISING);
                            add(DATA.ITTO.ANALYTICAL_TECHNIQUES);
                            add(DATA.ITTO.PROCUREMENT_NEGOTIATIONS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.SELECTED_SELLERS);
                            add(DATA.ITTO.AGREEMENTS);
                            add(DATA.ITTO.RESOURCE_CALENDAR);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p12_2_conduct_procurements)
            );
            // 12.3
            add(new Process(Process.PROCESS_GROUP.MONITORING_AND_CONTROLLING, Process.KNOWLEDGE_AREA.PROCUREMENT, Process.PROCESS.CONTROL_PROCUREMENTS, 12, 3)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROCUREMENT_DOCUMENTS);
                            add(DATA.ITTO.AGREEMENTS);
                            add(DATA.ITTO.APPROVED_CHANGE_REQUESTS);
                            add(DATA.ITTO.WORK_PERFORMANCE_REPORTS);
                            add(DATA.ITTO.WORK_PERFORMANCE_DATA);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.CONTRACT_CHANGE_CONTROL_SYSTEM);
                            add(DATA.ITTO.PROCUREMENT_PERFORMANCE_REVIEWS);
                            add(DATA.ITTO.INSPECTIONS_AND_AUDITS);
                            add(DATA.ITTO.PERFORMANCE_REPORTING);
                            add(DATA.ITTO.PAYMENT_SYSTEM);
                            add(DATA.ITTO.CLAIM_ADMINISTRATION);
                            add(DATA.ITTO.RECORDS_MANAGEMENT_SYSTEM);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.WORK_PERFORMANCE_INFORMATION);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p12_3_control_procurements)
            );
            // 12.4
            add(new Process(Process.PROCESS_GROUP.CLOSING, Process.KNOWLEDGE_AREA.PROCUREMENT, Process.PROCESS.CLOSE_PROCUREMENTS, 12, 4)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROCUREMENT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROCUREMENT_DOCUMENTS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROCUREMENT_AUDITS);
                            add(DATA.ITTO.PROCUREMENT_NEGOTIATIONS);
                            add(DATA.ITTO.RECORDS_MANAGEMENT_SYSTEM);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.CLOSED_PROCUREMENTS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p12_4_close_procurements)
            );

            // 13.1
            add(new Process(Process.PROCESS_GROUP.INITIATING, Process.KNOWLEDGE_AREA.STAKEHOLDER, Process.PROCESS.IDENTIFY_STAKEHOLDERS, 13, 1)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_CHARTER);
                            add(DATA.ITTO.PROCUREMENT_DOCUMENTS);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.STAKEHOLDER_ANALYSIS);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.STAKEHOLDER_REGISTER);

                        }
                    }).setName(R.string.p13_1_identify_stackholders)
            );
            // 13.2
            add(new Process(Process.PROCESS_GROUP.PLANNING, Process.KNOWLEDGE_AREA.STAKEHOLDER, Process.PROCESS.PLAN_STAKEHOLDER_MANAGEMENT, 13, 2)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.STAKEHOLDER_REGISTER);
                            add(DATA.ITTO.ENTERPRISE_ENVIRONMENTAL_FACTORS);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.MEETINGS);
                            add(DATA.ITTO.ANALYTICAL_TECHNIQUES);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.STAKEHOLDER_MANAGEMENT_PLAN);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                        }
                    }).setName(R.string.p13_2_plan_stackholder_management)
            );
            // 13.3
            add(new Process(Process.PROCESS_GROUP.EXECUTING, Process.KNOWLEDGE_AREA.STAKEHOLDER, Process.PROCESS.MANAGE_STAKEHOLDER_ENGAGEMENT, 13, 3)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.STAKEHOLDER_MANAGEMENT_PLAN);
                            add(DATA.ITTO.COMMUNICATIONS_MANAGEMENT_PLAN);
                            add(DATA.ITTO.CHANGE_LOG);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.COMMUNICATION_METHODS);
                            add(DATA.ITTO.INTERPERSONAL_SKILLS);
                            add(DATA.ITTO.MANAGEMENT_SKILLS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.ISSUE_LOG);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p13_3_manage_stackholder_engagement)
            );
            // 13.4
            add(new Process(Process.PROCESS_GROUP.MONITORING_AND_CONTROLLING, Process.KNOWLEDGE_AREA.STAKEHOLDER, Process.PROCESS.CONTROL_STAKEHOLDER_ENGAGEMENT, 13, 4)
                    .addInputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN);
                            add(DATA.ITTO.ISSUE_LOG);
                            add(DATA.ITTO.WORK_PERFORMANCE_DATA);
                            add(DATA.ITTO.PROJECT_DOCUMENTS);
                        }
                    })
                    .addTechAndToolList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.INFORMATION_MANAGEMENT_SYSTEMS);
                            add(DATA.ITTO.EXPERT_JUDGEMENT);
                            add(DATA.ITTO.MEETINGS);
                        }
                    })
                    .addOutputList(new ArrayList<DATA.ITTO>() {
                        {
                            add(DATA.ITTO.WORK_PERFORMANCE_INFORMATION);
                            add(DATA.ITTO.CHANGE_REQUESTS);
                            add(DATA.ITTO.PROJECT_MANAGEMENT_PLAN_UPDATES);
                            add(DATA.ITTO.PROJECT_DOCUMENTS_UPDATES);
                            add(DATA.ITTO.ORGANIZATIONAL_PROCESS_ASSETS_UPDATES);
                        }
                    }).setName(R.string.p13_4_control_stackholder_engagement)
            );
        }
    };

    public static ArrayList<Process> getList() {
        return list;
    }

    public static Process getProcess(Process.PROCESS pTag) {
        for (Process p : list) {
            if (p.getProcess().equals(pTag)) {
                return p;
            }
        }
        return null;
    }

    public static int getCurrentProcessIndex(Process.PROCESS pTag) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getProcess().equals(pTag)) {
                return i;
            }
        }
        return -1;
    }

    public static Process getPrevProcess(Process.PROCESS pTag) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getProcess().equals(pTag)) {
                if (i == 0) {
                    return null;
                } else {
                    return list.get(i - 1);
                }
            }
        }
        return null;
    }

    public static Process getPrevKnowledgeArea(Process.PROCESS pTag) {
        int currentKA = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getpID() == 1) {
                currentKA = list.get(i).getkID();
            }
            if (list.get(i).getProcess().equals(pTag)) {
                break;
            }
        }
        if (currentKA != 0) {
            if (currentKA == 4) {
                return null;
            } else {
                for (Process p : list) {
                    if (p.getkID() == currentKA - 1 && p.getpID() == 1) {
                        return p;
                    }
                }
            }
        }
        return null;
    }

    public static Process getNextProcess(Process.PROCESS pTag) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getProcess().equals(pTag)) {
                if (i == list.size() - 1) {
                    return null;
                } else {
                    return list.get(i + 1);
                }
            }
        }
        return null;
    }

    public static Process getNextKnowledgeArea(Process.PROCESS pTag) {
        boolean find = false;
        for (int i = 0; i < list.size(); i++) {
            if (find) {
                if (list.get(i).getpID() == 1) {
                    return list.get(i);
                }
            } else {
                if (list.get(i).getProcess().equals(pTag)) {
                    find = true;
                }
            }
        }
        return null;
    }
}
